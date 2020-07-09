package facebook.stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utility.Utils;

public class Hooks extends Utils {


    @After
    public void afterTest(Scenario scenario) {
        if (scenario.isFailed()) {
            FacebookMessenger facebookMessenger=new FacebookMessenger();
            try{
                driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
                driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
            }catch (NoSuchElementException e)
            {
                facebookMessenger.user_logs_out();

            }
            finally {
                closeBrowser();
            }

            sleepHelper(2000);
            facebookMessenger.user_closes_the_browser();
        }
    }

}
