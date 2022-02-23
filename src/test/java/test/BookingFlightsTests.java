package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BookFlight;

public class BookingFlightsTests extends BaseTest {
    @BeforeMethod
    @Parameters
            ({"BROWSER","BROWSER_VERSION","WAIT_TIME","ENV"})

    public void setUP(String browser, String browserVersion, String waitTime, String env) throws Exception {
        setUPTest(browser, browserVersion, Integer.parseInt(waitTime));
        startApplication(env);
    }

    @AfterMethod
    public void tearDown(){
        quit();
    }

    @Test
    public void goToFlightsPage() {
        BookFlight bookFlight = new BookFlight(driver);
        bookFlight.flightsPage();
 }
}
