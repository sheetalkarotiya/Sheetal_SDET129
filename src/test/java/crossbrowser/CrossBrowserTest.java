package crossbrowser;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	
	
	WebDriver driver;

	
	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 break;
			 
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		default:
			driver = null;
			break;
	
		}
	
	
	 
	 }
	
	
	@Test
	public void verifytitle() throws InterruptedException
	{

	
	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://dsportalapp.herokuapp.com/home");
		String expectedTitle = "NumpyNinja";
		
				
		String actualTitle = driver.getTitle();
		
		AssertJUnit.assertEquals(expectedTitle,actualTitle);
	}
	
	
	@AfterMethod
	public void endTest() {
		
		driver.quit();
		
	}
		  
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

