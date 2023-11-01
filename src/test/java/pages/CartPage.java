package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{



	    public CartPage(WebDriver driver) {
		super(driver);
	
	}
		private By cartBtn = By.id("nav-cart");
	    public void clickCartBtn() {
	        clickElement(cartBtn);
	    }
	    private By cartProductTitle = By.xpath(("(//span[contains(@class, 'a-truncate-cut')])[1]"));
	    public String getCartProductTitle() {
	        return getTextFromElement(cartProductTitle).trim().substring(0,30);
	    }
	}
