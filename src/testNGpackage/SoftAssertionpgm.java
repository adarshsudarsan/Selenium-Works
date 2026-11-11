package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionpgm {
	
	ChromeDriver driver;
	@BeforeClass
	public void open() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logoverificaton() {
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		Boolean result= logo.isDisplayed();
		System.out.println(result);
		
		SoftAssert obj=new SoftAssert();
		obj.assertTrue(result); //verify the value of the result is true
		obj.assertAll();
		System.out.println("logo is displayed");
	}
	
	@Test
	public void titleverif() {
	String actualtitle=driver.getTitle();
	//System.out.println(actualtitle);
	
	String expectedtitle="Rediffmail Free Unlimited";
	
	SoftAssert obj=new SoftAssert();
	obj.assertEquals(expectedtitle,actualtitle);
	//obj.assertAll();
	System.out.println("Title check success");
	}
}
