package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class FHCLoginStepDefinitions {

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
       Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");
    }

    @Given("enter correct name and password")
    public void enter_correct_name_and_password() {
        WebElement usernameBox = Driver.getDriver().findElement(By.id("UserName"));
        usernameBox.sendKeys("manager2");
        WebElement passwordBox = Driver.getDriver().findElement(By.id("Password"));
        passwordBox.sendKeys("Man1Ager2!");
        WebElement loginButton = Driver.getDriver().findElement(By.id("btnSubmit"));
        loginButton.submit();

    }
    @Then("verify the login is successfull")
    public void verify_the_login_is_successfull() {
        Assert.assertTrue(Driver.getDriver().findElement(By.partialLinkText("ListOfUsers")).isDisplayed());

    }


}
