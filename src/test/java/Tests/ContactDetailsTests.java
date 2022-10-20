package Tests;

import Pages.ContactDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactDetailsTests {

    ContactDetailsPage contactdet;

    @When("user is navigated to contact details screen")
    public void user_is_navigated_to_contact_details_screen() {
        contactdet = new ContactDetailsPage();

    }

    @When("user enter his first name as {string} and last name as {string}")
    public void user_enter_his_first_name_and_last_name(String firstname, String lastname) {
        contactdet = new ContactDetailsPage();
        contactdet.SetNAmes(firstname,lastname);
    }

    @When("choose his country code as {string} and enter phone number as {string}")
    public void choose_his_country_code_and_enter_phone_number(String code, String number) {
        contactdet = new ContactDetailsPage();
        contactdet.setthePhonenumber(code,number);
    }
    @When("send his email address as {string}")
    public void send_his_email_address(String email) {
        contactdet = new ContactDetailsPage();
        contactdet.settheemail(email);
    }
    @When("click agree to UMAI's terms")
    public void click_agree_to_umai_s_terms() {
        contactdet = new ContactDetailsPage();
        contactdet.accpttheterms();
    }
    @When("click confirm reservation button")
    public void click_confirm_reservation_button() {
        contactdet = new ContactDetailsPage();
        contactdet.confirmReservation();
    }
    @When("choose to not being a member")
    public void choose_to_not_being_a_member() {
        contactdet = new ContactDetailsPage();
        contactdet.cancelingmembership();
    }

    @Then("App should keep the user in the contact details page")
    public void appShouldKeepTheUserInTheContactDetailsPage() {
        contactdet = new ContactDetailsPage();
        contactdet.checkuserisincontactpage();
    }
}
