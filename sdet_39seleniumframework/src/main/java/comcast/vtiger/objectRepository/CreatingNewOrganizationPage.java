package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage {
	
	//initialization
	
	public CreatingNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//decleration
	
	@FindBy(name="accountname")
	private WebElement Organizationname;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	
	
	
//getter
	
	public WebElement getSaveButton() {
		return SaveButton;
	}



	public WebElement getOrganizationname() {
		return Organizationname;
	}
//business logic
	/**
	 * 
	 * 
	 * @param name
	 * @author Muneera
	 */
	
	
	
	
	
	public void Organizatinname(String name)
	{
		Organizationname.sendKeys(name);
	}
	
	public void savetheorg()
	{
		SaveButton.click();
	}

    

}
