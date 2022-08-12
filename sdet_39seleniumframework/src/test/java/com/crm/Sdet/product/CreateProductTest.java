package com.crm.Sdet.product;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtility2.BaseClass;
import comcast.vtiger.genericUtility2.Excel_Utility;
import comcast.vtiger.genericUtility2.Java_Utility;
import comcast.vtiger.genericUtility2.WebDriver_Utility;
import comcast.vtiger.genericUtility2.propertyUtility;
import comcast.vtiger.objectRepository.CreatingNewProduct;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;
import comcast.vtiger.objectRepository.ProductValidation;
import comcast.vtiger.objectRepository.Productpage;
@Listeners(comcast.vtiger.genericUtility2.Listenerimplimentaion.class)
public class CreateProductTest extends 	BaseClass {
	

	@Test(retryAnalyzer=comcast.vtiger.genericUtility2.RetryAnalyzer.class)

	public  void productCreate() throws Throwable, IOException {

		Java_Utility jlib=new Java_Utility();
		 
		Excel_Utility elib=new Excel_Utility();
			 
		 HomePage home=new HomePage(driver);
		 
		 home.clickproductlink();
			 		
		 CreatingNewProduct newproduct=new CreatingNewProduct(driver);
		 newproduct.createproductbutton();
			
		int ranNum=jlib.getRandomNum();
    
		String orgname=elib.getDatatExcelsheet("producut",1,0)+ranNum;
	
		System.out.println(orgname);
		
		newproduct.newproduct(orgname);
		
		newproduct.savebutton();
		  ProductValidation actualProductName = new ProductValidation(driver);
		  String actualProductData = actualProductName.actualProductName();
		  Assert.assertEquals(actualProductData.contains(orgname), true);
		 
    home.Signoutmodule(driver);
	
	driver.close();
	}

}
