package crossBrowserTesting;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateConfirmAlert extends BaseTest {

	@Test
	public void confirmAlert() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='confirm']")).click();
		Thread.sleep(3000);
		Alert al=driver.switchTo().alert();	
		String Atext=al.getText();
		System.out.println(Atext);
		String Etext="Hello Alert";
		Assert.assertEquals(Etext, Atext);
		al.accept();
		Thread.sleep(3000);
		
		
		
	}
	
	@Test
	public void promptAlert() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='prompt']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Lakshmi");
		Thread.sleep(2000);
		String Atext=alert.getText();
		System.out.println(Atext);
		alert.accept();
	
	}
	
	
	
	@Test
	public void modalAlert() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-toggle='modal']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();		
		
		  String Atext=alert.getText(); 
		  System.out.println(Atext);
		 
		alert.accept();
	
	}
}
