package BasicITestLisener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtils.ListenerImplemention;

@Listeners(ListenerImplemention.class)

public class TiraTest 
{
    @Test	
	public void PerfumeTest()	
	{
	 
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.tirabeauty.com/");
      WebElement serachtf = driver.findElement(By.id("search"));
      serachtf.sendKeys("perfumes");
      serachtf.sendKeys(Keys.ENTER);
	
	}
    
}
