package junitpackage;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	ChromeDriver driver;

	@BeforeEach
	public void browsersetup() {
		System.out.println("before Each method");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleverification() {
		System.out.println("Testmethod 1");

		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("same title");
		}
		else {
			System.out.println("Mismatch");
		}
	}
	
	@Test
	public void methhod2() {
		System.out.println("method2");
	}
	
	@AfterEach
	public void closingmethod() {
		System.out.println("AfterEach method");

		//driver.close(); //to close browser tab
		driver.quit();
	}
}