package Tests;

import Bases.Base;
import Pages.TimeSlotsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TimeSlotsTests extends Base {

    TimeSlotsPage timepag;


    @Given("user open the reservations tab")
    public void user_open_the_reservations_tab() {

        launch_browser();
    }
    @When("user select data")
    public void user_select_data() {
        timepag = new TimeSlotsPage();
        timepag.SetTheDate();
    }
    @When("select the number of people")
    public void select_the_number_of_people() {
        timepag = new TimeSlotsPage();
        timepag.selectnoofpepole();
    }
    @When("choose a slot time")
    public void choose_a_slot_time() {
        timepag = new TimeSlotsPage();
        timepag.selectthetimeslot();
    }


    @And("choose the location_popover as {string}")
    public void chooseTheLocation_popoverAs(String choice) {
       // timepag = new TimeSlotsPage();
        timepag.selectlocation_popover(choice);
    }
}
