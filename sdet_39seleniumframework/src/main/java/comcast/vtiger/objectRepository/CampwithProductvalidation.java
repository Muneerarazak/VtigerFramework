package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampwithProductvalidation {
	public CampwithProductvalidation (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		}
	
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement campandprdoctname;

public WebElement getCampandprdoctname() {
	return campandprdoctname;
}


public String Campname()
{
	return campandprdoctname.getText();
}



     }
