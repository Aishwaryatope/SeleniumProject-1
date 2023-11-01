package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	    public HomePage(WebDriver driver) {
		super(driver);	
	}	    
		private By searchTxtBox = By.id("twotabsearchtextbox");
	    public void setSearchTxtBox(String searchTxt) {
	        sendKeysToElement(searchTxtBox, searchTxt);
	    }

	    private By searchBtn = By.id("nav-search-submit-button");
	    public void clickSearchBtn() {
	        clickElement(searchBtn);
	    }

	    private By todayDealsBtn = By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb' and normalize-space(text())=\"Today's Deals\"]");
	    public void clickTodayDealsBtn() {
	        clickElement(todayDealsBtn);
	    }
	}
	
	
	
