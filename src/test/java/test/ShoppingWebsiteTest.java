package test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Dresses;
import pages.HomePage;
import pages.Tshirts;
import pages.Women;

public class ShoppingWebsiteTest {

	
	private static final String URL = "http://automationpractice.com/index.php";
	
	private WebDriver driver;
	private WebElement searchproducts;


	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}

	// 1
	@Test
	public void successfullsearchproduct() throws InterruptedException {

		String product = "Tops";

		
		driver.get(HomePage.URL);

		Dresses dressespage = new Dresses(driver);
		Tshirts tshirtspage = new Tshirts(driver);
		Women womenpage = new Women(driver);

		dressespage.dresses();
		dressespage.searchproduct(product);
		Thread.sleep(5000);

		womenpage.womens();
		womenpage.searchproduct(product);
		Thread.sleep(5000);

		tshirtspage.tshirts();
		tshirtspage.searchproduct(product);
		Thread.sleep(5000);

		WebElement target1 = dressespage.searchAssert(product);
		WebElement target2 = womenpage.searchAssert(product);
		WebElement target3 = tshirtspage.searchAssert(product);

		String resultText1 = target1.getText();
		String resultText2 = target2.getText();
		String resultText3 = target3.getText();

		Boolean last1 = resultText1.contains("No results were found for your search ");
		Boolean last2 = resultText2.contains("No results were found for your search ");
		Boolean last3 = resultText3.contains("No results were found for your search ");


		assertTrue(last1);
		assertTrue(last2);
		assertTrue(last3);
		Thread.sleep(5000);
	}



	@After
	public void tearDown() {
		driver.close();
	}
	
}
