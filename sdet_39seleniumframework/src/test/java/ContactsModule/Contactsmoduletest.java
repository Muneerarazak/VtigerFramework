package ContactsModule;

import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtility2.BaseClass;
import comcast.vtiger.genericUtility2.Excel_Utility;
import comcast.vtiger.genericUtility2.Java_Utility;
import comcast.vtiger.genericUtility2.WebDriver_Utility;
import comcast.vtiger.objectRepository.ContactModule;
import comcast.vtiger.objectRepository.ContactspageValidation;
import comcast.vtiger.objectRepository.CreateNewContacts;
import comcast.vtiger.objectRepository.HomePage;

public class Contactsmoduletest extends BaseClass {
	
	@Test
	public void contactsmoduletest() throws Throwable
	{
		
		Java_Utility jlib=new Java_Utility();
		 Excel_Utility elib=new Excel_Utility();
		  WebDriver_Utility wlib=new WebDriver_Utility();
		 wlib.waitForPageToLoad(driver);
		 HomePage home=new HomePage(driver);
	     home.contactsclick();
	     ContactModule cntm=new ContactModule(driver);
	     
	     CreateNewContacts creatcon = cntm.contact(driver);
		  
	     wlib.select(creatcon.getInitial(), 3);
		  int ranNum=jlib.getRandomNum();
		  		  	  
		  String fname=elib.getDatatExcelsheet("Sheet1", 1, 0)+ranNum;
		  
		  creatcon.fisrtnam(fname);
		  String lname=	elib.getDatatExcelsheet("Sheet1", 1, 1)+ranNum;
     	creatcon.lastn(lname);
	    	creatcon.orgplus();
	    	wlib.switchToWindow(driver, "Accounts&action");
	    	creatcon.orgname();
	    	
	    	wlib.switchToWindow(driver, "Contacts&action");
	
		wlib.select(creatcon.getLeadsource(),2);
		creatcon.save();
		
		ContactspageValidation realname=new ContactspageValidation(driver);
		String   testname =realname.actualconactnname();
		Assert.assertEquals(testname.contains(lname),true);
		
		home.Signoutmodule(driver);
	    driver.close();
	}

}
