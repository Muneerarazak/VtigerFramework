package comcast.vtiger.genericUtility2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import comcast.vtiger.objectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver sDriver;
	public WebDriver driver=null;
	 propertyUtility plib=new  propertyUtility();

	@BeforeSuite(groups={"smoketest","regressionTest"})
	public void BS()
	{
		System.out.println("Database connection");
		
	}
	@BeforeTest(groups={"smoketest","regressionTest"})
	public void BT()
	{
		System.out.println("Execute Script in Parallel");
    }
	
//@Parameters({"BROWSER"})

 @BeforeClass(groups={"smokeTest","regressionTest"})
 public void BC() throws Throwable
 {
		String Browser=plib.getPropertyKeyValue("browser");
	   if(Browser.equalsIgnoreCase("edge"))
	   {
	   
    	WebDriverManager.edgedriver().setup();
    	 driver=new EdgeDriver();
	   }
	   else 
		   if(Browser.equalsIgnoreCase("firefox"))
		   {
			   WebDriverManager.firefoxdriver().setup();
		    	 driver=new FirefoxDriver(); 
		   }
		   else
			   if(Browser.equalsIgnoreCase("chrome"))
			   {
				   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
			   }
			   else
			   {
			    	 driver=new ChromeDriver();
  
			   }
sDriver=driver;
 }


@BeforeMethod(groups={"smoketest","regressionTest"})
 public void BM() throws Throwable
{
	 System.out.println("LOGIN TO Application");
	 String Url=plib.getPropertyKeyValue("url");
	 String username=plib.getPropertyKeyValue("un");
	 String password=plib.getPropertyKeyValue("pwd");
	 driver.get(Url);
     LoginPage loginpage=new LoginPage(driver);
	 loginpage.login(username, password);
		
	
}

@AfterMethod(groups={"smoketest","regressionTest"})
public void AM()
{

	System.out.println("logout from application");
}

@AfterClass(groups={"smoketest","regressionTest"})
public void AC()
{
	System.out.println("CLOSING THE BROWSER");
}

@AfterTest(groups={"smoketest","regressionTest"})
public void AT()
{
	System.out.println("EXECUTE AFTER ALL TEST METHODS");
}


@AfterSuite(groups={"smoketest","regressionTest"})

public void AS()
{
	System.out.println("close the database connection");

}

}