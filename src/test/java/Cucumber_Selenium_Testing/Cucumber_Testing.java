package Cucumber_Selenium_Testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/GmailLoginFunctionalDataDriven.feature",
				format={"pretty","html:target/Reports"}
				,glue={"Cucumber_Selenium_Runner"})
public class Cucumber_Testing {
	public static void main(String args[])
	{
		
	}
	
	

}
