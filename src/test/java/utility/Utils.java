package utility;


import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Utils {
    public static WebDriver driver;
    public static Logger logger= LogManager.getLogger();

    static {
        logger.info("\n\n========================================================== STARTING EXECUTION ==========================================================\n");
        driver =WebDriverFactory.createWebDriver();
        logger.info("Driver Initialized");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        logger.info("Browser maximized");


    }


    public static void sleepHelper(int time) {
        try {
            logger.info("Going to sleep for "+time/1000+" sec");
            Thread.sleep(time);
        } catch (InterruptedException e) {
            logger.error("Exception occurred : "+e.getMessage());
        }
    }

    public static String getProperties(String key) {
        try {
            PropertiesConfiguration prop = new PropertiesConfiguration(".\\src\\test\\resources\\Properties\\Data.properties");
            return prop.getString(key);
        } catch (Exception e) {
            logger.error("Exception occurred : "+e.getMessage());
        }
        return null;
    }

    public static boolean navigateTo(String url)
    {
        boolean navigated;
        try
        {
            driver.navigate().to(url);
            sleepHelper(3000);
            navigated=true;
            logger.info("Navigated to site");
        }
        catch (Exception e)
        {
            takeScreenshot();
            logger.error("Exception occurred while navigating : "+e.getMessage());
            navigated=false;

        }

        return navigated;
    }

    public static boolean clickOnButton(WebElement button)
    {
        boolean click;
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.elementToBeClickable(button));
            button.click();
            click=true;
            logger.info("Clicked on button ...");
        }catch (Exception e)
        {
            takeScreenshot();
            logger.error("Exception occurred while clicking on button : "+e.getMessage());
            click=false;
        }

        return click;
    }
    public static boolean enterValue(WebElement textBox,String text)
    {

        boolean sent;
        try
        {
            textBox.sendKeys(text);
            sent=true;
        }
        catch (Exception e)
        {
            takeScreenshot();
            logger.error("Exception occurred while entering value : "+e.getMessage());
            e.printStackTrace();
            sent=false;
        }
        return sent;

    }
    public static boolean pressButton(WebElement webElement, Keys key)
    {
        boolean pressed;
        try
        {
            logger.info("pressing button");
            webElement.sendKeys(key);
            pressed=true;
            logger.info("Button pressed");
        }
        catch (Exception e)
        {
            takeScreenshot();
            logger.error("Error while pressing button : "+e.getMessage());
            pressed=false;

        }
        return pressed;

    }
    public static boolean closeBrowser()
    {
        logger.info("Closing browser");
        boolean closed=false;
        try{
            driver.quit();
            driver.getCurrentUrl();
        }
        catch (NoSuchSessionException e)
        {
            logger.info("browser closed");
            closed=true;
        }
        catch (Exception e)
        {
            takeScreenshot();
            logger.error("Error while closing the browser "+e.getMessage());
        }

        return closed;

    }

    public static void takeScreenshot()
    {

        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
        Date date = new Date();

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(".\\Screenshot\\"+formatter.format(date)+".png");
        try{
            FileUtils.copyFile(SrcFile, DestFile);
        }catch (IOException e)
        {
            logger.error("Error while taking screenshot "+ e.getMessage());
        }
    }
}
