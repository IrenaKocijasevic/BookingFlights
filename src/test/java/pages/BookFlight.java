package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BookFlight {
    WebDriver driver;

    public BookFlight(WebDriver driver) {
        this.driver = driver;
    }

    //ovde su pokupljeni selektori
    //1.predji na flight stranu; 2.dokle let; 3.datum; 4. broj osoba; 5.
    // predefinisano je da je let iz Beograda

    By flightsMenu = By.xpath("//span[contains(text(),'Flights')]");
    By whereTo = By.xpath("//div[@class='css-t9qs2f']//input[@type='text']");


    public void flightsPage(){
        clickflightsMenu ();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Flights - Booking.com");
        System.out.println("Title matching --> Part executed");
    }

    public void clickflightsMenu(){
        driver.findElement(flightsMenu).click();
    }

    //whereToFlight(whereToValue);
    public void  whereToFlight(String whereToValue){
        driver.findElement(whereTo).sendKeys( whereToValue);
    }


    }

