package facebook.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utility.Utils;

import java.util.List;

public class PO_Facebook {


    public WebElement txtPerson2;


    public void setXpathForPerson(String givenName) {
        try {
            txtPerson2 = Utils.driver.findElement(By.xpath("//div[contains(text(),'Contacts')]/..//div[contains(text(),'" + givenName + "')]"));
        } catch (NoSuchElementException e) {
            txtPerson2 = Utils.driver.findElement(By.xpath("//span[contains(text(),'Contacts')]/../..//span[contains(text(),'" + givenName + "')]"));
        }
    }


    @FindBy(xpath = "//input[@name='email']")
    public WebElement txtBxEmail;

    @FindBy(xpath = "//input[@name='pass']")
    public WebElement txtBxPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement btnLogin;

    @FindAll({
            @FindBy(xpath = "//div[@id='userNavigationLabel']"),
            @FindBy(xpath = "//div[@aria-label='Account']")
    })
    public List<WebElement> options;

    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    public WebElement btnLogOut;


    @FindBy(xpath = "//input[@aria-label='Search Messenger']")
    public WebElement txtBxSearch;

    @FindAll(
            {
                    @FindBy(xpath = "//div[contains(@aria-label,'Messenger')][@tabindex='0']"),
                    @FindBy(xpath = "//a[@title='Messenger']")
            }
    )
    public List<WebElement> btnMessenger;

    @FindBy(xpath = "//div[contains(@class,'notranslate')][@tabindex=0]")
    public WebElement txtBxMessage;

    @FindAll({
            @FindBy(xpath = "//div[contains(@aria-label,'Press Enter to send')]"),
            @FindBy(xpath = "//a[@aria-label='Send']")
    })
    public List<WebElement> btnSend;

}
