package DataDrivenTest;




	import java.io.IOException;
	import java.time.Duration;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import Excel.ExcelHandling;
	
	public class DataDriven_Login {
	                             WebDriver driver;

				@BeforeClass
				public void setup() {

		System.getProperty("C:\\Users\\sheet\\eclipse-workspace\\Selenium_Project_01\\src\\test\\resources\\drivers");
		               driver = new ChromeDriver();		  
		               driver.manage().window().maximize();
					   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		  
			}

			@Test(dataProvider="LoginData")
			public void LoginTest(String username,String password,String exp) 

			{

			driver.get("https://dsportalapp.herokuapp.com/login");
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);   // username
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);   //password
		    driver.findElement(By.xpath("//input[@type='submit']")).click();                // login
 
	//	String exp_title="https://dsportalapp.herokuapp.com/login";
	//	String act_title=driver.getTitle();

		/*
		 * if(exp.equals("Valid username and valid password"))
		 * 
		 * { if(exp_title.equals(act_title)) { Assert.assertTrue(true); } else {
		 * Assert.assertTrue(false); } } else if
		 * (exp.equals("Invalid username and password")) {
		 * if(exp_title.equals(act_title)) { Assert.assertTrue(false); } else
		 * Assert.assertTrue(true); }
		 */		}		

			@DataProvider(name="LoginData")
		     public String[][] getData() throws IOException
		{
				String path = "C:\\Users\\sheet\\OneDrive\\Desktop\\Dsportal.xlsx";
				ExcelHandling reader = new ExcelHandling(path);
				
				int totalrows = reader.getRowCount("Signin");
				int totalcols =reader.getCellCount("Signin", 1);
				
			String	LoginData[][] = new String[totalrows][totalcols];
			
			for(int i=1; i<=totalrows;i++)  //1
			{
	            for(int j=0;j<totalcols;j++)  //0
	            {
	             LoginData[i-1][j]= reader.getCellData("Signin",i,j);	
	            }
			
			}	
						
				return LoginData;		
		}	

		@AfterClass
		void teardown()
		{

		    driver.close();

		}

		



	}


