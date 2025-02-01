package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Contact_Us_Steps {

    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/src/main/java/org/example/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {

    }
    @When("I enter a first name")
    public void i_enter_a_first_name() {

    }
    @And("I enter a last name")
    public void i_enter_a_last_name() {

    }
    @And("I enter an email address")
    public void i_enter_an_email_address() {

    }
    @And("I enter a comment")
    public void i_enter_a_comment() {

    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {

    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {

    }
}
