package PageTeste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {
	
	WebDriver driver; 
	
	
	public final String CAMPO_BUSCA = "//input[@id='twotabsearchtextbox']"; 
	
	
	
	public StartPage(WebDriver another_driver) {
		
		this.driver = another_driver;
	}
	
	public void buscaProduto() {
		driver.findElement(By.xpath(CAMPO_BUSCA)).sendKeys("Kindle");
		driver.findElement(By.xpath(CAMPO_BUSCA)).submit();
	}
	
	

}
