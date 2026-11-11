package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/pgm.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void home() throws Exception {

	    WebElement display_alert = driver.findElement(By.xpath("/html/body/input[1]"));
	    display_alert.click();
	    
	    Alert alrt=driver.switchTo().alert();
	    String alert_text=alrt.getText();
	    System.out.println("Alert text : "+alert_text);
	    Thread.sleep(2000);
	    alrt.accept();
	    
	    

	    WebElement firstname = driver.findElement(By.xpath("/html/body/input[2]"));
	    firstname.sendKeys("adarsh");

	    WebElement lastname = driver.findElement(By.xpath("/html/body/input[3]"));
	    lastname.sendKeys("sudarsan");

	    WebElement submit = driver.findElement(By.xpath("/html/body/input[4]"));
	    submit.click();
	}
}
