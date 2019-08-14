package stepDefinition;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import PageTest.OrderADDChange;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddtoCart   {
	
	
	OrderADDChange c;
	
	
	@Given("^User add items to cart and change quantity$")
	public void user_add_items_to_cart_and_change_quantity() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		WebDriver driver=New.driver;
		c = new OrderADDChange(driver);
		System.out.println("Before Call the Method");	
		c.apparelclick();
		System.out.println("After Call the Method");
		Thread.sleep(1000);
		c.Belt.click();
		c.quantity.click();
		c.quantity.clear();
	}

	@When("^user enter the number of quantity and add (\\d+) item to cart$")
	public void user_enter_the_number_of_quantity_and_add_item_to_cart(int arg1) throws Throwable {
		WebDriver driver=New.driver;
		c = new OrderADDChange(driver);
		String count=Integer.toString(arg1);
		c.quantity.sendKeys(count);
		c.AddToCartButton.click();
		c.shoppingCart.click();
		c.termsofservice.click();
		
	}

	@Then("^user proceed to checkout$")
	public void user_proceed_to_checkout() throws Throwable {
		//WebDriver driver=New.driver;
		c.checkout.click();
		  System.out.println("Checkout");
	}

}
