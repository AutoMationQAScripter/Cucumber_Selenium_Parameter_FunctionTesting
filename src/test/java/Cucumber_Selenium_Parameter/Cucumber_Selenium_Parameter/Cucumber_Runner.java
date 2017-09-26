package Cucumber_Selenium_Parameter.Cucumber_Selenium_Parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber_Runner {

	WebDriver driver;
	
	@Given("^Launch Browser and check Page$")
	public void launch_Browser_and_check_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");

		}
			  
	

	@When("^Enter \"(.*?)\" and \"(.*?)\"$")
	public void enter_Username_and_Password(String Username, String Password) throws Throwable {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(Username);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Next'])[last()]")).click();
		Thread.sleep(3000);
	}

	
	@Then("^Check invalid message$")
	public void check_invalid_message() throws Throwable {
		//driver.findElement(By.xpath("//a[@title='Google Account: Deepak pal  (paldeepak.itm@gmail.com)']"));
		
		
		driver.quit();
	
	}
}