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


public class LoginSteps extends BasePage {
	
	private LoginPage page = new LoginPage(getDriver());

	@Given("eu estou na página de login")
	public void euEstouNaPáginaDeLogin() {
		getDriver();
	}

	@When("eu digito meus dados")
	public void euDigitoMeusDados() {
		page.setUsername("danielle.barbosa");
		page.setPassword("Teste1");
	}

	@And("clico no botão de login")
	public void clicoNoBotãoDeLogin() {
		page.clickLogin();
	}

	@Then("I logged")
	public void iLogged() {
		page.verificaLogin("danielle.barbosa");
	}

	@Then("eu deslogo")
	public void euDeslogo() {
		page.clicaLogout();
		Assert.assertEquals("Login", page.tituloPag());
	}

	@When("eu clico em Lost your Password")
	public void euClicoEmLostYourPassword() {
		page.clickLostPassword();
	}

	@Then("eu estou na página de esqueci senha")
	public void euEstouNaPáginaDeEsqueciSenha() {
		Assert.assertEquals("Password Reset", page.tituloPag());
	}

}
