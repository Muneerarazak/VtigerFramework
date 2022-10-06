package comcast.vtiger.genericUtility2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.Duration;

public class WebDriver_Utility {
	/**
	 * this method is used to wait for page to load before identifying any synchronized element in Data object model(dom) 
	 * @author Muneera
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
/**
 * after every action it will  wait for the next action to perform
 * @param driver
 * @author Muneera
 */
	
public void scriptTimeout(WebDriver driver)
{
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
}


/**
 * used to wait for element to be clickable in GUI and check for specific element IS  loaded & available in GUI
 * @param driver
 * @param Element
 * @author Muneera
 */

public void waitForElementToClickable(WebDriver driver,WebElement Element)

{
	WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.elementToBeClickable(Element));
}


/**
 * used to wait for element to be clickabel in GUI and check for specific element for every 500 milliseconds
 * customized wait
 * @param driver
 * @param element
 * @author Muneera
 * 
 */
//public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
//{
	//FluentWait wait=new FluentWait(driver);
	//wait.pollingEvery(Duration.ofSeconds(20));
	//wait.until(ExpectedConditions.elementToBeClickable(Element));
//}


/**
 * used to switch to any window based on window title
 * @param driver
 * @param PartalWindowTitle
*@author Muneera
 */

public void switchToWindow(WebDriver driver,String PartalWindowTitle)
 {
	 Set<String> allId = driver.getWindowHandles();
		
		Iterator<String> it=allId.iterator();
		
		while(it.hasNext())
		{
			String wid =it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains(PartalWindowTitle))
			{
				break;
			}
		}
 }

/**
 * used to switch to AlertWindow and accept (click on ok button)
 * @param driver
 * @author Muneera
 */

public void  switchToalertAndAccept(WebDriver driver)
{
	driver.switchTo().alert().accept();
	
}
/**
 * used to switch AlertWindow and Accept(click on cancel button)
 * @param driver
 * @author Muneera
 */


public void  switchToAlertAndDismiss(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
	
}

/**
 * used to switch to frame window based on index
 * @param driver
 * @param index
 * @author Muneera
  */
public void switchToFrame(WebDriver driver ,int index)
{
	driver.switchTo().frame(index);
}
 
/**
 * used to switch to frame window based on id or name attribute
 * @param driver
 * @param id_name_attribute
 * @author Muneera
 */
public void switchToFrame(WebDriver driver, String id_name_attribute)
{
	driver.switchTo().frame(id_name_attribute);
}

/**
 * used to select the value from the dropDown
 * @param element
 * @param index
 * @author Muneera
 */
public void select(WebElement element, int index)
{
	
	Select sel=new Select(element);
	sel.selectByIndex(index);
}
/**
  * used to select the value from the dropDown
  *@param element
  *@param text
  *@author Muneera 
 */

public void select(WebElement element, String text)
{
	
	Select sel=new Select(element);
	sel.deselectByVisibleText(text);
}
/**
*used to place mouse cursor on specified element
*@param element
*@param driver
*@author Muneera
*/
public void mouseOverElement(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}

/**
 * used to right click on specific element
 * @param driver
 * @param element
 * @author Muneera
 * 
 */
public void rightClickElement(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
}

/**
 * used to drag from one place and move to another place
 * @param driver
 * @param element1
 * @param element2
 * @author Muneera
 */

public void dragAndDrop(WebDriver driver,WebElement element1,WebElement element2)
{
	
	Actions act=new Actions(driver);
  act.dragAndDrop(element1, element2).perform();
	
}
/**
 * use to click the element twice
 * @param driver
 * @param element1
 * @param element2
 * @author Muneera
 */


public void dobliClick(WebDriver driver,WebElement element)
{
	
	Actions act=new Actions(driver);
    act.doubleClick(element);
	
}


public void scrollbar(WebDriver driver,int x,int y)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("windows,scrollBy("+x+","+y+")");
}

}