package BasicPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra
{
	  @Test()
		public void LaunchTest()	
		{
		 
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.myntra.com/");
		  String actualtitile = driver.getTitle();
		  System.out.println(actualtitile);
		}

}
