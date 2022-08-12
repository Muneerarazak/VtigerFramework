package com.crm.Sdet.campaigns;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtility2.BaseClass;
import comcast.vtiger.genericUtility2.Excel_Utility;
import comcast.vtiger.genericUtility2.Java_Utility;
import comcast.vtiger.genericUtility2.WebDriver_Utility;
import comcast.vtiger.genericUtility2.propertyUtility;
import comcast.vtiger.objectRepository.CampaignPage;
import comcast.vtiger.objectRepository.CampaignValidation;
import comcast.vtiger.objectRepository.CampaignWithProduct;
import comcast.vtiger.objectRepository.CampwithProductvalidation;
import comcast.vtiger.objectRepository.CreatingNewCampign;
import comcast.vtiger.objectRepository.CreatingNewProduct;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;

public class Campignwithproduct11Test extends BaseClass{
	
	@Test(retryAnalyzer=comcast.vtiger.genericUtility2.RetryAnalyzer.class)

	
		public  void campandproduct() throws Throwable {
			 Java_Utility jlib=new Java_Utility();
			 Excel_Utility elib=new Excel_Utility();
			 WebDriver_Utility wlib=new WebDriver_Utility();
			 wlib.waitForPageToLoad(driver);
		 	 HomePage home=new HomePage(driver);
			  home.clickproductlink();
			   CreatingNewProduct newproduct=new CreatingNewProduct(driver);
			  newproduct.createproductbutton();
			  int ranNum=jlib.getRandomNum();
			 String prodName=elib.getDatatExcelsheet("producut",1,0)+ranNum;
 			 System.out.println(prodName);
			 newproduct.newproduct(prodName);
			 newproduct.savebutton();
			 //creating campaign
		    WebElement element = driver.findElement(By.xpath("//a[text()='More']"));
             wlib.mouseOverElement(driver, element);
     	     CampaignPage camppage=new CampaignPage(driver);
             camppage.NewCampaign();
             String campaignName=elib.getDatatExcelsheet("campaign",1,0)+ranNum;
	   		 System.out.println(campaignName);
			 CreatingNewCampign nameforcamp=new CreatingNewCampign(driver);
			 nameforcamp.newcampaign(campaignName);
			 CampaignWithProduct campandprod=new CampaignWithProduct(driver);
			campandprod.windowswitcpro();
			Thread.sleep(3000);
			//switch to child
				wlib.switchToWindow(driver, "Products&action");
				campandprod.plookuppage(prodName);
				campandprod.productsameas(driver, prodName);
				campandprod.productsearch();
				//switch back to paren
				wlib.switchToWindow(driver,  "Campaigns&action");
				nameforcamp.savebuttonclick();
				//assertion
				CampwithProductvalidation	campvalid=new CampwithProductvalidation(driver);
		    	String actualdata=campvalid.Campname();
			  Assert.assertEquals(actualdata.contains(campaignName), true);
			   home.Signoutmodule(driver);
			    driver.close();
				}
					
				}


