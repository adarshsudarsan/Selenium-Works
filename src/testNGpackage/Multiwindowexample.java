package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiwindowexample {
	WebDriver driver;
	@BeforeTest
	public void open() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
	}
	@Test
	public void tabhandle() throws Exception {
		String parentwindow=driver.getWindowHandle();
		System.out.println("home title"+driver.getTitle());
		
		WebElement clk=driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		clk.click();
		System.out.println("1stpage title:"+driver.getTitle());
		Thread.sleep(2000);
		//driver.close();//To close the particular tab
		driver.switchTo().window(parentwindow);
		
		WebElement scndclk=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		scndclk.click();
		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		
		System.out.println("2ndpage title:"+driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwindow);
		
		
		WebElement thrdclk=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		thrdclk.click();
		driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
		
		System.out.println("3ndpage title:"+driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
}

