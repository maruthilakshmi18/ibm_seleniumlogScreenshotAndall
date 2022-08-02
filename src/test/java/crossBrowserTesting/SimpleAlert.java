package crossBrowserTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SimpleAlert extends BaseTest {
	
	@Test
	public void verifyAlert() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[text()='Show Me Confirmation']")).click();		
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();
		al.accept();
	}

	
}
