package myinfo;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import logintest.Setup;

public class ContactDetails extends Setup{


	public static void Test() {
	//Address
	driver.findElement(By.name(cd_loc.getProperty("street1"))).sendKeys(cd_loc.getProperty("s_1"));
	driver.findElement(By.name(cd_loc.getProperty("street2"))).sendKeys(cd_loc.getProperty("s_1"));
	driver.findElement(By.name(cd_loc.getProperty("city"))).sendKeys(cd_loc.getProperty("c"));
	driver.findElement(By.name(cd_loc.getProperty("state"))).sendKeys(cd_loc.getProperty("s"));
	driver.findElement(By.name(cd_loc.getProperty("zip"))).sendKeys(cd_loc.getProperty("code"));
	
	List<WebElement> list = (List<WebElement>) driver.findElement(By.name(cd_loc.getProperty("country")));
	Iterator<WebElement> iterator = list.iterator();
	while (iterator.hasNext()) {
		WebElement webElement = (WebElement) iterator.next();
		System.out.println(webElement.getText());
		if (webElement.getText().equals(cd_loc.getProperty("country_dd"))) {
			webElement.click();
		}
	//Telephone
	driver.findElement(By.name(cd_loc.getProperty("home"))).sendKeys(cd_loc.getProperty("h_number"));	
	driver.findElement(By.name(cd_loc.getProperty("mobile"))).sendKeys(cd_loc.getProperty("m_number"));
	driver.findElement(By.name(cd_loc.getProperty("work"))).sendKeys(cd_loc.getProperty("w_number"));
	//Email
	driver.findElement(By.name(cd_loc.getProperty("work_email"))).sendKeys(cd_loc.getProperty("w_email"));
	driver.findElement(By.name(cd_loc.getProperty("other_email"))).sendKeys(cd_loc.getProperty("o_email"));
	// Save 
	driver.findElement(By.name(cd_loc.getProperty("save_contact"))).click();
	}
}
}
