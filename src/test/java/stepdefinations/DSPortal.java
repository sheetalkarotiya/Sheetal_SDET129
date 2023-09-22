package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSPortal {
	
	public WebDriver driver;
	 String URL = "https://dsportalapp.herokuapp.com/";
	
	 By getstarted = By.xpath("//button[text()='Get Started']");

	

	@Given("user open the application of DSPortalapp <https:\\/\\/dsportalapp.herokuapp.com\\/>")
	public void user_open_the_application_of_ds_portalapp_https_dsportalapp_herokuapp_com() {
	  
		
	System.getProperty("webdriver.chrome.driver", "C:\\Users\\sheet\\eclipse-workspace sdet129\\Selenium_Project_1\\src\\test\\resources\\drivers");
	 driver = new ChromeDriver();
	 driver.get(URL);
	 

	}

	@Then("user land on DS Portal Application page")
	public void user_land_on_ds_portal_application_page() {
	  
	   
	}

	@When("user click to get to get started button")
	public void user_click_to_get_to_get_started_button() {
	  
		driver.findElement(getstarted).click();

	   
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() {
	  
	   
	}	

}
