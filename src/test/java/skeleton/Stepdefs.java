package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	
WebDriver driver;
@Given("user is on the login page")
public void user_is_on_the_login_page() {
   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
   driver= new ChromeDriver();
   driver.get("https://facebook.com");
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

@When("user provides the correct credentials")
public void user_provides_the_correct_credentials() throws InterruptedException {
    driver.findElement(By.id("email")).sendKeys("TEST@123.com");
    driver.findElement(By.id("pass")).sendKeys("testpass");
    Thread.sleep(2000);
}

@Then("user rendered to TestMeApp home page")
public void user_rendered_to_TestMeApp_home_page() {
   driver.close();
}
   
}
