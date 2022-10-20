package Pages;

import Bases.Base;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReservationConfirmPage extends Base {

    //Defining the page elements
    WebElement BrowsMoreBtn = driver.findElement(By.id("ums-browse-more-button"));
    WebElement DoneBtn = driver.findElement(By.id("ums-done-button"));


    //Defining methods to handle the webelements

    //method to check that user is on the confirmation page now
    public void checkisbrowsmoreisdisplyed (){
        boolean s = BrowsMoreBtn.isDisplayed();
        Assert.isTrue(s, "Button not displyed");
    }


}
