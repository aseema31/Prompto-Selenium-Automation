package main.java.com.infolob.container.pages;

import org.openqa.selenium.WebDriver;

public abstract class IPage {


	private WebDriver driver;

	public IPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebDriver getDriver() {
		return this.driver;
	}
	public abstract boolean validatePageElements() throws InterruptedException;
}
