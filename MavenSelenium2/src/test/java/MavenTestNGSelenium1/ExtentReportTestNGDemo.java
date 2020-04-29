package MavenTestNGSelenium1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class ExtentReportTestNGDemo {

	@BeforeTest
	public void setUp()
	{
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);	
		}
	@Test
	public void test1()
	{
		
	}
	@AfterTest
	public void TearDown()
	{
		
	}
	
	
	
}
