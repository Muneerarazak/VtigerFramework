
package com.crm.Sdet.campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
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
import comcast.vtiger.objectRepository.CreatingNewCampign;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;

public class CreateCampaignsTest extends BaseClass{
	
	@Test(retryAnalyzer=comcast.vtiger.genericUtility2.RetryAnalyzer.class)

	//@Test(groups={"regressionTest"})

	public  void campigncreate()throws Throwable {

		 Java_Utility jlib=new Java_Utility();
		 Excel_Utility elib=new Excel_Utility();
		  WebDriver_Utility wlib=new WebDriver_Utility();
		 wlib.waitForPageToLoad(driver);
		 HomePage home=new HomePage(driver);
		 WebElement more =driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[22]/a"));
		 wlib.mouseOverElement(driver, more);
		home.Campignmodule();
		CampaignPage camppage=new CampaignPage(driver);
		 camppage.NewCampaign();
		int ranNum=jlib.getRandomNum();
		String campname=elib.getDatatExcelsheet("campaign",1,0)+ranNum;
		System.out.println(campname);
		CreatingNewCampign nameforcamp=new CreatingNewCampign(driver);
		nameforcamp.newcampaign(campname);
		nameforcamp.savebuttonclick();
		CampaignValidation campvalid=new CampaignValidation(driver);
		String actualdata=campvalid.actualcampaignname();
		 Assert.assertEquals(actualdata.contains(campname), true);
	     home.Signoutmodule(driver);
		driver.close();
	}
}
