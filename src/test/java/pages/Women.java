package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {


	private final static String URL = "http://automationpractice.com/index.php?id_category=3&controller=category";

	private WebDriver driver;

	public Women(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement womens;

	public void womens() {
		womens.click();
	}

	public static String getUrl() {
		return URL;
	}

	@FindBy(id = "search_query_top")
	private WebElement searchinput;

	@FindBy(name = "submit_search")
	private WebElement submitbutton;

	public void searchproduct(String product) {

		searchinput.sendKeys(product);

		submitbutton.click();
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/p")
	private WebElement resfound;

	public WebElement searchAssert(String product) {
			return resfound;
}
}
