package stepdefinations;

import java.time.Duration;

import io.cucumber.java.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class QueuePage {

    public WebDriver driver;

    String URL = "https://dsportalapp.herokuapp.com/";

    //Background
    By getstarted = By.xpath("//button[text()='Get Started']");

    By signin = By.xpath("//a[contains(text(),'Sign in')]");
    By Username = By.xpath("//input[@name='username']");
    By Password = By.xpath("//input[@name='password']");
    By login = By.xpath("//input[@type='submit']");

    //TC 002
    By pythonQueueImplmentation = By.xpath("//a[contains(text(),'Implementation of Queue in Python')]");
    //TC 003
    By dequeImplmentation = By.xpath("//a[contains(text(),'Implementation using collections.deque')]");
    By arrayImplmentation = By.xpath("//a[contains(text(),'Implementation using array')]");
    //TC004
    By tryherebtn = By.xpath("//a[contains(text(),'Try here>>>')]");
    //TC005

    By input = By.xpath("//div[@class='input']");
    By runbtn = By.xpath("//button[@type='button']");

    By dropdown = By.xpath("//div[@class='nav-item dropdown']");
    By queuebutton = By.xpath("//a[contains(text(),'Queue')]");

    By practicequestnbtn = By.xpath("//a[contains(text(),'Practice Questions')]");
    By signoutbutton = By.xpath("//a[contains(text(),'Sign out')]");

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

    @When("user navigate to dropdown of data-structures")
    public void user_navigate_to_dropdown_of_data_structures() {
        driver.findElement(dropdown).click();
    }

    @When("user click the queue button")
    public void user_click_the_queue_button() {
        driver.findElement(queuebutton).click();

    }

    @Then("User should redirected to Queue page")
    public void user_should_redirected_to_queue_page() {

    }

    @When("user click on Implementation of Queue in Python link")
    public void user_click_on_get_implementation_of_queue_in_python_link() {

        driver.findElement(pythonQueueImplmentation).click();
    }

    @Then("user should land on Implementation of Queue in Python page")
    public void user_should_land_on_implementation_of_queue_in_python_page() {
    }


    @When("user Click to TryHere button")
    public void user_click_to_try_here_button() {
        driver.findElement(runbtn).click();

    }

    @Then("user will land on TryEditor page")
    public void user_will_land_on_try_editor_page() {

    }

    @When("user enters Message in the Box")
    public void user_enters_message_in_the_box() {

    }

    @When("user click Run button")
    public void user_click_run_button() {

    }

    @Then("user should see the Print Message in the Try Editor Box")
    public void user_should_see_the_print_message_in_the_try_editor_box() {

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
    @When("user enters the code {string} in the test page")
    public void user_enters_the_code_in_the_test_page(String inputText) {
        WebElement element = driver.findElement(input);
        element.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND);
        actions.sendKeys(inputText).perform();
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
            InterruptedException {

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.accept();//click ok button
    }
    @When("user should see output")
    public void user_should_see_output() {

        driver.findElement(By.id("output")).getText();
    }
//tc005

    @When("user click on Implementation using collections.deque")
    public void user_click_on_Implementation_using_collections_deque() {

        driver.findElement(dequeImplmentation).click();
    }

    @Then("user should land on Implementation using collections.deque")
    public void user_should_land_on_implementation_using_collection_deque() {
    }
    //tc006
    @When("user click on Implementation using Array")
    public void user_click_on_Implementation_using_array() {

        driver.findElement(arrayImplmentation).click();
    }

    @Then("user should land on Implementation using Array")
    public void user_should_land_on_implementation_using_array() {
    }

    //  tc007
    @When("user clicks on Queue Operations")
    public void user_clicks_on_queue_operations() {

        driver.findElement(arrayImplmentation).click();
    }
    @Then("user should land on Queue Operations")
    public void user_should_land_on_queue_operations() {
    }

    @When("user clicks to the Practice Questions Button")
    public void user_clicks_to_the_Practice_Questions_Button() {

        driver.findElement(practicequestnbtn).click();

    }

    @Then("user redirected to the practice questions page")
    public void user_redirected_to_the_practice_questions_page() {

    }

    @Then("user will Sign out")
    public void user_will_sign_out(){
        driver.findElement(signoutbutton).click();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
