package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//initialization
	
	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//decleration
	
	@FindBy(name="user_name")
	private WebElement UserNameTextfield;
	
	@FindBy(name="user_password")
	private WebElement UserPasswordText;
	
	@FindBy(id="submitButton")
	private WebElement SubmitButton;
	
	//utilization  by getter method
	
	public WebElement getUserNameTextfield() {
		return UserNameTextfield;
	}


	public WebElement getUserPasswordText() {
		return UserPasswordText;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	//business Logic
	/**
	 * is used for login to the app
	 * @param username
	 * @param password
	 * @author Muneera
	 */
	
	
	public void login(String username,String password)
	{
		
		 UserNameTextfield.sendKeys(username);
		 UserPasswordText.sendKeys(password);
		 SubmitButton.click();
		 
		 
	}
		
}
