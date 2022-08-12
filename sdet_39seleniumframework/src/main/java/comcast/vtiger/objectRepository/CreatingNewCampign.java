package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewCampign {
	
	//initialization
	
			public  CreatingNewCampign(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
	
	
	
	@FindBy(name="campaignname")
	private WebElement nameforcampaign;
	
	@FindBy(name="button")
	private WebElement savebutton;

	public WebElement getNameforcampaign() {
		return nameforcampaign;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	//businesslogic
	/**
	 * 
	 * 
	 * @param name
	 * @author Muneera
	 */
	
	public void newcampaign(String name)
	{
		nameforcampaign.sendKeys(name);
		
	}
	
	public void savebuttonclick()
	{
		savebutton.click();

}
}