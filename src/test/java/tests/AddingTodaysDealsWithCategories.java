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
import pages.TodayDealsPage;
import utils.TestConfig;

public class AddingTodaysDealsWithCategories {
	 private static WebDriver driver;
	    private HomePage homePage;
	    private TodayDealsPage todayDealsPage;
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
	        todayDealsPage = new TodayDealsPage(driver);
	        productPage = new ProductPage(driver);
	        cartPage = new CartPage(driver);

	        homePage.openURL(TestConfig.BASE_URL);
	    }

	    @Test (priority= 1)
	    public void testOpenTodayDeals(){
	        homePage.clickTodayDealsBtn();
	    }

	    @Test(priority=2)
	    public void testSelectCategories(){
	        actualResult = todayDealsPage.getPageTitle();
	        expectedResult = "Today's Deals";

	        todayDealsPage.clickHeadphonesCheckBox();
	        todayDealsPage.clickGroceryCheckBox();
	        todayDealsPage.clickDiscountBtn();

	        Assert.assertEquals(actualResult, expectedResult, "Page title is wrong");
	    }

	    @Test (priority=3)
	    public void testSelectFourthPage(){
	        todayDealsPage.clickFourthPageBtn();
	        try {
	            TimeUnit.SECONDS.sleep(5);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        Assert.assertEquals(todayDealsPage.getSelectedPageNo(), "4", "The selected page is wrong");
	    }

	    @Test (priority=4)
	    public void testSelectProduct() {
	        try {
	            TimeUnit.SECONDS.sleep(5);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        todayDealsPage.clickDealsProductTitle();
	    }

	    @Test (priority=5)
	    public void testAddItemToCart(){
	        productTitle = productPage.getProductTitle();
	        productPage.clickAddToCartBtn();
	    }

	    @Test (priority=6)
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

