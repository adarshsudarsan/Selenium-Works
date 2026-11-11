package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoverification {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void locatelogo() {
	WebElement logo=driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
	boolean result=logo.isDisplayed();
	if(result==true) {
		System.out.println("logo is displayed");
	}
	else {
		System.out.println("logo is not displayed");
	}
	
	WebElement gender =driver.findElement(By.xpath("//input[@value=\"f\"]"));
	boolean buttonenb=gender.isDisplayed();
	System.out.println("female button is enabled"+buttonenb);
	gender.click();
	
	WebElement checkbox=driver.findElement(By.xpath("//input[contains(@name,\"chk_altemail\")]"));
	checkbox.click();
	boolean checkboxbtn =checkbox.isSelected();
	if(checkboxbtn==true) {
	System.out.println("checkbox is selected");
	}
	else {
		System.out.println("checkbox is not selected");
		
	}

}
}