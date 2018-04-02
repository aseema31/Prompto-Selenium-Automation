package test.java.com.infolob.container.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import main.java.com.infolob.container.bean.PlanBean;
import main.java.com.infolob.container.common.utilities.Constants;
import main.java.com.infolob.container.common.utilities.DataProvider;
import main.java.com.infolob.container.common.utilities.Logger;
import main.java.com.infolob.container.pages.LandingPage;
import main.java.com.infolob.container.pages.LeftMenuPlansPage;
import main.java.com.infolob.container.pages.LoginPage;
import main.java.com.infolob.container.pages.NewPlanPage;

public class LandingPageTest {
	private LandingPage landingPage;
	private LoginPage loginPage;
	private WebDriver driver;
	private LeftMenuPlansPage leftMenuPlansPage;
	private NewPlanPage newPlanPage;
	private PlanBean planBean;
	private DataProvider dataProvider;
	private String excelPath;

	@BeforeSuite
	public void setUp(){

		

	}
	
	@BeforeTest
	@Parameters({"username","password","driverPath", "excelPath"})
	public void initialize(String username, String password,String driverPath,String excelPath)
	{
		this.excelPath = excelPath;
		System.setProperty("webdriver.chrome.driver",driverPath);
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.URL);
		this.loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test 
	public void createPlan() throws InterruptedException {
		
		Logger.analyzeLog(driver);
		this.landingPage = new  LandingPage(driver);
		landingPage.createNewPlan();
		Thread.sleep(3000);
		leftMenuPlansPage = new LeftMenuPlansPage(driver);
		leftMenuPlansPage.createNewPlan();
		Thread.sleep(3000);
		newPlanPage = new NewPlanPage(driver);
		dataProvider = new DataProvider();
		
		planBean = dataProvider.getNewPlanDataObject(this.excelPath,0);
		newPlanPage.inputPlanData(planBean);
		Thread.sleep(10000);
			
//		AssertJUnit.assertTrue(landingPage.validatePageElements());
	}	
	@AfterMethod
	public void endSession() throws InterruptedException
	{
		this.landingPage.logout();
		Thread.sleep(3000);
	}

	@AfterSuite
	public void tearDown()
	{
		
		driver.close();
	}
}
