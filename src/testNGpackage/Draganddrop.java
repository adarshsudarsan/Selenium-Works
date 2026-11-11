package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Draganddrop {
		ChromeDriver driver;
		@BeforeClass
		public void open() {
			driver=new ChromeDriver();
			driver.get("https://webdriveruniversity.com/Actions/index.html");
			driver.manage().window().maximize();
		}
		@Test
		public void drager() throws Exception {
				WebElement dragbox=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
				WebElement trg=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

				Actions act=new Actions(driver);
				act.dragAndDrop(dragbox, trg);
				act.perform();
				Thread.sleep(2000);
				WebElement over=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
				act.moveToElement(over).perform();
				
				WebElement link1=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
				link1.click();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				
				WebElement clickbx=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
				act.clickAndHold(clickbx);
				Thread.sleep(2000);
				
				WebElement doubl=driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
				act.moveToElement(doubl);
				act.doubleClick(doubl).perform();
		}
		@AfterClass
		public void clossing() throws Exception {
			Thread.sleep(3000);
			driver.close();
		}
}
