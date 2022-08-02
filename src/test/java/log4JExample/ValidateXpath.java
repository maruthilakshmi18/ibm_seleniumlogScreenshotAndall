package log4JExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateXpath {
	  WebDriver driver;
	    
	    @BeforeTest
	    public void launchApp() {
	    
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	        WebElement chk_Helen  = driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td//child::input"));
	        chk_Helen.click();
	        
	        WebElement chk_YoshiTannamuri     = driver.findElement(By.xpath("//td[text()='Yoshi Tannamuri']//preceding-sibling::td//child::input"));
	        chk_YoshiTannamuri.click();
	        
	        
	        
	    }
	    @AfterTest
	    public void closeApp() {
	    	driver.close();
	    }

}
