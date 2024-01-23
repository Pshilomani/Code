package BasicITestLisener;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtils.ListenerImplemention;
import CommonUtils.WebDriverUtil;

@Listeners(ListenerImplemention.class)

public class AjioTest {
	
	WebDriverUtil wutils = new WebDriverUtil();
    @Test	
	public void PerfumeTest() throws IOException	
	{
	 
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.ajio.com/");
      	wutils.TakesScreenshot(driver,"ajio");
      	System.out.print("Good Morning");
	}


}
