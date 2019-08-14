package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageTest.PageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class New {
	public static WebDriver driver;

	PageObjects po;

	@Given("^Navigate to homePage$")
	public void navigate_to_homePage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		System.out.println("GIVEN: choose to sign up");	
	}

	@When("^User enters \"(.*?)\" And \"(.*?)\"$")
	public void user_enters_And(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		po = new PageObjects(driver);
		Thread.sleep(1000);
		po.Login.click();
		Thread.sleep(1000);
		po.Email.sendKeys(arg1);
		Thread.sleep(1000);
		po.Password.sendKeys(arg2);
		Thread.sleep(1000);
		po.LoginButton.click();
		Thread.sleep(1000);
	}

	@Then("^User logged in succefully$")
	public void user_logged_in_succefully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Logged in successfully");
	}

}
