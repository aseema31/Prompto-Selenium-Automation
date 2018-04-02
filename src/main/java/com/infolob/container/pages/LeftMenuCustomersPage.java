package main.java.com.infolob.container.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftMenuCustomersPage extends IPage{

	public LeftMenuCustomersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private WebElement searchField;
	private WebElement createNewCustomerBtn;
	private List<WebElement> customerList;
	
	public WebElement getSearchField() {
				return searchField;
	}
	public WebElement getCreateNewCustomerBtn() {
		return createNewCustomerBtn;
	}
	public List<WebElement> getCustomerList() {
		return customerList;
	}
	@Override
	public boolean validatePageElements() throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
