package DataDrivenTest;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Excel.ExcelHandling;



public class DataDriven_Register {
                             WebDriver driver;

			@BeforeClass
			public void setup() {

	System.getProperty("C:\\Users\\sheet\\eclipse-workspace\\Selenium_Project_01\\src\\test\\resources\\drivers");
	               driver = new ChromeDriver();		  
	               driver.manage().window().maximize();
				   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		  
		}

		@Test(dataProvider="RegisterData")
		public void RegisterTest(String username,String password,String confirmpassword,String exp) 

		{

		driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password1")).sendKeys(password);
		driver.findElement(By.name("password2")).sendKeys(confirmpassword);
		driver.findElement(By.xpath("//input[@value='Register']")).click();


	//String exp_title="https://dsportalapp.herokuapp.com/home";
	//String act_title=driver.getTitle();

	/*
	 * if(exp.equals("Valid"))
	 * 
	 * { if(exp_title.equals(act_title)) { Assert.assertTrue(true); } else {
	 * Assert.assertTrue(false); } } else if (exp.equals("Invalid")) {
	 * if(exp_title.equals(act_title)) { Assert.assertTrue(false); } else
	 * Assert.assertTrue(true); }
	 */
	}		

		@DataProvider(name="RegisterData")
	     public String[][] getData() throws IOException
	{
			String path = "C:\\Users\\sheet\\OneDrive\\Desktop\\Dsportal.xlsx";
			ExcelHandling reader = new ExcelHandling(path);
			
			int totalrows = reader.getRowCount("Register");
			int totalcols =reader.getCellCount("Register", 1);
			
		String	RegisterData[][] = new String[totalrows][totalcols];
		
		for(int i=1; i<=totalrows;i++)  //1
		{
            for(int j=0;j<totalcols;j++)  //0
            {
             RegisterData[i-1][j]= reader.getCellData("Register",i,j);	
            }
		
		}	
		return RegisterData;		
	}	

	@AfterClass
	void teardown()
	{

	    driver.close();

	}

	



}
