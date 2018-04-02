package main.java.com.infolob.container.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftMenuDashboardPage  extends IPage{

	private	LandingPage landingPage;
	private	WebDriver driver; 
	private WebElement dateRangeInput;
	private WebElement headerCalculatedInformation;
	private WebElement helpContent;
	private WebElement placeholder;	

	LeftMenuDashboardPage(WebDriver driver) {
		super(driver);
	}

	public LandingPage getLandingPage() {
		return landingPage;
	}

	public void setLandingPage(LandingPage landingPage) {
		this.landingPage = landingPage;
	}

	public WebElement getDateRangeInput() {
		return dateRangeInput;
	}

	public void setDateRangeInput(WebElement dateRangeInput) {
		this.dateRangeInput = dateRangeInput;
	}

	public WebElement getHeaderCalculatedInformation() {
		return headerCalculatedInformation;
	}

	public void setHeaderCalculatedInformation(WebElement headerCalculatedInformation) {
		this.headerCalculatedInformation = headerCalculatedInformation;
	}

	public WebElement getHelpContent() {
		return helpContent;
	}

	public void setHelpContent(WebElement helpContent) {
		this.helpContent = helpContent;
	}

	public WebElement getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(WebElement placeholder) {
		this.placeholder = placeholder;
	}

	@Override
	public boolean validatePageElements() throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
