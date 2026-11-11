package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpgm {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();
		System.out.println("Title of we application is :" +actualtitle);
		
		String expectedtitle="Google";
		
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("title is match");
		}
		else {
			System.out.println("title not match");
		}
	}

}
