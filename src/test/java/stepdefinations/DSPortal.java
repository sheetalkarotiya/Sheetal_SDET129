package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class DSPortal {

	
	public WebDriver driver;
	 String URL = "https://dsportalapp.herokuapp.com/";
	
	 By getstarted = By.xpath("//button[text()='Get Started']");
	 
	

@Given("user open the application of DSPortalapp <https:\\/\\/dsportalapp.herokuapp.com\\/>")
public void user_open_the_application_of_ds_portalapp_https_dsportalapp_herokuapp_com() {
   
   System.getProperty("C:\\Users\\sheet\\eclipse-workspace\\Selenium_Project_01\\src\\test\\resources\\drivers");
   driver = new ChromeDriver();
   driver.get(URL);

  
   
	
}

@When("user click to get to get started button")
public void user_click_to_get_to_get_started_button() {
   
	driver.findElement(getstarted).click();
    
   
}

@Then("user navigate to homepage")
public void user_navigate_to_homepage() {
   
   
}


}
