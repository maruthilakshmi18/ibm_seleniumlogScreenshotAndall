package com.pageobjectmodal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class LoginAgain {

	WebDriver driver;

	public LoginAgain(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	 @FindBy(xpath="//input[@name='txtUsername']")
	  WebElement txt_uid;
	  
	  @FindBy(xpath="//input[@id='txtPassword']")
	  WebElement txt_pwd;
	  
	  @FindBy(xpath="//input[@value='LOGIN']")
	  WebElement btn_Login;
	
	public void enterUsername(String user) {
		txt_uid.sendKeys(user);
	}

	public void enterUPwd(String pwd) {
		txt_pwd.sendKeys(pwd);
	}

	public void clickLogin() {
		btn_Login.click();
		
	}
	
	
	
}
