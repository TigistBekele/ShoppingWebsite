package test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Dresses;
import pages.HomePage;
import pages.Tshirts;
import pages.Women;

public class ShoppingWebsiteTest {

	static WebDriver driver;

	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}

	@Before
	public void setup() throws TimeoutException {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(HomePage.getUrl());
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {

		HomePage nav = PageFactory.initElements(driver, HomePage.class);

		Women wom = PageFactory.initElements(driver, Women.class);

		Dresses dre = PageFactory.initElements(driver, Dresses.class);

		Tshirts tsh = PageFactory.initElements(driver, Tshirts.class);

		nav.navWomen();
		Thread.sleep(5000);

		wom.womens();
		Thread.sleep(5000);

//		wom.tops();
//		Thread.sleep(5000);
//		
//		wom.blouses();
//		Thread.sleep(5000);
//		
//		wom.carts();
//		Thread.sleep(5000);
//		
//		wom.checkouts();
//		Thread.sleep(5000);

		nav.navDress();
		Thread.sleep(5000);

		dre.dress();
		Thread.sleep(5000);

		nav.navTshirt();
		Thread.sleep(5000);

		tsh.tshirt();
		Thread.sleep(5000);


	}
}
