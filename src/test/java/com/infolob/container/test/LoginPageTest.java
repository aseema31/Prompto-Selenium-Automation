package test.java.com.infolob.container.test;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import main.java.com.infolob.container.common.utilities.Constants;
import main.java.com.infolob.container.pages.LoginPage;

public class LoginPageTest {
	private LoginPage loginpage;
	private WebDriver driver;

	@BeforeSuite	
	public void setUp(){

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aseem\\Documents\\Chrome drivers\\Chrome 2.35\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.URL);
		loginpage = new LoginPage(driver);

	}
	
	@BeforeTest
	public void initialize() {
		
	}
	@Test(priority=1)
	public void verifyElementPresentTest() throws InterruptedException {
		
		assertTrue(loginpage.validatePageElements());
	}
	
	@Parameters({"username","password"})
	@Test(priority =2, enabled = false)
	public void login(String username, String password) throws InterruptedException
	{
		loginpage.login(username,password);
		
	}
	
	

	@AfterSuite
	public void tearDown()
	{
		
		driver.close();
	}
}
