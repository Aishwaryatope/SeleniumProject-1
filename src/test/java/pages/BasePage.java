package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestConfig;

public class BasePage {

	
	   protected WebDriver driver;
	    protected WebDriverWait wait;

	    
	    public BasePage(WebDriver driver) {
	    	this.driver = driver;
	    WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(30));
	    }

	    protected WebElement findElement(By locator) {
	         return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }

	    protected void clickElement(By locator) {
	        WebElement element = findElement(locator);
	        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	    }

	    protected void sendKeysToElement(By locator, String text) {
	        WebElement element = findElement(locator);
	        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
	    }

	    protected String getTextFromElement(By locator) {
	        WebElement element = findElement(locator);
	        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
	    }

	    public void openURL(String url) {
	        driver.get(TestConfig.BASE_URL);
	    }
	}