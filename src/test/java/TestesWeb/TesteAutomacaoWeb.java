package TestesWeb;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageTeste.PageLook;
import PageTeste.PickPage;
import PageTeste.StartPage;



public class TesteAutomacaoWeb {

	static ChromeDriver driver;
	
	StartPage start = new StartPage(driver);
	PageLook buscaPage = new PageLook(driver);
	PickPage carPage = new PickPage(driver);
	

	@BeforeClass
	public static void beforeClass() {
		driver = setupChromeDriver();
		driver.get("https://www.amazon.com.br/");

		

	}

	public void testeBuscaProdutoAmazon() {
		
		start.buscaProduto();
		buscaPage.clicarProduto();
		buscaPage.validarProdutoNatela();

	}
	
	
	@Test
	public void testeBuscaCarrinhoProdutoAmazon() {
		
		start.buscaProduto();
		buscaPage.clicarProduto();
		carPage.adicionarCarrinho();
		carPage.pularRecomendacao();
		carPage.adicionarCarrinho();
		carPage.clicarCarrinho();
		carPage.validarProdutoNoCarrinho();
	}

//	@AfterClass
//	public static void AfterClass() {
//		
//		driver.quit();
//	}

	public static ChromeDriver setupChromeDriver() {

		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

}
