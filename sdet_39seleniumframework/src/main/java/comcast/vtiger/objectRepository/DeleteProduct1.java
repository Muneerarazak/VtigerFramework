package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct1 {

	//initialization
	
		public DeleteProduct1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

				
          @FindBy(name="selected_id")
          private WebElement itemtobedelet;
          
		
		@FindBy(xpath="//a[text()='del'][1]")
		private WebElement delete;


			public WebElement getItemtobedelet() {
			return itemtobedelet;
		}


		public WebElement getDelete() {
			return delete;

		}
		
		//business logic
		/**
		 * 
		 * @author Muneera
		 */
		
		public void deletefuction()
		{
			
			itemtobedelet.click();
			
					
		}
		
		public void deletit()
		{
			delete.click();
		}
		
}
