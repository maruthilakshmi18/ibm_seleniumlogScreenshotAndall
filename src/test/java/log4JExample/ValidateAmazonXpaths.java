package log4JExample;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateAmazonXpaths {
	WebDriver driver;
	Logger log;

	@BeforeTest
	public void launchApp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// logging

		log = Logger.getLogger("IBM_Amazon_Module");
		PropertyConfigurator.configure(".\\configFolder\\log4j.properties");

		log.info("=================================");
		log.info("chrome browser launched.");

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		log.info("Amazon app launched. - https://www.amazon.in/");
	}

	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(4000);
		driver.close();

		log.info("browser closed successfully.");

	}

	@Test
	public void loginTest() throws Exception {

		log.info("=====TestCase: LoginTest execution in progress");

		List<WebElement> links = driver.findElements(By.linkText("See more"));
		System.out.println(" Total links are: " + links.size());
		
		driver.findElement(By.xpath("//a[text()='See more']//parent::div//preceding-sibling::div[contains(@class,'header')]//child::h2")).click();
		String pageTitle=driver.getTitle();
		log.info("Page title is: "+pageTitle);
		Assert.assertTrue(pageTitle.contains("Online Shopping site in India"));
		//driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'Automotive essentials')]//parent::div//following-sibling::div[contains(@class,'foo')]//child::a[text()='See more']")).click();
		String pageTitle1=driver.getTitle();
		log.info("Page title is: "+pageTitle1);
		Assert.assertTrue(pageTitle1.contains("Motorbike"));


	}

	@BeforeMethod
	public void addComment() {
		log.info("=======Test Case execution in progress..Case=====");

	}

	@AfterMethod
	public void addComment2() {
		log.info("==========Test Case execution completed===========");

	}

	@Test
	public void logout() throws Exception {
		// log.info("=====TestCase: LoginTest execution in progress");
		// validation - getting application URL
		Thread.sleep(2000);
		log.info("validation of logout passed, current application URL: " + driver.getCurrentUrl());
	}

}
