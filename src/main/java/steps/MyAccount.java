package steps;

import core.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class MyAccount extends BasePage {

    private MyAccountPage page = new MyAccountPage(getDriver());
    private LoginPage pageLogin = new LoginPage(getDriver());

    @Given("eu estou logada")
    public void euEstouLogada() {
        pageLogin.setUsername("danielle.barbosa");
        pageLogin.setPassword("Teste1");
        pageLogin.clickLogin();
    }

    @When("eu clico em My Account")
    public void euClicoEmMyAccount() {
        page.clicaMyAccount();
        Assert.assertEquals("Edit Account", page.verificaPag());
    }
    @And("eu clico em Preferences")
    public void euClicoEmPreferences() {
        page.clicaPreferences();
        Assert.assertEquals("Account Preferences", page.verificaPag());
    }

    @And("eu clico em Manage Columns")
    public void euClicoEmManageColumns() {
        page.clicaManageColumns();
        Assert.assertEquals("Manage Columns", page.verificaPag());
    }

    @And("eu clico em Profiles")
    public void euClicoEmProfiles() {
        page.clicaProfiles();
        Assert.assertEquals("Add Profile", page.verificaPag());
    }

}
