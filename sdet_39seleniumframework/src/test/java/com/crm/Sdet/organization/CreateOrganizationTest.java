package com.crm.Sdet.organization;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.Properties;
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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtility2.BaseClass;
import comcast.vtiger.genericUtility2.Excel_Utility;
import comcast.vtiger.genericUtility2.Java_Utility;
import comcast.vtiger.genericUtility2.WebDriver_Utility;
import comcast.vtiger.genericUtility2.propertyUtility;
import comcast.vtiger.objectRepository.CreatingNewOrganizationPage;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LoginPage;
import comcast.vtiger.objectRepository.OrganizationValidation;
import comcast.vtiger.objectRepository.Organizationpage;

@Listeners(comcast.vtiger.genericUtility2.Listenerimplimentaion.class)

public class CreateOrganizationTest extends BaseClass {
	@Test(groups={"regressionTest"})

	public   void Organization() throws Throwable {
		
		 Java_Utility jlib=new Java_Utility();
		 Excel_Utility elib=new Excel_Utility();
		
		 WebDriver_Utility wlib=new WebDriver_Utility();
		 
		 wlib.waitForPageToLoad(driver);
 
		 HomePage home=new HomePage(driver);
		 home.organizationmodule();
		  Organizationpage neworganization=new Organizationpage(driver);
		  neworganization.Neworganization();
		int ranNum=jlib.getRandomNum();
		String orgname=elib.getDatatExcelsheet("organization", 1, 1)+ranNum;
			System.out.println(orgname);
			
			CreatingNewOrganizationPage orgpage=new CreatingNewOrganizationPage(driver);
			
			orgpage.Organizatinname(orgname);
			orgpage.savetheorg();
			
			
			OrganizationValidation actorgname=new OrganizationValidation(driver);
					String actualdata=actorgname.Validationorg();
			  Assert.assertEquals(actualdata.contains(orgname), true);

   
   	 
    home.Signoutmodule(driver);

	driver.close();
	}		
}


