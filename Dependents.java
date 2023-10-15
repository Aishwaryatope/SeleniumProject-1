package myinfo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import logintest.Setup;

public class Dependents  extends Setup {
	

	public static void Test() {
		//Dependents Details
		driver.findElement(By.xpath(d_loc.getProperty("add_button"))).click();
		driver.findElement(By.xpath(d_loc.getProperty("name"))).sendKeys(d_loc.getProperty("d_name"));
		List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath(d_loc.getProperty("relationship")));
			Iterator<WebElement> iterator = list.iterator();
			while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if (webElement.getText().equals(pd_loc.getProperty("d_relation"))) 
				{
					webElement.click();
				}
		WebElement dateofbirth = driver.findElement(By.xpath(d_loc.getProperty("date_of_birth")));
		dateofbirth.sendKeys(d_loc.getProperty("d_date"));
		driver.findElement(By.xpath(d_loc.getProperty("d_save"))).click();
}
}
}
