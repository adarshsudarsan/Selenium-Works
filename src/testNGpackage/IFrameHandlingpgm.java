
package testNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrameHandlingpgm {

    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://keralaproperty.in/member/login/");
        driver.manage().window().maximize();
       
    }

    @Test(priority=1)
    public void login() {

        WebElement username = driver.findElement(By.id("ulogin"));
        username.sendKeys("adarshsudarsan2004@gmail.com");

        WebElement password = driver.findElement(By.name("upass"));
        password.sendKeys("123456789");

        WebElement loginbutton = driver.findElement(By.id("sub_logbtn"));
        loginbutton.click();
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("myhome"));
    }
    
    @Test(priority=2)
    public void addproperty() {
    	WebElement AddPPtbtn=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
    	AddPPtbtn.click();
    	WebElement Frametag=driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
    	driver.switchTo().frame(Frametag);
    	
    	WebElement summarybox=driver.findElement(By.xpath("/html/body"));
    	summarybox.click();
    	summarybox.sendKeys("1234567890");
    	
    	driver.switchTo().defaultContent();
    	
    }
}
