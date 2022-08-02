package com.pageobjectmodal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseTest {
	WebDriver driver;
	LoginPage lp;
	
	

	@BeforeTest
	public void seup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		lp = new LoginPage(driver);
		

	}

	@AfterTest
	public void close() {
		driver.close();
		
	}
}
