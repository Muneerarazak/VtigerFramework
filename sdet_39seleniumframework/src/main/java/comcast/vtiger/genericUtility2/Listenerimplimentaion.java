package comcast.vtiger.genericUtility2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimplimentaion implements ITestListener{

	public void onTestStart(ITestResult result) {
		String testname =result.getMethod().getMethodName();
		System.out.println(testname+ "======== execute listner==============");
		  
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sDriver);
		File srcFile =edriver.getScreenshotAs(OutputType.FILE);
		
		try {
			
			File destFile= new File ("./photo/screenshot"+testname+".png");
			FileUtils.copyFile(srcFile, destFile);
			
		}
		
		catch (Throwable e)
		{
		e.printStackTrace();	
	    }
			
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	

	
	}


