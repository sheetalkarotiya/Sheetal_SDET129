package stepdefinations;


	
	

	import java.util.concurrent.TimeUnit;

	import org.junit.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;

	public class Portal {
		
		//public WebDriver driver = new ChromeDriver();
		WebDriver driver;
		
		  @Test
		  public void crossBrowserTestimgMethod() {
			  System.out.println("Title is- "+driver.getTitle());
			  
		  }
		  
		  @Parameters("browserName")
		  @BeforeMethod
		  public void beforeMethod(String browserName) {
			  System.out.println("This test started in- "+browserName+" browser");
			  
			  switch(browserName){
			  
			  case "edge" :
				  System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver.exe");		  	 
			  	  driver  = new EdgeDriver();
			  	  break;  
				
				  case "chrome" : System.setProperty("webdriver.chrome.driver",
				  "C:\\Selenium\\chromedriver.exe"); driver = new ChromeDriver(); break;
				 
			  	  
			  	  default:
			  		  System.out.println("Your choice doesn't match");
			  }		  		  
		  	  
		}	
		
		@Given("User opens the URL")
		public void user_opens_the_url() {
			driver.get("https://dsportalapp.herokuapp.com/"); 
			driver.manage().window().maximize();
			
		}

		@Then("User land on the page")
		public void user_land_on_the_page() {

		}

		@Then("User navigate to homepage")
		public void user_navigate_to_homepage() {

		}

		@Then("User clicks on Get Started button")
		public void user_clicks_on_get_started_button() {

		}

		@Then("User navigate to the home page")
		public void user_navigate_to_the_home_page() {

		}


	}




