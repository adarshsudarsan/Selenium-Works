
package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Amazonpgm {

    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void browser_setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @Test
    public void homepage() throws Exception {
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        search.sendKeys("Mobiles", Keys.ENTER);
        driver.get("https://www.amazon.in/");
        WebElement electronics = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Electronics')]")));
        
        electronics.click();
        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart")));
        
        cart.click();
    }
}
