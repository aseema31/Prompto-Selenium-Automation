package main.java.com.infolob.container.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.com.infolob.container.common.utilities.Constants;


public class LandingPage extends IPage{
	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private List<WebElement> leftMenuItems ;
	private WebElement logoutButton;
	private WebElement menuButton;
	private WebElement menuText;
	private WebElement userInfo;
	private WebElement arrowDropDown;
	private WebElement paymentProcessingPlan;
	private WebElement completeUserResitration;
	private WebElement paymentProcessingPlanPage;
	private WebElement registrationCompletionPage;
	private WebElement userInfoModal;
	
	public WebElement getPaymentProcessingPlan() {
		setPaymentProcessingPlan();
		return paymentProcessingPlan;
	}

	public void setPaymentProcessingPlan() {
		this.paymentProcessingPlan = super.getDriver().findElement(By.cssSelector(Constants.CSS_COMPLETE_PAYMENT_PROCESSING_PLAN));
	}

	public WebElement getCompleteUserResitration() {
		setCompleteUserResitration();
		return completeUserResitration;
	}

	public void setCompleteUserResitration() {
		this.completeUserResitration = super.getDriver().findElement(By.cssSelector(Constants.CSS_COMPLETE_REGUSTRATION));
	}

	@Override
	public boolean validatePageElements() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Menu elements are :");
		setLeftMenuItems();
//		System.out.println( this.leftMenuItems.size());
		System.out.println("================================================");
		for(WebElement we: this.leftMenuItems)
		{
			String str = we.getText();
			String[] menuEntry = str.split("\n");
			System.out.println(menuEntry[1]);
			
		}
		System.out.println("================================================");
		return (getLeftMenuItems().size() == 7) && getLogoutButton().isDisplayed() && getMenuButton().isDisplayed()&&
				 getArrowDropDown().isDisplayed()&& getUserInfo().isDisplayed() && getMenuText().isDisplayed()
				 && getCompleteUserResitration().isDisplayed() && getPaymentProcessingPlan().isDisplayed()&& onSelectPaymentProcessingPlan() &&  completeUserRegistration() && isUserInfoDisplayed();
	}
	
	public WebElement getMenuText() {
		setMenuText();
		return menuText;
	}
	public WebElement getUserInfo() {
		setUserInfo();
		return userInfo;
	}
	public WebElement getArrowDropDown() {
		setArrowDropDown();
		return arrowDropDown;
	}
	
	public List getLeftMenuItems() {
		setLeftMenuItems();
		return leftMenuItems;
	}
	public WebElement getLogoutButton() {
		setLogoutButton();
		return logoutButton;
	}
	public WebElement getMenuButton() {
		setMenuButton();
		return menuButton;
	}
	public void setLeftMenuItems() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.ID_LOGOUT_BTN)));
		this.leftMenuItems = super.getDriver().findElements(By.cssSelector(Constants.CSS_LEFT_MENU_LIST));
	}
	public void setLogoutButton( ) {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.id(Constants.ID_LOGOUT_BTN))));
		this.logoutButton = super.getDriver().findElement(By.id(Constants.ID_LOGOUT_BTN));
	}
	public void setMenuButton() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.ID_LOGOUT_BTN)));
		this.menuButton = super.getDriver().findElement(By.cssSelector(Constants.CSS_LEFT_MENU_PROMPTO_BUTTON));
	}
	
	public void setMenuText() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.ID_LOGOUT_BTN)));
		this.menuText = super.getDriver().findElement(By.cssSelector(Constants.CSS_LEFT_MENU_PROMPTO));
	}
	public void setUserInfo() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.ID_LOGOUT_BTN)));
		this.userInfo = super.getDriver().findElement(By.cssSelector(Constants.ID_LANDING_USERNAME));
	
	}
	public void setArrowDropDown() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.ID_LOGOUT_BTN)));
		this.arrowDropDown = super.getDriver().findElement(By.cssSelector(Constants.ID_LANDING_USERNAME_EXPANDARROW));;
	}

	private boolean onSelectPaymentProcessingPlan() throws InterruptedException
	{
		getPaymentProcessingPlan().click();
		this.paymentProcessingPlanPage = super.getDriver().findElement(By.cssSelector(Constants.DIV_PAYMENT_PROCESSING));
		System.out.println("================================================");
		System.out.println("Getting Text from Payment processing plan ::");
		System.out.println(this.paymentProcessingPlanPage.findElement(By.tagName("h3")).getText());
		System.out.println("================================================");
		Thread.sleep(5000);
		return paymentProcessingPlan.isDisplayed();
	}
	
	public void logout()
	{
		getLogoutButton().click();
		
	}
	
	private boolean completeUserRegistration() throws InterruptedException
	{
		getCompleteUserResitration().click();
		this.registrationCompletionPage =  super.getDriver().findElement(By.cssSelector(Constants.DIV_COMPLETE_REGISTRATION));
		List<WebElement> button = registrationCompletionPage.findElements(By.tagName("button"));
		System.out.println("================================================");
		System.out.println("User resgitration section has "+button.size()+ " segments");
		System.out.println("================================================");
		Thread.sleep(5000);
		return (button.size() == 2);
		
	}
	
	private boolean isUserInfoDisplayed() throws InterruptedException
	{
		getArrowDropDown().click();
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10000);
		driverWait.until(ExpectedConditions.visibilityOf( super.getDriver().findElement(By.cssSelector(Constants.DIV_USER_INFORMATION))));
		List<WebElement> userInfoMenuItems =  super.getDriver().findElement(By.cssSelector(Constants.DIV_USER_INFORMATION)).findElements(By.cssSelector(Constants.CSS_LEFT_MENU_LIST));
		Thread.sleep(5000);
//		System.out.println(userInfoMenuItems.size());
		return super.getDriver().findElement(By.cssSelector(Constants.DIV_USER_INFORMATION)).isDisplayed();
	}
}
