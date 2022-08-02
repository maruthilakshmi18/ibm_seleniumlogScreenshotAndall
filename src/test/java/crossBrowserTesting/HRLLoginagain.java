package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRLLoginagain {
	
	WebDriver driver;
	
	@Parameters("ibm_browser")
	@BeforeTest
	public void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");		
		driver.get(ReadConfig.readUrl());
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void login() {
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
