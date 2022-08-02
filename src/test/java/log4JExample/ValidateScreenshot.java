package log4JExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateScreenshot {
	WebDriver driver;
	Logger log;
	
	@BeforeTest
	public void launchApp() {
	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		log= Logger.getLogger("HRM_Login_Test");
		PropertyConfigurator.configure(".\\ConfigFolder\\log4j.properties");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		log.info("lunched the HRM application successfully");
		
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./Screenshot/Results.png"));
		log.info("Screenshot captured");
		
		Thread.sleep(4000);
		driver.close();
		
	}
	
	@Test
	public void login() throws Exception {
		
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		log.info("user name entered");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		log.info("password entered");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		log.info("application logined successfully");
	}
	
	@BeforeMethod
	public void addComment() {
		log.info("===========Execution starts==========");
	}
	
	@AfterMethod
	public void AddComment1() {
		
		log.info("============completed with execution==============");
	}


}
