package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends BasePage{

	public ResultsPage(WebDriver driver) {
		super(driver);
		
	}

    private By productLink = By.xpath("(//h2[contains(@class, 'a-size-mini')]//a[contains(@class, 'a-link-normal')]//span[contains(@class, 'a-text-normal')])[1]");
    public void clickProductLink() {
        clickElement(productLink);
    }
    public String getProductLink() {
        return getTextFromElement(productLink).trim().substring(0,30);
    }

    private By searchResultTitle = By.xpath("//span[@class=\"a-color-state a-text-bold\"]");
    public String getSearchResultTitle() {
        return getTextFromElement(searchResultTitle);
    }

}
