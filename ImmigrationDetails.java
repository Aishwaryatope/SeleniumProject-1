package myinfo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import logintest.Setup;

public class ImmigrationDetails extends Setup {


	public static void Test() {
		
		//add button
		
		driver.findElement(By.xpath(i_loc.getProperty("add_button"))).click();
		//document 
		
		driver.findElement(By.xpath(i_loc.getProperty("document")));
		WebElement radio1 = driver.findElement(By.xpath(i_loc.getProperty("passport")));
		WebElement radio2 = driver.findElement(By.xpath(i_loc.getProperty("visa")));
		radio1.click();
		//number
		
		driver.findElement(By.xpath(i_loc.getProperty("number"))).sendKeys(i_loc.getProperty("i_number"));
		//ISSUE DATE
		
		WebElement issuedDate = driver.findElement(By.xpath(i_loc.getProperty("issued_date")));
		issuedDate.sendKeys(i_loc.getProperty("i_date"));
		//EXPIRY DATE
		
		WebElement expiryDate = driver.findElement(By.xpath(i_loc.getProperty("expiry_date")));
		expiryDate.sendKeys(i_loc.getProperty("e_date"));
		//Eligibility Status
		
		driver.findElement(By.xpath(i_loc.getProperty("eligible_status"))).sendKeys(i_loc.getProperty("status"));
		List<WebElement> list = (List<WebElement>) driver.findElement(By.name(i_loc.getProperty("issued_by")));
		Iterator<WebElement> iterator = list.iterator();
		while (iterator.hasNext()) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
			if (webElement.getText().equals(i_loc.getProperty("issue"))) {
				webElement.click();
			}
		//Eligiblity Review Date
		WebElement eligibleReviewDate = driver.findElement(By.xpath(i_loc.getProperty("eligible_review_date")));
		eligibleReviewDate.sendKeys(i_loc.getProperty("r_date"));
		//Comments
		driver.findElement(By.xpath(i_loc.getProperty("comments"))).sendKeys(i_loc.getProperty("comment_line"));
		//Save Button
		driver.findElement(By.xpath(d_loc.getProperty("i_save"))).click();
		}
	}
	
	
	
	
	
	
}
