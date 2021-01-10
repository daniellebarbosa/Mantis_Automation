package pageObjects;

import core.DSL;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private DSL dsl;
	
	public LoginPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void setUsername(String nome) {
		dsl.escreve("username", nome);
	}
	
	public void setPassword(String password) {
		dsl.escreve("password", password);
	}
	
	public void clickLogin() {
		dsl.clicaClass("button");
	}
	
	public void clickLostPassword() {
		dsl.clicaLink("Lost your password?");
	}
	
	public String tituloPag() {
		return dsl.temTitulo("form-title");
	}
	
	public void clicaLogout() {
		dsl.clicaLink("Logout");
	}
	
	public void verificaLogin(String name) {
		dsl.verificaTexto("login-info-left", name);
	}
	
}
