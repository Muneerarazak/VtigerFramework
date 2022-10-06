import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtility2.BaseClass;
import comcast.vtiger.genericUtility2.Excel_Utility;
import comcast.vtiger.genericUtility2.Java_Utility;
import comcast.vtiger.genericUtility2.WebDriver_Utility;
import comcast.vtiger.objectRepository.CreatenewLeadpage;
import comcast.vtiger.objectRepository.CreatingNewLead;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.LeadValidationpage;

public class LeadModuleTest  extends BaseClass{
	
	@Test
	
	public void leadmodule() throws Throwable
	{
		Java_Utility jlib=new Java_Utility();
		 Excel_Utility elib=new Excel_Utility();
		  WebDriver_Utility wlib=new WebDriver_Utility();
		 wlib.waitForPageToLoad(driver);
		 
		 HomePage home=new HomePage(driver);
		 
		 CreatingNewLead crlead=new CreatingNewLead(driver);
		CreatenewLeadpage leadl = crlead.leadcl(driver);
		wlib.select(leadl.getDropdownname(),1);
		
		  int ranNum=jlib.getRandomNum();

	       String lastname=elib.getDatatExcelsheet("Sheet1", 1, 1)+ranNum;
	       leadl.fillingformname(lastname);
	       
	       String companyname=elib.getDatatExcelsheet("Sheet1", 1, 0)+ranNum;
	       leadl.fillingformname2(companyname);
	    wlib.select(leadl.getLeadsourceselect() ,1);   
	    leadl.radiobutton();
	       
		leadl.savebut();
		
	LeadValidationpage actual=new LeadValidationpage(driver);
		   String realdata=actual.Validationlead();
		   Assert.assertEquals(realdata.contains(lastname),true);
		
		   home.Signoutmodule(driver);
		    driver.close();
		
		
	}

}
