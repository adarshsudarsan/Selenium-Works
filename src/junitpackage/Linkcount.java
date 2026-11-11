package junitpackage;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	@BeforeEach
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcountmethod()
	{
		List<WebElement> links = driver.findElements(By.tagName("a")); //locating a tags
		System.out.println("link count= "+links.size());
		
		for(WebElement li:links)
		{	
			//System.out.println("Link-------" +li.getAttribute("href"));
			System.out.println(li.getText()+"-----"+li.getAttribute("href")); //li.getText() retrieves the text of link
		}
	}
}
