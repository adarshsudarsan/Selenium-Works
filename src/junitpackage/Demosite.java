package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demosite {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
		driver.manage().window().maximize();
	}
	@Test
	public void home() throws Exception {
		WebElement alertok = driver.findElement(
		        By.xpath("//*[@id=\"OKTab\"]/button"));
		    alertok.click();

		    Alert al = driver.switchTo().alert();

		    String alText = al.getText();
		    System.out.println("Alert text : " + alText);

		    Thread.sleep(2000);
		    al.accept();

		    WebElement alertTwo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		    alertTwo.click();

		    WebElement alertTwobtn = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		    alertTwobtn.click();

		    Alert a2 = driver.switchTo().alert();

		    Thread.sleep(2000);
		    a2.dismiss();

		    WebElement alert3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		    alert3.click();
		    
		    
		    WebElement alert3btn = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		    alert3btn.click();

		    Alert a3 = driver.switchTo().alert();

		    a3.sendKeys("Test");
		    
		    Alert alrt = driver.switchTo().alert();
		    String text = alrt.getText();
		    System.out.println("Alert text: " + text);

		    Thread.sleep(2000);
		    a3.accept();
		    
	}
	
}
