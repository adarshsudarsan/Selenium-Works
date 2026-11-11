package testNGpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Hardasserationpgm {
	
	ChromeDriver driver;
	@BeforeClass
	public void open() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void titleverif() {
	String actualtitle=driver.getTitle();
	//System.out.println(actualtitle);
	
	String expectedtitle="Rediffmail Free Unlimited";
	Assert.assertEquals(expectedtitle, actualtitle);
	System.out.println("Title verification Success");
	}
	@Test(priority=2)
	public void urlverif() {
		String actualurl=driver.getCurrentUrl();
		//System.out.println(actualurl);
		
		String expectedurl="https://register.rediff.com/register/register.php?FormName=user_details";
		Assert.assertEquals(actualurl, expectedurl);
		System.out.println("Url verification completed");
	}
	
}
