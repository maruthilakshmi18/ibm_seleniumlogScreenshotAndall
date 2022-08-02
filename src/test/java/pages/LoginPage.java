package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	 // By txt_uid = By.xpath("//input[@name='txtUsername']");	
	//By txt_pwd =  By.xpath("//input[@id='txtPassword']"); 
	//By btn_login =  By.xpath("//input[@value='LOGIN']");
	
	/*
	 * public void enterUsername(String uname) {
	 * driver.findElement(txt_uid).sendKeys(uname); }
	 */

	/*
	 * public void enterUPwd(String pwd) {
	 * driver.findElement(txt_pwd).sendKeys(pwd); }
	 */

	/*
	 * public void clickLogin() { driver.findElement(btn_Login).click(); }
	 */
	 
	
	 @FindBy(xpath="//input[@name='txtUsername']")
	  WebElement txt_uid;
	  
	  @FindBy(xpath="//input[@id='txtPassword']")
	  WebElement txt_pwd;
	  
	  @FindBy(xpath="//input[@value='LOGIN']")
	  WebElement btn_Login;
	
	public void enterUsername(String uname) {
		txt_uid.sendKeys(uname);
	}

	public void enterUPwd(String pwd) {
		txt_pwd.sendKeys(pwd);
	}

	public void clickLogin() {
		btn_Login.click();
		
	}
	

}
