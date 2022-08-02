package nodeexecution;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HRMlogintest extends Baseclass  {
@Parameters("OS")
	@Test()
	public void login () {		
		
    		driver.get("https://opensource-demo.orangehrmlive.com/");
    		System.out.println("application launched");
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");

			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

			driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		}
	
}
