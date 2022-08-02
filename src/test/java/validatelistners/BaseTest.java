package validatelistners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
WebDriver driver;

@BeforeTest
public void seup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	//driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html");
	//driver.get("http://www.uitestpractice.com/Students/Switchto");
	//driver.get("https://www.globalsqa.com/demo-site/dranganddrop/");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
}

@AfterTest
public void close() {
	driver.close();
}
}
