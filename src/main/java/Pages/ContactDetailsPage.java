package Pages;


import Bases.Base;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

// this class designed for defining the web elements and the methods to handle these elements.
public class ContactDetailsPage extends Base {

    //Defining the page elements
    WebElement FirstName = driver.findElement(By.id("um-field--first-name"));
    WebElement LastName = driver.findElement(By.id("um-field--last-name"));
    WebElement PhoneCode = driver.findElement(By.name("phoneCountry"));
    WebElement PhoneNumber = driver.findElement(By.id("um-field--phone-number"));
    WebElement Email = driver.findElement(By.id("um-field--email"));
    WebElement Termschecbox = driver.findElement(By.id("um-field-checkbox"));
    WebElement ConfirmationButton = driver.findElement(By.id("ums-confirm-reservation-details-button"));


    //Defining methods to handle the webelements

    //method to set the first and last name
    public void SetNAmes(String firstname, String lastname){
        FirstName.sendKeys(firstname);
        LastName.sendKeys(lastname);
    }
    //method to set the phone code with number
    public void setthePhonenumber (String code, String number){
        Select sel = new Select(PhoneCode);
        sel.selectByValue(code);
        PhoneNumber.sendKeys(number);
    }
    //method to set the email
    public void settheemail(String email){
        Email.sendKeys(email);
    }
    //method to accept the terms
    public void accpttheterms(){
        Termschecbox.click();
    }
    //method to confirm the reservation
    public void confirmReservation(){
        ConfirmationButton.click();
    }
    //method to canell the popup of membership question
    public static void cancelingmembership(){
    WebElement Cancelmemberbutton = driver.findElement(By.xpath("//button[@class='um-dialog__button--cancel']"));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    Cancelmemberbutton.click();
    }
    //method to check that user is on the contact details page now
    public void checkuserisincontactpage (){
        boolean s = Email.isDisplayed();
        Assert.isTrue(s, "Button not displyed");
    }




}
