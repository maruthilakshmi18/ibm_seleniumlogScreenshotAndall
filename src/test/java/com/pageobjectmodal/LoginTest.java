package com.pageobjectmodal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class LoginTest extends BaseTest {
	WebDriver driver;
	@Test
	public void loginAPP() {
	
	lp.enterUsername("Admin");
	lp.enterUPwd("admin123");
	lp.clickLogin();
	}
}
