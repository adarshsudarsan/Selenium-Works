package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	WebDriver driver;
	
	@Parameters("browser")
	
	@BeforeTest
	public void broswersetup(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("chrome browser");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("edge browser");
		}
		//else 
		//{
			//driver=new FirefoxDriver();
			//System.out.println("edge browser");	
		//}
	}
	
	@Test
	public void method1()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	
}
