package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	public void escreve(String nome_campo, String texto) {
		driver.findElement(By.name(nome_campo)).clear();
		driver.findElement(By.name(nome_campo)).sendKeys(texto);
	}
	
	public void escreveId(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).clear();
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	public String obterValorCampo(String id_campo) {
		return driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public void clica(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void clicaName(String name) {
		driver.findElement(By.name(name)).click();
	}
	
	public void clicaLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	public void clicaClass(String class_name) {
		driver.findElement(By.className(class_name)).click();	
	}
	
	public boolean estaClicado(String id) {
		return driver.findElement(By.id(id)).isSelected();
	}
	
	public void alterPage(){
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.manage().window().maximize();
    }
	
	public String temTitulo(String class_name) {
		return driver.findElement(By.className(class_name)).getText();
	}
		
	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void clicarBotaoXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void clicarLink(String id) {
		driver.findElement(By.linkText(id)).click();
	}
	
	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}
	
	public String obterTextoById(String id) {
		return obterTexto(By.id(id));
	}
	
	public void selecionarCombo(String name, String valor) {
		WebElement element = driver.findElement(By.name(name));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public String obterValorCombo(String id) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	public void verificaTexto(String class_name, String texto) {
		driver.findElement(By.className(class_name)).getText().contains(texto);
	}
	
	
}

