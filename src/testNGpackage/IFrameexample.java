
package testNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrameexample {

    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://vinothqaacademy.com/iframe/");
        driver.manage().window().maximize();
       
    }

    
    @Test(priority=1)
    public void addproperty() {
    	WebElement Frametag=driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
    	driver.switchTo().frame(Frametag);
    	
    	WebElement summarybox=driver.findElement(By.xpath("/html/body"));
    	summarybox.click();
    	summarybox.sendKeys("1234567890");
    	
    	driver.switchTo().defaultContent();
    	
    }
}
