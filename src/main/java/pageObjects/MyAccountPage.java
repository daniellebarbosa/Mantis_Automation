package pageObjects;

import core.DSL;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
	
	private DSL dsl;
	
	public MyAccountPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void clicaMyAccount() {
		dsl.clicaLink("My Account");
	}
	
	public String verificaPag() {
		return dsl.temTitulo("form-title");
	}
	
	public void clicaPreferences() {
		dsl.clicaLink("Preferences");
	}
	
	public void clicaManageColumns() {
		dsl.clicaLink("Manage Columns");
	}
	
	public void clicaProfiles() {
		dsl.clicaLink("Profiles");
	}
}
