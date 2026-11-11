package testNGpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Datepicker.html");
    }

    @Test
    public void datepicker() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//*[@id='datepicker1']")).click();

        while (true) {

            String month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();

            System.out.println("Month = " + month);

            if (month.equalsIgnoreCase("December 2026")) 
            {
                break;
            } 
            else
            {
                driver.findElement( By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();
            }
        }

        List<WebElement> dates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));

        for (WebElement d : dates) {

            String dateText = d.getText();
            if (dateText.equals("2")) {
                d.click();
                System.out.println("Date selected successfully");
                break;
            }
        }
    }
}