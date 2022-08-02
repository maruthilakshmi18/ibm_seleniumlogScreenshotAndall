package nodeexecution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	 WebDriver driver;
	    
	    @Parameters("OS")
	    @BeforeTest
	    public void launchApp(String OSInfo) throws Exception {
	        
	        System.out.println("Execution of test on Platform: " + OSInfo);
			/*
			 * String node_win = "http://192.168.1.5:5599/wd/hub"; //edge
			 *  String node_mac = "http://192.168.1.5:5566/wd/hub";//chrome
			 */        
	        
	        String node_win = "http://10.0.0.13:5566/wd/hub";         //chrome
	        String node_mac = "http//10.0.0.13:5588/wd/hub"; 	//edge
	        
	        if(OSInfo.equalsIgnoreCase("win")) {
	            

	            //chrome
	            
	            DesiredCapabilities cap = new DesiredCapabilities().chrome();
	            cap.setBrowserName("chrome");
	            cap.setPlatform(Platform.WINDOWS);
	        
	            
	            WebDriverManager.chromedriver().setup();
	            driver = new RemoteWebDriver(new URL(node_win), cap);
	          
	            
	         
	        }
	        
	        else if(OSInfo.equalsIgnoreCase("mac")) {
	            
	            DesiredCapabilities cap = new DesiredCapabilities().edge();
	            cap.setBrowserName("MicrosoftEdge");
	            cap.setPlatform(Platform.WINDOWS);
	            
	            WebDriverManager.edgedriver().setup();
	            driver = new RemoteWebDriver(new URL(node_mac), cap);
	            
	           
	            
	        }
	        
	    
	    }
	@AfterTest
	public void close() {
		driver.close();
	}
}
