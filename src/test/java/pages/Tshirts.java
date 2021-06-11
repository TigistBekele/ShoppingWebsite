package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tshirts {
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
	private WebElement tshirts;

	public void tshirt() {
		tshirts.click();
	}
}
