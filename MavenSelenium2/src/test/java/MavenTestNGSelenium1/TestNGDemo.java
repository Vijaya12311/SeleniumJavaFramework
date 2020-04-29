package MavenTestNGSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGDemo
{	
	WebDriver driver;
	@BeforeTest
	public  void setupTest() {
	
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\harsh\\eclipse-workspace\\SeleniumJavaFrameWork\\Drivers\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	@Test
		public void GoogleSearch() throws InterruptedException
		{
			driver.get("https://www.google.com");
		    driver.findElement(By.name("q")).sendKeys("selenium");
		    
		    //driver.findElement(By.name("btnk")).click();
		   //driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		}
		@AfterTest
	   public void TearDownTest()
	   {
			driver.close();
			System.out.println("Test Completed Successfully");
	   }
	   

	}
