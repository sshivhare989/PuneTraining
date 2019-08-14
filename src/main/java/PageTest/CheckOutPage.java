package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="billing-address-select")
	public WebElement BillAddress;
	
	@FindBy(xpath="//*[@id=\"billing-address-select\"]/option[2]")
	public WebElement NewAdd;
}
