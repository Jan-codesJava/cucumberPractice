package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

    @Given("User wants to select a car type {string} from uber application")
    public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
        System.out.printf("step1 : " + carType);
    }
    @When("User select car {string} and pick up point {string} and drop location {string}")
    public void user_select_car_and_pick_up_point_and_drop_location(String carType, String pickUpLocation, String dropLocation) {
        System.out.printf("step2 : " + carType + " " + pickUpLocation + " " + dropLocation);
    }
    @Then("Driver starts the journey")
    public void driver_starts_the_journey() {
        System.out.printf("step3");
    }
    @Then("Driver ends the journey")
    public void driver_ends_the_journey() {
        System.out.printf("step4");

    }
    @Then("User pays {int} USD")
    public void user_pays_usd(Integer price) {
        System.out.printf("step5 : " + price);
    }

}

