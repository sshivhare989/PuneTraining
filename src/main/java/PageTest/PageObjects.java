package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Log in")
	public WebElement Login;

	@FindBy(id = "Email")
	public WebElement Email;
	@FindBy(id = "Password")
	public WebElement Password;
	@FindBy(xpath = "//input[@value='Log in']")
	public WebElement LoginButton;

}
