package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DataTablesPage;
import utilities.Driver;

public class ScenarioOutlineExample_StepDefinition {
        DataTablesPage dataTablesPage=new DataTablesPage();

    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @When("User clicks on new button")
    public void user_clicks_on_new_button() {
       dataTablesPage.newButton.click();

    }
    @When("User enters first name")
    public void user_enters_first_name() {
        dataTablesPage.firstname.sendKeys("Maria");

    }
    @When("User enters last name")
    public void user_enters_last_name() {
        dataTablesPage.lastname.sendKeys("Krani");

    }
    @When("User enters position")
    public void user_enters_position() {
        dataTablesPage.position.sendKeys("QA");

    }
    @When("User enters office")
    public void user_enters_office() {
        dataTablesPage.office.sendKeys("Athens");
    }

    @When("User enters extension")
    public void user_enters_extension() {
        dataTablesPage.extension.sendKeys("12345");

    }
    @When("User enters start date")
    public void user_enters_start_date() {
        dataTablesPage.startDate.sendKeys("2020-05-06");

    }
    @When("User enters salary")
    public void user_enters_salary() {
        dataTablesPage.salary.sendKeys("90000");

    }
    @Then("User clicks Create button")
    public void user_clicks_Create_button() {
        dataTablesPage.createButton.click();

    }

    @When("User enters first name to the searchbox")
    public void user_enters_first_name_to_the_searchbox() {
        dataTablesPage.searchBox.sendKeys("Maria");

    }

    @Then("verify that user see the first name in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox() {
        String name = dataTablesPage.nameField.getText();
        Assert.assertTrue(name.contains("Maria"));
    }


    //parameterizing
    @When("User enters first name {string}")
    public void user_enters_first_name(String firstname) {
        dataTablesPage.firstname.sendKeys(firstname);
    }

    @When("User enters last name {string}")
    public void user_enters_last_name(String lastname) {
        dataTablesPage.lastname.sendKeys(lastname);
    }

    @When("User enters position {string}")
    public void user_enters_position(String position) {
        dataTablesPage.position.sendKeys(position);

    }

    @When("User enters office {string}")
    public void user_enters_office(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @When("User enters extension {string}")
    public void user_enters_extension(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @When("User enters start date {string}")
    public void user_enters_start_date(String startdate) {
        dataTablesPage.startDate.sendKeys(startdate);
    }

    @When("User enters salary {string}")
    public void user_enters_salary(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @When("User enters first name {string} to the searchbox")
    public void user_enters_first_name_to_the_searchbox(String firstname) {
        dataTablesPage.searchBox.sendKeys(firstname);
    }

    @Then("verify that user see the first name {string} in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox(String firstname) {
        String name = dataTablesPage.nameField.getText();
        Assert.assertTrue(name.contains(firstname));
    }







}
