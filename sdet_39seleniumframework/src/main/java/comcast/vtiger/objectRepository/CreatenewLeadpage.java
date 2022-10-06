package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewLeadpage {
	
	public  CreatenewLeadpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
@FindBy(name="salutationtype")
 private WebElement dropdownname;	


@FindBy(name="firstname")
private WebElement firstnametextfldf;

@FindBy(name="lastname")
private WebElement lastnametextfield;

@FindBy(name="company")
private WebElement companynametextfield;

@FindBy(id="designation")
private WebElement designationtitle;

@FindBy(name="leadsource")
private WebElement leadsourceselect;

@FindBy(xpath="//input[@value='T']")
private WebElement radiobtn;

@FindBy(name="button")
private WebElement savebutton;


public void fillingformname(String lname)
{
	//firstnametextfldf.sendKeys(fname);
	lastnametextfield.sendKeys(lname);
	//companynametextfield.sendKeys(compname);
	//designationtitle.sendKeys(designaname);
}

public void fillingformname2(String compname)
{
	companynametextfield.sendKeys(compname);
	
}

public void radiobutton()
{
	radiobtn.click();
}




public WebElement getLastnametextfield() {
	return lastnametextfield;
}

public WebElement getCompanynametextfield() {
	return companynametextfield;
}

public WebElement getDropdownname() {
	return dropdownname;
}



public WebElement getLeadsourceselect() {
	return leadsourceselect;
}

//public void namedrop()
//{
//	dropdownname.click();
//}

public void leadselect()
{
	leadsourceselect.click();
}

public void savebut()
{
	savebutton.click();
}

}
  
