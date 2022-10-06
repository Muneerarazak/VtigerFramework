package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContacts {
	
	public CreateNewContacts(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="salutationtype")
	private WebElement initial;

	public WebElement getInitial() {
		return initial;
	}
	
	
	@FindBy(name="firstname")
	private WebElement fname;
	
	
	@FindBy(name="lastname")
	private WebElement lname;
	

@FindBy(xpath="(//img[@language='javascript'])[1]")	
private WebElement plusbutton;

  @FindBy(xpath="//a[text()='testyanthra623']")
  private WebElement organization;
  
  @FindBy(name="leadsource")
  private WebElement leadsource;
  
  
  
  @FindBy(xpath="//input[@title='Save [Alt+S]']")
  private WebElement savebut;

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getOrganization() {
	return organization;
}

public WebElement getLeadsource() {
	return leadsource;
}
  

public void fisrtnam(String name)
{
	fname.sendKeys(name);
}
   

  
  
	public void lastn(String contact)
	{
		lname.sendKeys(contact);
	}

	
	public void orgplus()
	{
		plusbutton.click();
	}


	public void orgname()
	{
		organization.click();		
	}

	
	public void save()
	{
		 savebut.click();
	}
}
