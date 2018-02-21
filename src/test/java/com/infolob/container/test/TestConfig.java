package test.java.com.infolob.container.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import main.java.com.infolob.container.common.utilities.Constants;
import main.java.com.infolob.container.pages.LoginPage;

public class TestConfig {

	private WebDriver driver;
	
	
	
	public WebDriver getDriver() {
		//if(this.driver != null)
		return this.driver;
	}
	
	@BeforeSuite	
	public void setUp(){

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aseem\\Documents\\Chrome drivers\\Chrome 2.35\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.URL);
	

	}
	@AfterSuite
	public void tearDown()
	{
		
		driver.close();
	}
}
