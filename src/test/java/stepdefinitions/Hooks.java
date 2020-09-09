package stepdefinitions;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //@Before is similar to @BeforeMethod in TestNG
    //In our case, @Before will run before each scenario
    //GLOBAL Hooks Annotation
    //This will run before every scenario
    @Before(order = 1)
    public void setUp(){
        //System.out.println("This is setUp Method in the Hooks");
    }

    //TAGGED Hooks Annotation
    //This will run before any specific scenario
    @Before(value = "@iphone", order=2)
    public void searchIphone(){

        //System.out.println("This is IPHONE SETUP Method in the Hooks");
       // Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    //This runs after each Scenario
    @After
    public void tearDown(Scenario scenario){
        //System.out.println("This is tearDown Method in the Hooks");

        //Taking the screenshot
        final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        //we are embeding the screenshots as an image in our framework
        //we should get screenshot after every FAILING Scenario
        //Attaching the image if scenario fails
        if(scenario.isFailed()) {
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }



}
