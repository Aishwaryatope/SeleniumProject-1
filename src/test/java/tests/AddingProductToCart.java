package tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ResultsPage;
import utils.TestConfig;

public class AddingProductToCart {

	private static WebDriver driver;
    private HomePage homePage;
    private ResultsPage resultsPage;
    private ProductPage productPage;
    private CartPage cartPage;
    private String expectedResult, actualResult, productTitle;


    @BeforeTest
    public void setup() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajit Tamboli\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.com/");


        homePage = new HomePage(driver);
        resultsPage = new ResultsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);

        homePage.openURL(TestConfig.BASE_URL);
    }

    @Test (priority=1)
    public void testSearchFunction(){
        homePage.setSearchTxtBox("car accessories");
        homePage.clickSearchBtn();
        expectedResult = "\"car accessories\"";
        actualResult = resultsPage.getSearchResultTitle();

        Assert.assertEquals(actualResult, expectedResult, "Result of search data is wrong");
    }

    @Test (priority=2)
    public void testSelectFirstItem(){
        expectedResult = resultsPage.getProductLink();
        resultsPage.clickProductLink();
        productTitle = productPage.getProductTitle();

        Assert.assertEquals(productTitle, expectedResult, "The selected item is wrong");
    }

    @Test (priority=3)
    public void testAddItemToCart(){
        productPage.clickAddToCartBtn();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test (priority=4)
    public void testCheckItemAddedToCart(){
        cartPage.clickCartBtn();
        String cartProductTitle = cartPage.getCartProductTitle();
        Assert.assertEquals(cartProductTitle, productTitle, "The selected item didn't added to the cart");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}

