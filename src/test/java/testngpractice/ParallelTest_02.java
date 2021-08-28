package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest_02 {
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser 2", true);
	}
	
	@BeforeMethod
	public void loginApplication() {
		Reporter.log("login 2", true);
	}
	
	@Test
	public void ParallelTest2() {
		Reporter.log("ParallelTest_02", true);
	}
	
	@AfterMethod
	public void logoutApplication() {
		Reporter.log("logout 2", true);
	}

	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser 2", true);
	}


}
