package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
	
	//initialization
	
			public  Organizationpage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	
	}
			
	//decleration
			
			
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createOrganization;
	
	//getter
	
	public WebElement getCreateOrganization() {
		return createOrganization;
	}
	
	
	//business logic
	/**
	 * 
	 * @author Muneera
	 */
	
	public void Neworganization()
	{
		 
		createOrganization.click();
		
		
	}
	
	
			
}
