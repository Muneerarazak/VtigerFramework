package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignWithProduct {
	
	
	//initialization
	
			public CampaignWithProduct(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}

			//decleration
			
			
			@FindBy(xpath="//img[@title='Select']")
			private WebElement plusbutton;
			
			
			@FindBy(xpath="//input[@id='search_txt']")
			private WebElement productlookup;
			
		    @FindBy(name="search")
			private WebElement searchbutton;
			
			@FindBy(id="1")
			private WebElement selectingproduct;
			
			//getter method
			

		
		public WebElement getSelectingproduct() {
				return selectingproduct;
			}

			public WebElement getProductlookup() {
				return productlookup;
			}

			public WebElement getPlusbutton() {
				return plusbutton;
			}

				public WebElement getSerchbuttont() {
				return searchbutton;
			}
			
			
			//business logic
			
			
			public void windowswitcpro()
			{ 
				plusbutton.click();
			}
						
			public void plookuppage(String name)
			{ 
				
				productlookup.sendKeys(name);
				
			}
			public void productsearch()
			{
				 selectingproduct.click();
			}
			
		public void productsameas(WebDriver driver,String prodName)
			{
				searchbutton.click();
			   driver.findElement(By.xpath("//a[text()='"+prodName+"']"));
		}

	
}
