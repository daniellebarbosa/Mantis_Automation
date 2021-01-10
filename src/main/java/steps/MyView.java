package steps;

import core.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Test;
import pageObjects.LoginPage;
import pageObjects.MyViewPage;

public class MyView extends BasePage {

    private MyViewPage page = new MyViewPage(getDriver());
    private LoginPage pageLogin = new LoginPage(getDriver());

    @When("eu seleciono o projeto")
    public void euSelecionoOProjeto() {
        page.selecionaProjeto("Danielle Barbosa's Project");
    }

    @And("clico em Unassigned")
    public void clicoEmUnassigned() {
        page.clicaUnassigned();
    }

    @And("clico em um projeto")
    public void clicoEmUmProjeto() {
        page.clicarProjeto();
    }

    @Then("verifico se o projeto é meu")
    public void verificoSeOProjetoÉMeu() {
        page.verificaProjeto("Danielle Barbosa's Project");
    }

    @When("eu digito numero da issue")
    public void euDigitoNumeroDaIssue() {
        page.escreveIssue("0005516");
    }

    @And("clico em Jump")
    public void clicoEmJump() {
        page.clicaJump();
    }

    @Then("encontro o projeto")
    public void encontroOProjeto() {
        page.verificaProjeto("0005516");
    }
}
