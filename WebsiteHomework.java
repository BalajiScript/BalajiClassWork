package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.assertFalse;

import dev.failsafe.internal.util.Assert;

public class WebsiteHomework {

	public static void main(String[] args) throws InterruptedException{

     WebDriver driver=new ChromeDriver();
      
     driver.get("https://ineuron-courses.vercel.app/signup");
     
     Thread.sleep(2000);
     JavascriptExecutor je = (JavascriptExecutor) driver;

     driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Balaji");
     
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("balaji@gmail.com");
     
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("balaji123");
     
     driver.findElement(By.xpath("//label[@class='interest' and contains(text(),'Testing')]")).click();
     
  
    WebElement elementcheckbox = driver.findElement(By.xpath("//input[@type='radio' and contains(@value,'Male')]"));
     
     je.executeScript("arguments[0].scrollIntoView(true);",elementcheckbox);
     
     Thread.sleep(500);
     
     elementcheckbox.click();
       
     Select objSelect =new Select(driver.findElement(By.xpath("//select[@id ='state']")));
     
     objSelect.selectByVisibleText("Tamil Nadu"); 
     
     boolean elementbutton =driver.findElement(By.xpath("//button[@class='submit-btn']")).isEnabled();
    
     assertFalse(elementbutton);
     
     
       
    }
	
}
