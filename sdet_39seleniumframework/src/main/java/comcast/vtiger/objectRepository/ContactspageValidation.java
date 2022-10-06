package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactspageValidation {
	
	public ContactspageValidation(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement actualheadname;
	
	
	
	
	
	public WebElement getActualheadname() {
		return actualheadname;
	}





	public String actualconactnname()
	{
		return  actualheadname.getText();
		
	}
	


}
