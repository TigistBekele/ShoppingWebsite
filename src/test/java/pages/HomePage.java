package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public final static String URL = "http://automationpractice.com/index.php";

	private WebDriver driver;

	// 1
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static String getUrl() {
		return URL;
	}
	
	@FindBy(id = "search_query_top")
	private WebElement searchinput;
	
	@FindBy(name  = "submit_search")
	private WebElement submitbutton;
	
	public void searchproduct(String product) {

		searchinput.sendKeys(product);
		
		submitbutton.click();
	}
	
}
