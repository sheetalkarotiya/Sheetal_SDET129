package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class QueuePage {

    public WebDriver driver;

    String URL = "https://dsportalapp.herokuapp.com/";

    //Background
    By getstarted = By.xpath("//button[text()='Get Started']");

    By signin = By.xpath("//a[contains(text(),'Sign in')]");
    By Username = By.xpath("//input[@name='username']");
    By Password = By.xpath("//input[@name='password']");
    By login    = By.xpath("//input[@type='submit']");

    //TC 001
    By queueGetStartedButton = By.xpath("//*[contains(text(),'queue')]/../..//a");
    //TC 002
    By pythonQueueImplmentation = By.xpath("//a[contains(text(),'Implementation of Queue in Python')]");
    //TC 003
    By practicequestnbtn = By.xpath("//a[contains(text(),'Practice Questions')]");
    //TC004
    By tryherebtn = By.xpath("//a[contains(text(),'Try here>>>')]");
    //TC005

    By input =  By.xpath("//div[@class='input']");
    By runbtn = By.xpath("//button[@type='button']");

    @Given("user open the application")
    public void user_open_the_application() {

        System.getProperty("C:\\Users\\14706\\Downloads\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @When("user click to Get Started button")
    public void user_click_to_get_started_button() {

        driver.findElement(getstarted).click();

    }

    @When("user navigate to sign in button")
    public void user_navigate_to_sign_in_button() {

        driver.findElement(signin).click();
    }

    @When("user enters Username")
    public void user_enters_username() {

        driver.findElement(Username).sendKeys("Candy");
    }

    @When("user enters Password")
    public void user_enters_password() {

        driver.findElement(Password).sendKeys("help2010");
    }

    @Then("user should be logged In into Homepage")
    public void user_should_be_logged_in_into_homepage() {

        driver.findElement(login).click();
    }

    @When("user click to Get Started button below Queue")
    public void user_click_to_get_started_button_below_queue() {

        driver.findElement(queueGetStartedButton).click();
    }

    @Then("User should land on queue page")
    public void user_should_land_on_data_structures_introduction_introduction_page() {


    }

    @When("user click on Implementation of Queue in Python link")
    public void user_click_on_get_implementation_of_queue_in_python_link() {

        driver.findElement(pythonQueueImplmentation).click();
    }

    @Then("user should land on Implementation of Queue in Python page")
    public void user_should_land_on_implementation_of_queue_in_python_page() {


    }

    @When("user navigate to practice questions button")
    public void user_navigate_to_practice_questions_button() {

        driver.findElement(practicequestnbtn).click();
    }

    @Then("User should land on the practice page")
    public void user_should_land_on_the_practice_page() {

    }

    @When("user click the try here button")
    public void user_click_the_try_here_button() {

        driver.findElement(tryherebtn).click();
    }

    @Then("user should be redirected to the try editor page")
    public void user_should_be_redirected_to_the_try_editor_page() {


    }

    @When("user enters the {string} in the test page")
    public void user_enters_the_in_the_test_page(String string) {
    WebElement element = driver.findElement(input);
    element.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND);
        actions.sendKeys(string).perform();

    }
    @When("user clicks on Run button")
    public void user_clicks_on_run_button() {

        driver.findElement(runbtn).click();
    }

    @Then("user should get an Syntx error message")
    public void user_should_get_an_syntx_error_message() {

    }

    @Then("user clicks ok Button")
    public void user_clicks_ok_button() throws
            InterruptedException{

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.accept();//click ok button
    }
    
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}