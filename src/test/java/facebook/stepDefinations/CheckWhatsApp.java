package facebook.stepDefinations;

import facebook.pageObject.PO_WhatsApp;
import org.openqa.selenium.support.PageFactory;

import utility.Utils;

public class CheckWhatsApp extends Utils {
    public static PO_WhatsApp page;
    public static int time = 3000;

    public static void main(String[] args) {

        page = new PO_WhatsApp();
        PageFactory.initElements(driver, page);
        try {
            launchWhatsApp();
            sleepHelper(5000);
            search("Linda");
            clickOnPersonsChat();
            //sleepHelper(2000);

            for (int i = 0;i < 15;i++) {
                typeMessage("Happy Birthday !!!!! ");
                send();
            }
            /*typeMessage("knha gayab ho jaa bay ");
            send();*/
            menu();
            sleepHelper(1000);
            logout();
            driver.quit();
        } catch (Exception e) {
            menu();
            logout();
            e.printStackTrace();
            driver.quit();
        }


    }

    public static void launchWhatsApp() {
        driver.navigate().to(getProperties("whatsAppWeb"));
    }

    public static void search(String number) {
        page.searchBox.sendKeys(number);

    }

    public static void clickOnPersonsChat() {
        page.person.click();
        sleepHelper(2000);
    }

    public static void typeMessage(String message) {

        page.textBox.sendKeys(message);
        //sleepHelper(500);
    }

    public static void send() {
        page.sendButton.click();
        //sleepHelper(500);
    }

    public static void menu() {
        page.menu.click();
        sleepHelper(2000);

    }

    public static void logout() {
        page.btnLogOut.click();
        sleepHelper(2000);

    }
}
