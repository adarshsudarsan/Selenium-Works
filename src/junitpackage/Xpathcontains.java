package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcontains {

	ChromeDriver driver;

	@BeforeEach
	public void broswer_setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void method1() throws Exception
	{
		WebElement reddifmail = driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		reddifmail.sendKeys("admin");
		
		Thread.sleep(2000);
		WebElement fullname=driver.findElement(By.xpath("//input[contains(@name,'name') and @placeholder=\"Enter your full name\"]"));
		fullname.sendKeys("adarsh");
	}
}
