package stepDefinitions;

import com.ParaBank.base.BaseClass;
import com.ParaBank.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 2/11/2021.
 */
public class RegisterPageDefinition extends BaseClass {
    public static RegisterPage registerPage;

    public RegisterPageDefinition() throws FileNotFoundException {
        super();
    }

    @Given("^User launches browser and opens ParaBank$")
    public void user_launches_browser_and_opens_ParaBank() throws FileNotFoundException {
        // Write code here that turns the phrase above into concrete actions
        initialization();
        registerPage=new RegisterPage(driver);
    }

    @Given("^User clicks on Register Button$")
    public void user_clicks_on_Register_Button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setMainregister();
    }

    @Then("^User enters FirstName$")
    public void user_enters_FirstName() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setFirstName("Johnson");
    }

    @Then("^User enters LastName$")
    public void user_enters_LastName()  {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setLastName("Daniels");
    }

    @Then("^User enters Address$")
    public void user_enters_Address() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setAddress("101 Mainstreet Blvd");
    }

    @Then("^User enters City$")
    public void user_enters_City() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setCity("Downtown");
    }

    @Then("^User enters State$")
    public void user_enters_State() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setState("Governorstate");
    }

    @Then("^User enters ZipCode$")
    public void user_enters_ZipCode() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setZipcode("10101");
    }

    @Then("^User enters PhoneNumber$")
    public void user_enters_PhoneNumber() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setPhoneNumber("+12847573905");
    }

    @Then("^User enters SSN$")
    public void user_enters_SSN() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setSsn("890-45-7245");
    }
    @Then("^User enters Username$")
    public void user_enters_Username(){
        // Write code here that turns the phrase above into concrete actions
        registerPage.setUsername("JDaniels");
    }

    @Then("^User enters Password$")
    public void user_enters_Password() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setPassword("1234");
    }

    @When("^User confirms Password$")
    public void user_confirms_Password() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setConfirmpassword("1234");
    }

    @Then("^User clicks register Button$")
    public void user_clicks_register_Button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.setRegisterButton();
    }

}
