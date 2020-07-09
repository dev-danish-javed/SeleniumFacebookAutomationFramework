package facebook.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_WhatsApp {


    @FindBy(xpath = "//div[@class='_3FRCZ copyable-text selectable-text']")
    public WebElement searchBox;

    @FindBy(xpath = "//img[contains(@src,'PhoneNumberOfThePerson')]")
    public WebElement person;

    @FindBy(xpath = "//div[contains(@class,'copyable-text selectable-text')][@spellcheck]")
    public  WebElement textBox;

    @FindBy(xpath = "//span[@data-icon='send']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@data-icon='menu']")
    public  WebElement menu;

    @FindBy(xpath = "//div[@title='Log out']")
    public WebElement btnLogOut;

}
