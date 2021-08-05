package PageTeste;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLook {

	WebDriver driver;

	public PageLook(WebDriver another_driver) {

		this.driver = another_driver;
	}

	public final String PRODUTO = "//span[contains(text(),'Kindle 10a. geração com iluminação embutida – Cor ')]";
	
	
	public final String PRODUTO_RESULTADO = "//span[@id='productTitle']"; 

	public void clicarProduto() {
		driver.findElement(By.xpath(PRODUTO)).click();
	}
	
	public void validarProdutoNatela() {
		
		Assert.assertTrue("Erro ao validar produto", driver.findElement(By.xpath(PRODUTO_RESULTADO)).getText().contains("Kindle 10a"));
		
	}
	

}
