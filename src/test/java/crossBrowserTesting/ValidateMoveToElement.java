package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateMoveToElement {
	 WebDriver driver;
	    
	    @BeforeTest
	    public void launchApp() {
	    
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        
	    }

	    @AfterTest
	    public void closeApp() throws Exception {
	        Thread.sleep(4000);
	        driver.close();

	    
	    }
	    
	    @Test
	    public void moveToelement() throws Exception {
	    WebElement e=driver.findElement(By.xpath("//*[contains(text(), 'Account & Lists')]"));
	    Actions a = new Actions(driver);
	    a.moveToElement(e);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[1]/span")).click();
	    
	        

}
}
