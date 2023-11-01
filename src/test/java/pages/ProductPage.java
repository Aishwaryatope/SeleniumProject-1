package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

	    public ProductPage(WebDriver driver) {
		super(driver);
		
	}

		private By addToCartBtn = By.id("add-to-cart-button");
	    public void clickAddToCartBtn() {
	        clickElement(addToCartBtn);
	    }

	    private By productTitle = By.id("productTitle");
	    public String getProductTitle() {
	        return getTextFromElement(productTitle).trim().substring(0,30);
	    }
	}


