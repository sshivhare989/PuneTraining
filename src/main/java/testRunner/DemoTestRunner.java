package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", // feature_file
		glue = { "stepDefinition" }, tags = { "@Login,@datadriven,@Checkout" })

public class DemoTestRunner {

}
