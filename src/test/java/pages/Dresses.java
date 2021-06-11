package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dresses {

//	private static final String URL = "http://automationpractice.com/index.php";
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	private WebElement dress;



//	public static String getUrl() {
//		return URL;
//	}

	public void dress() {
		dress.click();
	}
	
}
