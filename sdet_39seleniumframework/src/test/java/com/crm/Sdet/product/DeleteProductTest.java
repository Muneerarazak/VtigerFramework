package com.crm.Sdet.product;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtility2.BaseClass;
import comcast.vtiger.genericUtility2.Excel_Utility;
import comcast.vtiger.genericUtility2.Java_Utility;
import comcast.vtiger.genericUtility2.WebDriver_Utility;
import comcast.vtiger.genericUtility2.propertyUtility;
import comcast.vtiger.objectRepository.DeleteProduct1;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DeleteProductTest extends BaseClass{
			@Test(groups={"regressionTest"})
	public  void  productDelete()throws Throwable {
		
		 Java_Utility jlib=new Java_Utility();
		 Excel_Utility elib=new Excel_Utility();
		 WebDriver_Utility wlib=new WebDriver_Utility();
		 wlib.waitForPageToLoad(driver);
		 HomePage home=new HomePage(driver);
          home.clickproductlink();
		 DeleteProduct1 deletit =new DeleteProduct1(driver);
		  deletit.deletefuction();
		  deletit.deletit();
	  	 wlib.switchToalertAndAccept(driver);
		  home.Signoutmodule(driver);
	driver.close();
	}

}
