package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLead {
	
	public CreatingNewLead(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(linkText="Leads")
private WebElement lead;

@FindBy(xpath="//img[@title='Create Lead...']")
private WebElement createnewlead;


public CreatenewLeadpage leadcl(WebDriver driver)
{
	lead.click();
	createnewlead.click();
	return new CreatenewLeadpage(driver);
}
	
	
	
	
	
}
