package testNGpackage;

//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileupldSendcase {
	
	ChromeDriver driver;
	@BeforeClass
	public void open()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void file() throws Exception {
		Thread.sleep(2000);
		WebElement file_button=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		file_button.sendKeys("C:\\Users\\HP\\Downloads\\Image20261016101504.png");
				
	}

}
