package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinitions {
    WebDriver driver;

    @Given("^User able to open Browser$")
    public void user_able_to_open_Browser() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter URL$")
    public void enter_URL() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @Then("^User click on Register Link$")
    public void user_click_on_Register_Link() {
        driver.findElement(By.className("ico-register")).click();
    }

    @Then("^User on Register page and  verify Register page title$")
    public void user_on_Register_page_and_verify_Register_page_title() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);
    }

    @Then("^Select Gender$")
    public void select_Gender() {
        driver.findElement(By.id("gender-male")).click();
    }

    @Then("^Enter First Name$")
    public void enter_First_Name() {
        driver.findElement(By.id("FirstName")).sendKeys("Miral");
    }

    @Then("^Enter Last Name$")
    public void enter_Last_Name() {
        driver.findElement(By.id("LastName")).sendKeys("Patel");
    }

    @Then("^Enter Date Of Birth$")
    public void enter_Date_Of_Birth() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("16");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("September");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1993");
    }

    @Then("^Enter Email$")
    public void enter_Email(){
        driver.findElement(By.id("Email")).sendKeys("patelmv.16993@gmail.com");
    }

    @Then("^Company Name$")
    public void company_Name() {
        driver.findElement(By.id("Company")).sendKeys("Unify");
    }

    @Then("^Enter Password$")
    public void enter_Password() {
        driver.findElement(By.id("Password")).sendKeys("Admin@123");
    }

    @Then("^Enter Confirm Password$")
    public void enter_Confirm_Password() {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Admin@123");
    }

    @Then("^User Click on Register Button$")
    public void user_Click_on_Register_Button() {
        driver.findElement(By.id("register-button")).click();
    }

}
