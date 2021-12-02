package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegistrationSteps {


    @Given("User is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("user navigates on registration page");
    }

    @When("User enters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {

       List<List<String>> userList = dataTable.asLists(String.class);

        for(List<String> e : userList){
            System.out.println(e);
        }
    }

    @Then("user registration should be successful")
    public void user_registration_should_be_successful() {

    }

}
