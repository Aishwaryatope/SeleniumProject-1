package myinfo;

import org.openqa.selenium.By;

import logintest.Setup;

public class EmergencyContactDeatails extends Setup {
	
	public static void Test() {
		//Emergency Contact Details
		driver.findElement(By.xpath(ec_loc.getProperty("add_button"))).click();
		driver.findElement(By.xpath(ec_loc.getProperty("name"))).sendKeys(ec_loc.getProperty("e_name"));
		driver.findElement(By.xpath(ec_loc.getProperty("relationship"))).sendKeys(ec_loc.getProperty("e_relation"));
		driver.findElement(By.xpath(ec_loc.getProperty("home_telephone"))).sendKeys(ec_loc.getProperty("h_number"));
		driver.findElement(By.xpath(ec_loc.getProperty("mobile"))).sendKeys(ec_loc.getProperty("m_number"));
		driver.findElement(By.xpath(ec_loc.getProperty("work_telephone"))).sendKeys(ec_loc.getProperty("w_number"));
		driver.findElement(By.xpath(ec_loc.getProperty("ec_save"))).click();
}
}

