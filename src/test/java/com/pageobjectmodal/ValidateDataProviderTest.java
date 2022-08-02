package com.pageobjectmodal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidateDataProviderTest extends BaseTest {
	WebDriver driver;
	@Test(dataProvider="logindDetails")
	public void loginAPP(String user, String pwd) {
	
	lp.enterUsername(user);
	lp.enterUPwd(pwd);
	lp.clickLogin();
	}
	
	@DataProvider(name="logindDetails")
	public Object[][] testdata() {
		Object data[][] = {{"admin", "admin456"},{"hrm","hrm1234"}};
		return data;
	}
}
