package main.java.com.infolob.container.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.com.infolob.container.common.utilities.Constants;

public class LeftMenuPlansPage extends IPage{

	
	private WebDriver driver;
	private WebElement nameTextBox;
	private WebElement dateTextBox;
	private WebElement publishedDropDown;
	private WebElement inviteUsersBtn;
	private WebElement importBtn;
	private WebElement newPlnBtn;
	private List<WebElement> listOfExistingPlans;
	
	public LeftMenuPlansPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean validatePageElements() throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}

	public WebElement getNameTextBox() {
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.id(Constants.ID_PLANS_SEARCH))));
		nameTextBox = super.getDriver().findElement(By.id(Constants.ID_PLANS_SEARCH));
		return nameTextBox;
	}
	public WebElement getDateTextBox() {
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.id(Constants.CSS_DATES_RANGE_PLANS))));
		dateTextBox = super.getDriver().findElement(By.id(Constants.CSS_DATES_RANGE_PLANS));
		return dateTextBox;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getPublishedDropDown() {
		return publishedDropDown;
	}
	public WebElement getInviteUsersBtn() {
		return inviteUsersBtn;
	}
	public WebElement getImportBtn() {
		return importBtn;
	}
	public WebElement getNewPlnBtn() {
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.cssSelector(Constants.CSS_NEW_PLAN_BTN))));
		newPlnBtn = super.getDriver().findElement(By.cssSelector(Constants.CSS_NEW_PLAN_BTN));
		return newPlnBtn;
	}
	public List<WebElement> getListOfExistingPlans() {
		return listOfExistingPlans;
	}
	
	public void createNewPlan()
	{
		getNewPlnBtn().click();
	}
	
}
