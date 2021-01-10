package pageObjects;

import core.DSL;
import org.openqa.selenium.WebDriver;

public class ReportIssuePage {

	private DSL dsl;
	
	public ReportIssuePage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void clicaReportIssue() {
		dsl.clicaLink("Report Issue");
	}
	
	public void selecionarProjeto() {
		dsl.selecionarCombo("project_id", "Danielle Barbosa's Project");
	}
	
	public void clicaSelectProject() {
		dsl.clicaClass("button");
	}
	
	public void selecionarCategoria(String valor) {
		dsl.selecionarCombo("category_id", valor);
	}
	
	public void selecionarReproducibility(String valor) {
		dsl.selecionarCombo("reproducibility", valor);
	}
	
	public void selecionarSeverity(String valor) {
		dsl.selecionarCombo("severity", valor);
	}
	
	public void selecionarPriority(String valor) {
		dsl.selecionarCombo("priority", valor);
	}
	
	public void selecionarProfile(String valor) {
		dsl.selecionarCombo("profile_id", valor);
	}
	
	public void escreverPlataforma(String texto) {
		dsl.escreveId("platform", texto);
	}
	
	public void escreverOs(String texto) {
		dsl.escreveId("os", texto);
	}
	
	public void escreveOsVersion(String texto) {
		dsl.escreveId("os_build", texto);
	}
	
	public void escreveSumario(String texto) {
		dsl.escreve("summary", texto);
	}
	
	public void escreveDescricao(String texto) {
		dsl.escreve("description", texto);
	}
	
	public void clicaStatus() {
		dsl.clicaName("view_state");
	}
	
	public void clicaSubmit() {
		dsl.clicaClass("button");
	}
	
	public String confereErro() {
		return dsl.temTitulo("form-title");
	}
	
	
}
