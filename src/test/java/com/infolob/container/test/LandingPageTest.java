package test.java.com.infolob.container.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import main.java.com.infolob.container.common.utilities.Constants;
import main.java.com.infolob.container.common.utilities.Logger;
import main.java.com.infolob.container.pages.LandingPage;
import main.java.com.infolob.container.pages.LoginPage;

public class LandingPageTest {
	private LandingPage landingPage;
	private LoginPage loginPage;
	private WebDriver driver;

	@BeforeSuite
	public void setUp(){

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aseem\\Documents\\Chrome drivers\\Chrome 2.35\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.URL);
		this.loginPage = new LoginPage(driver);


	}

	@Test 
	@Parameters({"username","password"})
	public void verifyElementPresentTest(String username, String password) throws InterruptedException {
		loginPage.login(username, password);
		Thread.sleep(5000);
		Logger.analyzeLog(driver);
		this.landingPage = new  LandingPage(driver);
		AssertJUnit.assertTrue(landingPage.validatePageElements());
	}	
	@AfterMethod
	public void endSession() throws InterruptedException
	{
		this.landingPage.logout();
		Thread.sleep(5000);
	}

	@AfterSuite
	public void tearDown()
	{
		
		driver.close();
	}
}
