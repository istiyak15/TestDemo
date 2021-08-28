package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest_01 {

	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser 1", true);
	}
	
	@BeforeMethod
	public void loginApplication() {
		Reporter.log("login 1", true);
	}
	
	@Test(invocationCount=9 ,threadPoolSize=5)
	public void ParallelTest1() {
		Reporter.log("ParallelTest_01", true);
	}
	
	
	@AfterMethod
	public void logoutApplication() {
		Reporter.log("logout 1", true);
	}

	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser 1", true);
	}


	
}
