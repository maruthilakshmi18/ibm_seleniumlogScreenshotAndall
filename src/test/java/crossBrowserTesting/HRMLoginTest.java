package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginTest {
	WebDriver driver;
	
	//String browser = "chrome";
	
	@Parameters("ibm_browser")
	@BeforeTest
	public void launchApp(String browser) {
	
		
		//crossbrowsertesting
		
		System.out.println("Browser details are: " + browser);
		
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(4000);
		driver.close();
		
	}
	
	@Test
	public void login() throws Exception {
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		//validation step
		Thread.sleep(4000);
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "validation get failed after login");
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(4000);
		//validation step
		Assert.assertTrue(driver.getCurrentUrl().contains("login"), "validation get failed after logout");
		
		
//	}
//	
//	@Test
//	public void logout() {
//		
//		
//		
//		
//	}
	
	
	}
	
	
	
}
