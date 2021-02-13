package stepDefinitions;

import com.ParaBank.base.BaseClass;
import com.ParaBank.pages.LoginPage;
import com.ParaBank.pages.RegisterPage;
import com.google.common.base.Verify;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.FileNotFoundException;

/**
 * Created by RUTHERFORD on 2/12/2021.
 */
public class LoginPageDefinition extends BaseClass {
    public static LoginPage loginPage;
    public static RegisterPage registerPage;

    public LoginPageDefinition() throws FileNotFoundException {
        super();
    }
    @Given("^launches browser and opens ParaBank$")
    public void launches_browser_and_opens_ParaBank() throws FileNotFoundException {
        // Write code here that turns the phrase above into concrete actions
        initialization();
        loginPage=new LoginPage(driver);
        registerPage=new RegisterPage(driver);
    }

    @Given("^enter Username$")
    public void enter_Username() {
        // Write code here that turns the phrase above into concrete actions
       loginPage.setUsername("JDaniels");
    }

    @Given("^enters Password$")
    public void enters_Password() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.setPassword("1234");
    }

    @Then("^User clicks on login Button$")
    public void user_clicks_on_login_Button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.setLoginButton();
    }

    @Then("^User verify's accounts overview$")
    public void user_verify_s_accounts_overview() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        loginPage.setacoverview();
        Verify.verify(true);
        Thread.sleep(3000);
    }

    @Then("^User log's out$")
    public void user_log_s_out() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.setLogoutButton();
    }

}
