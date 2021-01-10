package steps;

import core.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;


public class ComumSteps extends BasePage {
	
	private LoginPage page = new LoginPage(getDriver());

	@And("fecho o navegador")
	public void fechoONavegador() {
		killDriver();
	}

}
