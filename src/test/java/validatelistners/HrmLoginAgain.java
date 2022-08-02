package validatelistners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmLoginAgain extends BaseTest {

	@Test(priority = 1)
	public void login() throws InterruptedException {   

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
   
        
        
        Thread.sleep(2000);
        String dashboardTest = driver.findElement(By.tagName("h1")).getText();
        System.out.println(dashboardTest);
        
        
        Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
        
        Assert.assertEquals(dashboardTest, "dashboard");
        
    }
    
        
    @Test()
    public void verifyAppTitle() {
        
        Assert.assertTrue(driver.getTitle().contains("HRM"));
        
    }
	

}
