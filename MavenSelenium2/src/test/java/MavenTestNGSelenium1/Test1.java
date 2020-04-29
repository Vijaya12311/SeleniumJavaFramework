package MavenTestNGSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		
	    DesiredCapabilities caps=new DesiredCapabilities();
		
		caps.setCapability("ignore-certificate",true);
		
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\harsh\\eclipse-workspace\\SeleniumJavaFrameWork\\Drivers\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		  
		driver.get("https://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("selenium");
	    //driver.findElement(By.name("btnk")).click();
	    //driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test Completed Successfully");
	}

}
