package pageObjects;

import core.DSL;
import org.openqa.selenium.WebDriver;

public class MyViewPage {
	
	private DSL dsl;
	
	public MyViewPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void clicaMyView() {
		dsl.clicaLink("My View");
	}
	
	public void clicaUnassigned() {
		dsl.clicaLink("Unassigned");
	}
	
	public void clicaReportByMe() {
		dsl.clicaLink("Reported by Me");
	}
	
	public void clicaRecentlyModified() {
		dsl.clicaLink("Recently Modified");
	}
	
	public void selecionaProjeto(String valor) {
		dsl.selecionarCombo("project_id", valor);
	}
	
	public void clicarProjeto() {
		dsl.clicaLink("0005516");
	}
	
	public void verificaProjeto(String name) {
		dsl.verificaTexto("row-1", name);
	}
	
	public void escreveIssue(String valor) {
		dsl.escreve("bug_id", valor);
	}
	
	public void clicaJump() {
		dsl.clicarBotaoXpath("//input[@type=\"submit\"][@value=\"Jump\"]");
	}
}
