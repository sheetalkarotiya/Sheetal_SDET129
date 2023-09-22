package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage {

	public WebDriver driver;
	 String URL = "https://dsportalapp.herokuapp.com/";
	
	 By getstarted = By.xpath("//button[text()='Get Started']");
	 By datastructurebtn = By.xpath("//*[contains(text(),'Data Structures-Introduction')]/../..//a");
	 By alert  = By.xpath("//div[@class='alert alert-primary']");
	
	
	@Given("user open the application of DSPortal  https:\\/\\/dsportalapp.herokuapp.com\\/")
	public void user_open_the_application_of_ds_portal_https_dsportalapp_herokuapp_com() {
		
		   System.getProperty("C:\\Users\\sheet\\eclipse-workspace\\Selenium_Project_01\\src\\test\\resources\\drivers");
		   driver = new ChromeDriver();
		   driver.get(URL);
		   
		   driver.findElement(getstarted).click();
	    
	}

	@Then("user land on DSPortal Homepage")
	public void user_land_on_ds_portal_homepage() {
	  
		
	    
	    
	}

	@When("user clicks the get started  button below the Datastructures-Introduction")
	public void user_clicks_the_get_started_button_below_the_datastructures_introduction() {
		
		driver.findElement(datastructurebtn).click();
	  
	}

	@Then("user should get an Alert Message")
	public void user_should_get_an_alert_message() {
		
	driver.findElement(alert).click();
	    
	}




}
