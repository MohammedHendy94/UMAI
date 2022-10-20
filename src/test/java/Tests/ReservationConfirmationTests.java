package Tests;

import Pages.ReservationConfirmPage;
import io.cucumber.java.en.Then;

public class ReservationConfirmationTests {

    ReservationConfirmPage confirmPage;
    @Then("the reservation should be confirmed successfully")
    public void the_reservation_should_be_confirmed_successfully() {

        confirmPage = new ReservationConfirmPage();
        confirmPage.checkisbrowsmoreisdisplyed();
    }

}
