package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationValidation {
	
	public OrganizationValidation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className="dvHeaderText")
	private WebElement actualOrgname;

	public WebElement getActualOrgname() {
		return actualOrgname;
	}
	
	public String Validationorg()
	{
		return actualOrgname.getText();
	}
	
	
	

}
