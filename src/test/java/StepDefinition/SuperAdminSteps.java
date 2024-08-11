package StepDefinition;

import PageObject.SuperAdminPageObject;
import driverFactory.Drivermanager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SuperAdminSteps {


    private  SuperAdminPageObject superAdminPageObject = new SuperAdminPageObject(Drivermanager.getDriver());


    @Given("User is on login page")
    public void user_is_on_login_page(){
      Drivermanager.getDriver().get("https://www.demoblaze.com/index.html");
    }
    @When("User search {string}")
    public void userEntersUsername(String java) {
        superAdminPageObject.search(java);
        superAdminPageObject.click_java();
    }
    @Then("User click on second link")
    public void user_clcik_on_second_link(){
        superAdminPageObject.click_link();

    }
//    @And("User enters password {string}")
//    public void userEntersPassword(String password) {
//        superAdminPageObject.enter_password(password);
//    }
//    @Then("User clicks on the submit button")
//    public void user_clicks_on_the_submit_button() {
//        superAdminPageObject.click_On_login();
//    }
}
