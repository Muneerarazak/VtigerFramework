package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	
	//initialization
	
		public  CampaignPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//decleration
		

		@FindBy(xpath="//a[text()='More']")
		private WebElement  more;
		
		@FindBy(name="Campaigns")
		private WebElement Campaign;
		
		
		@FindBy(xpath="//img[@title='Create Campaign...']")
		private WebElement createCampaign;
		
		//getter
		

		public WebElement getMore() {
			return more;
		}
		
		public WebElement getCampaign() {
			return Campaign;
		
		}

		public WebElement getCreateCampaign() {
			return createCampaign;
		}
		
		//business logic
		
		public void NewCampaign()
		{
			more.click();
			Campaign.click();
			createCampaign.click();
		}
		


}
