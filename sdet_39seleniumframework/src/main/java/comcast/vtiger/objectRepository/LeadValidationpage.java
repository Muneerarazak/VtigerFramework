package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadValidationpage {
	
	public LeadValidationpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(className="dvHeaderText")
	private WebElement actualleadname;

	public WebElement getActualOrgname() {
		return actualleadname;
	}
	
	public String Validationlead()
	{
		return actualleadname.getText();
	}
	
	
	
	

}
