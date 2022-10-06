package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
	//initialization
	

	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

		//decleration
	
	@FindBy(xpath="//a[text()='Organizations'][1]")
	private WebElement  Organization ;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement Contacts ;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[12]/a")
	private WebElement clickproductlink;
	
	@FindBy(xpath="//a[text()='More']")
	private WebElement  more;
	
	@FindBy(name="Campaigns")
	private WebElement Campaign;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;
	
	@FindBy(linkText="Sign Out")
	private WebElement SignOut;
	
	// getter method
	
  

public WebElement getOrganization() {
		return Organization;
	}

	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getProduct() {
		return clickproductlink;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getCampaign() {
		return Campaign;
	
	}
	
	
	 public WebElement getAdministrator() {
			return administrator;
		}
	 
	 

		public WebElement getSignOut() {
			return SignOut;

		}

	//business logic
	
		/**
		 * 
		 * 
		 * 
		 */
	public void organizationmodule()
	{
		Organization.click();
		
	}
	
	
	public void Campignmodule()
	{
		Campaign.click();
	}
	
	
	public void Moremodule()
	{
		more.click();
	}
   
	public void Signoutmodule(WebDriver driver)
    {
         
		Actions a=new Actions(driver);
		a.moveToElement(administrator).perform();;
	    SignOut.click();
		
}

	
    public void clickproductlink()
    {
		
		clickproductlink.click();
	}

		

  public void contactsclick()
  {
	  Contacts.click();
  }
	
	
}
	
	

