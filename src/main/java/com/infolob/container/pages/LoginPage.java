package main.java.com.infolob.container.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.com.infolob.container.common.utilities.Constants;

public class LoginPage extends IPage{

	public WebElement userNameInput;
	public WebElement userPassInput;
	public WebElement loginButton;
	public WebElement forgetPassHref;
	public WebElement signUpHereHref;
	
	public  LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	@Override
	public boolean validatePageElements() {
		// TODO Auto-generated method stub
		
		return getUserNameInput().isDisplayed() && getUserPassInput().isDisplayed() &&
				getLoginButton().isDisplayed() && getForgetPassHref().isDisplayed() && 
				getSignUpHereHref().isDisplayed();
		

	}
	public WebElement getUserNameInput() {
		setUserNameInput();
		return userNameInput;
	}
	public WebElement getUserPassInput() {
		setUserPassInput();
		return userPassInput;
	}
	public WebElement getLoginButton() {
		setLoginButton();
		return loginButton;
	}
	public WebElement getForgetPassHref() {
		setForgetPassHref();
		return forgetPassHref;
	}
	public WebElement getSignUpHereHref() {
		setSignUpHereHref();
		return signUpHereHref;
	}
	public void setUserNameInput() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		String userNameXpath = "//input[starts-with(@id, '"+Constants.ID_USERNAME+"')]";
		driverWait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(userNameXpath))));
		this.userNameInput = super.getDriver().findElement(By.xpath(userNameXpath));
	}
	public void setUserPassInput() {
		String userPassXpath = "//input[starts-with(@id, '"+Constants.ID_USERPASS+"')]";
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(userPassXpath))));
		this.userPassInput = super.getDriver().findElement(By.xpath(userPassXpath));
	}
	public void setLoginButton() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.cssSelector(Constants.CSS_LOGINBTN))));
		this.loginButton = super.getDriver().findElement(By.cssSelector(Constants.CSS_LOGINBTN));
		
	}
	public void setForgetPassHref() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.cssSelector(Constants.CSS_FORGETPASS_HREF))));
		this.forgetPassHref = super.getDriver().findElement(By.cssSelector(Constants.CSS_FORGETPASS_HREF));
	}
	public void setSignUpHereHref() {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);
		driverWait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.cssSelector(Constants.CSS_SIGNUP_HREF))));
		this.signUpHereHref = super.getDriver().findElement(By.cssSelector(Constants.CSS_SIGNUP_HREF));	
	}
	
	public void login(String username, String password)
	{
		getUserNameInput().sendKeys(username);
		getUserPassInput().sendKeys(password);
		getLoginButton().click();
	}
	
}
