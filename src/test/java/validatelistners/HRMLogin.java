package validatelistners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;


public class HRMLogin extends BaseTest {	

	@Test(priority = 1)
	public void login() {   

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

	@Test(priority = 3, retryAnalyzer = RetryLogicExample.class)
	public void logout() throws Exception {

		driver.findElement(By.partialLinkText("Welcome")).click();

		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("Logo"))));

		driver.findElement(By.partialLinkText("Logowqeqweqwar")).click();

	}
	
	@Test(retryAnalyzer = RetryLogicExample.class)
  public void verifyAppTitle() {
        
        Assert.assertTrue(driver.getTitle().contains("HRM"));
        
    }

}
