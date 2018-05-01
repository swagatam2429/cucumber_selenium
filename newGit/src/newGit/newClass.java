package newGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class newClass 
{
	
	WebDriver driver;
	
	@Test 
	public void abc() throws InterruptedException
	
	{
		driver= new FirefoxDriver();
		
		System.out.println("Lets Start");
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(10000);
		
		String Title = driver.getTitle();
		System.out.println("Current Title is "+Title);
		
		driver.quit();
	}

}
