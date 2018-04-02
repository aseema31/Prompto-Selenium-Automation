package main.java.com.infolob.container.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.com.infolob.container.bean.PlanBean;
import main.java.com.infolob.container.common.utilities.Constants;

public class NewPlanPage extends IPage{


	//	private WebDriver driver;
	private WebElement planNameInput;
	private WebElement planDescriptionInput;
	private WebElement amountInput;
	private WebElement currencyDropDown;
	private WebElement discountPercentInput;
	private WebElement taxPercentInput;
	private WebElement grandTotalAmountInput;
	private WebElement  recurringDropDown;
	private WebElement recurringTermInput;
	private WebElement recurringTermUnit;
	private WebElement gracePeriodInput;
	private WebElement gracePeriodUnitDropDown; 
	private WebElement gracePeriodUnit;
	private WebElement cancelBtn;
	private WebElement saveBtn;
	private WebElement addCustomFieldHref;
	private WebElement recurringTermUnitDropDown;
	private WebElement saveOnlyButton;
	public NewPlanPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean validatePageElements() throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}

	public WebElement getPlanNameInput() {
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		String newPlanName = "//input[starts-with(@id,'"+Constants.ID_NEW_PLAN_NAME+"')]";
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(newPlanName))));
		planNameInput = super.getDriver().findElement(By.xpath(newPlanName));
		return planNameInput;
	}
	public WebElement getPlanDescriptionInput() {
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		String newPlanDesc = "//textarea[starts-with(@id,'"+Constants.ID_NEW_PLAN_DESCRIPTION+"')]";
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(newPlanDesc))));
		planDescriptionInput = super.getDriver().findElement(By.xpath(newPlanDesc));
		return planDescriptionInput;
	}
	public WebElement getAmountInput() {
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		String newPlanAmount = "//input[starts-with(@id,'"+Constants.ID_PLAN_AMOUNT+"')]";
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(newPlanAmount))));
		amountInput = super.getDriver().findElement(By.xpath(newPlanAmount));
		return amountInput;
	}
	public WebElement getCurrencyDropDown() {
		return currencyDropDown;
	}
	public WebElement getDiscountPercentInput() {
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		String newPlanAmount = "//input[starts-with(@id,'"+Constants.ID_DISCOUNT+"')]";
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(newPlanAmount))));
		discountPercentInput = super.getDriver().findElement(By.xpath(newPlanAmount));
		return discountPercentInput;
	}
	public WebElement getTaxPercentInput() {
		return taxPercentInput;
	}
	public WebElement getGrandTotalAmountInput() {
		return grandTotalAmountInput;
	}
	public void setRecurringDropDown() {
		String recurring = "//div[starts-with(@id,'"+Constants.ID_RECURRING+"')]";
		//		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(recurring))));
		this.recurringDropDown = super.getDriver().findElement(By.xpath(recurring));
		this.recurringDropDown.click();
	}
	public WebElement setRecurringTermInput(String recurringTerm) {
		String xpathExpression = "//input[starts-with(@id,'"+Constants.ID_RECURRING_TERM+"')]";
		recurringTermInput = super.getDriver().findElement(By.xpath(xpathExpression));
		recurringTermInput.sendKeys(recurringTerm);
		return recurringTermInput;
	}
	public void setRecurringTermUnitDropDown() {
		String recurring = "//div[starts-with(@id,'"+Constants.ID_RECURRING_TERM_UNIT+"')]";
		//		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(recurring))));
		this.recurringTermUnitDropDown = super.getDriver().findElement(By.xpath(recurring));
		this.recurringTermUnitDropDown.click();
	}
	public WebElement setRecurringTermUnit(int index) {
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);	
		driverWait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.cssSelector(Constants.RECURRING_LIST))));
		WebElement recurringMenu = super.getDriver().findElement(By.cssSelector(Constants.RECURRING_LIST));
		List<WebElement> recurringList = recurringMenu.findElements(By.cssSelector(Constants.RECURRING_LIST_ITEMS));
		recurringList.get(index).click();
		return recurringTermUnit;
	}
	public void setGracePeriodInput(String gracePeriod) {
		String  xpathExpression = "//input[starts-with(@id,'"+Constants.ID_GRACE_PERIOD+"')]";;
		gracePeriodInput = super.getDriver().findElement(By.xpath(xpathExpression));
		gracePeriodInput.sendKeys(gracePeriod);;
	}
	public void setGracePeriodUnitDropDown() {
		String recurring = "//div[starts-with(@id,'"+Constants.ID_GRACE_PERIOD_UNIT+"')]";
		//		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(recurring))));
		this.gracePeriodUnitDropDown = super.getDriver().findElement(By.xpath(recurring));
		this.gracePeriodUnitDropDown.click();
	}

	public void setGracePeriodUnit(int gracePeriodTerm)
	{
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);	
		driverWait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.cssSelector(Constants.RECURRING_LIST))));
		WebElement recurringMenu = super.getDriver().findElement(By.cssSelector(Constants.RECURRING_LIST));
		List<WebElement> recurringList = recurringMenu.findElements(By.cssSelector(Constants.RECURRING_LIST_ITEMS));
		recurringList.get(gracePeriodTerm).click();
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	public WebElement getSaveBtn() {
		this.saveBtn = 	super.getDriver().findElement(By.cssSelector(Constants.CSS_NEW_PLAN_SAVE_BTN));
		return saveBtn;
	}
	public WebElement getAddCustomFieldHref() {
		return addCustomFieldHref;
	}

	public void inputPlanData(PlanBean planBean) throws InterruptedException
	{
		setNewPlanName(planBean.getPlanName());
		setNewPlanDescription(planBean.getPlanDescription());
		setNewPlanAmount(planBean.getPlanAmount());
		setDiscountPercentage(planBean.getPlanDiscount());
		dragDown();
		dragDown();
		Thread.sleep(5000);
		setRecurringDropDown();
		Thread.sleep(5000);
		setRecurring(planBean.getRecurring());
		Thread.sleep(3000);
		setRecurringTermInput(planBean.getRecurringTerm());
		Thread.sleep(3000);
		setRecurringTermUnitDropDown();
		Thread.sleep(5000);
		setRecurringTermUnit(planBean.getRecurringTermUnit());
		Thread.sleep(5000);
		setGracePeriodInput(planBean.getGracePeriod());
		Thread.sleep(5000);
		setGracePeriodUnitDropDown();
		Thread.sleep(5000);
		setGracePeriodUnit(planBean.getGracePeriodUnit());
		Thread.sleep(8000);
		getSaveBtn().click();
		Thread.sleep(8000);
		setSaveOnly();
		dragUp();

	}
	private void setNewPlanName(String planName)
	{	
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		String newPlanName = "//input[starts-with(@id,'"+Constants.ID_NEW_PLAN_NAME+"')]";
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(newPlanName))));
		planNameInput = super.getDriver().findElement(By.xpath(newPlanName));
		this.planNameInput.sendKeys(planName);
	}

	private void setNewPlanAmount(String planAmount)
	{
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		String newPlanAmount = "//input[starts-with(@id,'"+Constants.ID_PLAN_AMOUNT+"')]";
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(newPlanAmount))));
		amountInput = super.getDriver().findElement(By.xpath(newPlanAmount));
		this.amountInput.sendKeys(planAmount);
	}
	private void setNewPlanDescription(String planDescription)
	{
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		String newPlanDesc = "//textarea[starts-with(@id,'"+Constants.ID_NEW_PLAN_DESCRIPTION+"')]";
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(newPlanDesc))));
		planDescriptionInput = super.getDriver().findElement(By.xpath(newPlanDesc));
		this.planDescriptionInput.sendKeys(planDescription);
	}
	private void setDiscountPercentage(String discount)
	{
		WebDriverWait wait =  new WebDriverWait(super.getDriver(), 10);
		String newPlanAmount = "//input[starts-with(@id,'"+Constants.ID_DISCOUNT+"')]";
		wait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.xpath(newPlanAmount))));
		discountPercentInput = super.getDriver().findElement(By.xpath(newPlanAmount));
		this.discountPercentInput.sendKeys(discount);
	}

	private void setRecurring(int index) throws InterruptedException
	{
		//		setRecurringDropDown().click();
		Thread.sleep(5000);
		WebDriverWait driverWait = new WebDriverWait(super.getDriver(), 10);	
		driverWait.until(ExpectedConditions.visibilityOf(super.getDriver().findElement(By.cssSelector(Constants.RECURRING_LIST))));
		WebElement recurringMenu = super.getDriver().findElement(By.cssSelector(Constants.RECURRING_LIST));
		List<WebElement> recurringList = recurringMenu.findElements(By.cssSelector(Constants.RECURRING_LIST_ITEMS));
		recurringList.get(index).click();
	}

	public void dragDown()
	{
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);


		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void dragUp()
	{
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			//			robot.keyPress(KeyEvent.VK_UP);
			//			robot.keyRelease(KeyEvent.VK_UP);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void setSaveOnly()
	{
		saveOnlyButton = super.getDriver().findElement(By.cssSelector(Constants.CSS_SAVE_ONLY_BUTTON));
		saveOnlyButton.click();
	}
}
