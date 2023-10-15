package myinfo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import logintest.Setup;

public class PersonalDetails extends Setup{


public static void Test() {
		
		// First Name
		driver.findElement(By.name(pd_loc.getProperty("first_name"))).sendKeys(pd_loc.getProperty("f_name"));
		// Middle Name
		driver.findElement(By.name(pd_loc.getProperty("middle_name"))).sendKeys(pd_loc.getProperty("m_name"));
		// Last Name
		driver.findElement(By.name(pd_loc.getProperty("last_name"))).sendKeys(pd_loc.getProperty("l_name"));
		// Nick Name
		driver.findElement(By.xpath(pd_loc.getProperty("nick_name"))).sendKeys(pd_loc.getProperty("n_name"));
		// Employee id
		driver.findElement(By.xpath(pd_loc.getProperty("employee_id"))).sendKeys(pd_loc.getProperty("e_id"));
		// Other id
		driver.findElement(By.xpath(pd_loc.getProperty("other_id"))).sendKeys(pd_loc.getProperty("o_id"));
		// Driver License Number
		driver.findElement(By.xpath(pd_loc.getProperty("driver_lisence_number")))
				.sendKeys(pd_loc.getProperty("d_number"));
		// SSN Number
		driver.findElement(By.xpath(pd_loc.getProperty("ssn_number"))).sendKeys(pd_loc.getProperty("ss_number"));
		// SIN Number
		driver.findElement(By.xpath(pd_loc.getProperty("sin_number"))).sendKeys(pd_loc.getProperty("si_number"));
		// Nationality
		List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath(pd_loc.getProperty("nationality")));
		Iterator<WebElement> iterator = list.iterator();
		while (iterator.hasNext()) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
			if (webElement.getText().equals(pd_loc.getProperty("nationality_dd"))) {
				webElement.click();
			}
		// Marital Status
			List<WebElement> list1 = (List<WebElement>) driver
					.findElement(By.xpath(pd_loc.getProperty("marital_status")));
			Iterator<WebElement> iterator1 = list.iterator();
			while (iterator.hasNext()) {
				WebElement webElement1 = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if (webElement.getText().equals(pd_loc.getProperty("marital_status_dd"))) {
					webElement.click();
				}
			}
			// Date Of Birth
			WebElement dateofbirth = driver.findElement(By.xpath(pd_loc.getProperty("date_of_birth")));
			dateofbirth.sendKeys(pd_loc.getProperty("date"));
			// Gender
			driver.findElement(By.xpath(pd_loc.getProperty("gender")));
			WebElement radio1 = driver.findElement(By.xpath(pd_loc.getProperty("male")));
			WebElement radio2 = driver.findElement(By.xpath(pd_loc.getProperty("female")));
			radio2.click();
			// Military Service
			driver.findElement(By.xpath(pd_loc.getProperty("military_service"))).sendKeys(pd_loc.getProperty("m_s"));
			// save
			driver.findElement(By.xpath(pd_loc.getProperty("personal_details_save"))).click();
			// Blood Type
			List<WebElement> list2 = (List<WebElement>) driver.findElement(By.xpath(pd_loc.getProperty("blood_type")));
			Iterator<WebElement> iterator2 = list.iterator();
			while (iterator.hasNext()) {
				WebElement webElement2 = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if (webElement.getText().equals("O+")) {
					webElement.click();
				}
			}
//Save Blood Type 
			driver.findElement(By.xpath(pd_loc.getProperty("blood_type_save"))).click();
			// Add Attachment
			driver.findElement(By.xpath(pd_loc.getProperty("add_attachment"))).click();
			// Browse Attachment
			driver.findElement(By.xpath(pd_loc.getProperty("browse_attachment"))).click();
		}
}	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
