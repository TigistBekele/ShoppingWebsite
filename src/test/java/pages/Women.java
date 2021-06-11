package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Women {

//	private static final String URL = "http://automationpractice.com/index.php";

	@FindBy(xpath = " //header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
	private WebElement women;

//	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
//	private WebElement top;
//	
//	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[2]/div[1]/a[1]/img[1]")
//	private WebElement blouse;
//	
//	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]")
//	private WebElement cart;
//	
//	
//	@FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
//	private WebElement checkout;

	public void womens() {
		women.click();
	}

//	public void tops() {
//		top.click();
//	}
//	
//	public void blouses() {
//		blouse.click();
//	}
//	
//	public void carts() {
//		cart.click();
//	}
//	public void checkouts() {
//		checkout.click();
//	}
}
