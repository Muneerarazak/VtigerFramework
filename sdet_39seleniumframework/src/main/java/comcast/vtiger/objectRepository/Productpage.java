package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	
	//initialization
	
		public  Productpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		//decleration
		@FindBy(xpath="//a[text()='Products'][1]")
		private WebElement product;
		
		
		
		//getter
		
		public WebElement getProduct() {
			return product;
		}
		
		
		
		
		//business logic
		/**
		 * 
		 * @author Muneera
		 */
		
		public void creatingproduct()
		{
			product.click();
			//createproduct.click();
			
		}
		
		
		

}
