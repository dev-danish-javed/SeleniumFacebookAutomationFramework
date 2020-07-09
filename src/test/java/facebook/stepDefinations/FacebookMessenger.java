package facebook.stepDefinations;

import facebook.pageObject.PO_Facebook;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import utility.Utils;


public class FacebookMessenger extends Utils {



    static int time = 5000;
    static PO_Facebook page=PageFactory.initElements(driver,PO_Facebook.class);

    @Given("User navigates to {string}")
    public void user_navigates_to(String site) {

        navigateTo(getProperties(site));
        //navigateTo(getProperties(site));
    }

    @Then("User login in the site using id {string} and password {string}")
    public void login(String id, String password) {
       enterValue(page.txtBxEmail,getProperties("facebookEmailId"));
        enterValue(page.txtBxPassword,getProperties("facebookPassword"));
        clickOnButton(page.btnLogin);
        sleepHelper(1000);
    }

    @And("User clicks on Messenger button")
    public void user_clicks_on_Messenger_button() {
        page.btnMessenger.get(0).click();
    }

    @And("User search for {string} in messenger")
    public void user_search_for(String person) {
        clickOnButton(page.txtBxSearch);
        enterValue(page.txtBxSearch,getProperties(person));
        //pressButton(page.txtBxSearch,Keys.ENTER);
        sleepHelper(1000);
    }

    @And("User clicks on persons {string} chat")
    public void user_clicks_on_personsChat(String personProperty) {
        page.setXpathForPerson(getProperties(personProperty));
        clickOnButton(page.txtPerson2);
    }

    @And("User types message {string}")
    public void typeMessage(String message) {
        enterValue(page.txtBxMessage,getProperties(message));
    }

    @And("User clicks send button")
    public void user_clicks_send_button() {
        clickOnButton(page.btnSend.get(0));
    }

    @And("User logs out")
    public void user_logs_out() {
        clickOnButton(page.options.get(0));
        clickOnButton(page.btnLogOut);
    }

    @And("User closes the browser")
    public void user_closes_the_browser() {
        closeBrowser();
    }
}
