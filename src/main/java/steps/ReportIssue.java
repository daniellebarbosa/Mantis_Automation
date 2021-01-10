package steps;

import core.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.LoginPage;
import pageObjects.ReportIssuePage;

public class ReportIssue extends BasePage {

    private ReportIssuePage page = new ReportIssuePage(getDriver());
    private LoginPage pageLogin = new LoginPage(getDriver());

    @When("eu clico em report issue")
    public void euClicoEmReportIssue() {
        page.clicaReportIssue();
    }

    @And("escolho um projeto")
    public void escolhoUmProjeto() {
        page.selecionarProjeto();
        page.clicaReportIssue();
    }

    @And("preencho os dados da issue")
    public void preenchoOsDadosDaIssue() {
        page.selecionarCategoria("[All Projects] 7EI2PODHPN");
        page.selecionarReproducibility("always");
        page.selecionarSeverity("major");
        page.selecionarPriority("high");
        page.selecionarProfile("PC Windows 7");
        page.escreverPlataforma("Windows");
        page.escreverOs("OS 01");
        page.escreveOsVersion("1.4");
        page.escreveSumario("Erro no login");
        page.escreveDescricao("Erro ao tentar fazer o login");
        page.clicaStatus();
    }

    @Then("clico em submit")
    public void clicoEmSubmit() {
        page.clicaSubmit();
    }

    @And("não preencho a categoria")
    public void nãoPreenchoACategoria() {
        page.clicaSubmit();
    }

    @Then("gera um erro de criação da issue")
    public void geraUmErroDeCriaçãoDaIssue() {
        Assert.assertEquals("APPLICATION ERROR #11", page.confereErro());
    }

    @And("não preencho o sumario")
    public void nãoPreenchoOSumario() {
        page.selecionarCategoria("[All Projects] 7EI2PODHPN");
        page.clicaSubmit();
    }

    @And("não preencho a descrição")
    public void nãoPreenchoADescrição() {
        page.selecionarCategoria("[All Projects] 7EI2PODHPN");
        page.escreveSumario("Erro no login");
        page.clicaSubmit();
    }
}
