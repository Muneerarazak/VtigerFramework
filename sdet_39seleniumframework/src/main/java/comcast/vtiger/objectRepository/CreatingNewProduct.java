package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewProduct {
	
	


	public  CreatingNewProduct(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//decleration
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createproduct;

	
	
	@FindBy(name="productname")
	private WebElement productname;
	
	public WebElement getCreateproduct() {
		return createproduct;
	}

	@FindBy(name="button")
	private WebElement Save;
  
	//getter
	
	
	public WebElement getProductname() {
		return productname;
	}

	public WebElement getSave() {
		return Save;
	}
	
//business logic
	/**
	 * 
	 * @param name
	 * @author Muneera
	 */
	
	
public void createproductbutton()
	
	{
		createproduct.click();	
	}
	public void newproduct(String name)
	{
		 productname.sendKeys(name);
		 
	}
	
	
			
	public void savebutton()
	{
		Save.click();
	}

}
