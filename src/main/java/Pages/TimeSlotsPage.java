package Pages;


import Bases.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

// this class designed for defining the web elements and the methods to handle these elements.
public class TimeSlotsPage extends Base {

    //Defining the page elements
    WebElement Calendar = driver.findElement(By.id("um-reservation-date-picker"));
    WebElement NoPeople = driver.findElement(By.xpath("//div[@class=' css-wd6r5-control']"));
    WebElement TimeSlot = driver.findElement(By.id("timeslot----0"));
  //  WebElement SkyBarOp = driver.findElement(By.xpath("(//button[@class='um-location-popover__button'])[1]"));
  //  WebElement IndoorOp = driver.findElement(By.xpath("(//button[@class='um-location-popover__button'])[2]"));

   //Defining methods to handle the webelements

    //method to set the date
    public void SetTheDate(){
        // Calendar.clear();
       // Calendar.sendKeys("Sun, 30/10/2022");
       JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("arguments[0].setAttribute('value','30/10/2022');", Calendar );
    }
    //method to set the number of people
    public void selectnoofpepole(){
     //   Select sel = new Select(NoPeople);
       // sel.selectByIndex(4);
    }

    //method to click on the first available timeslot
    public void selectthetimeslot(){
        TimeSlot.click();
    }

    //method to select the location popover
    public static void selectlocation_popover(String location){
        /*
        WebElement SkyBarOp = driver.findElement(By.xpath("(//button[@class='um-location-popover__button'])[1]"));
        WebElement IndoorOp = driver.findElement(By.xpath("(//button[@class='um-location-popover__button'])[2]"));
        switch (location)
        {
            case "Sky Bar":
                SkyBarOp.click();
            case "Indoors":
                IndoorOp.click();
        }
        */

    }

}
