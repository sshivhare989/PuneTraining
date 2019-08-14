package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderADDChange{

	public OrderADDChange(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(@href,'/apparel-shoes')]")
	public WebElement apparel;

	@FindBy(linkText = "Casual Golf Belt")
	public WebElement Belt;

	@FindBy(id = "addtocart_40_EnteredQuantity")
	public WebElement quantity;

	@FindBy(id = "add-to-cart-button-40")
	public WebElement AddToCartButton;

	@FindBy(xpath = "//span[@class='cart-label']")
	public WebElement shoppingCart;

	@FindBy(id = "termsofservice")
	public WebElement termsofservice;

	@FindBy(id = "checkout")
	public WebElement checkout;
	
	public void apparelclick()
	{
		apparel.click();
	}

}
