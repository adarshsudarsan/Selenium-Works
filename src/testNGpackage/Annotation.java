package testNGpackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeTest
	public void beforetestmthd() {
		System.out.println("Before test----");
	}
	
	@BeforeClass
	public void beforeclassmthd() {
		System.out.println("Before class----");
	}
	
	@BeforeMethod
	public void method() {
		System.out.println("Before method----");
	}
	
	@Test
	public void testmthd_A() {
	System.out.println("Test method A-----");
	}
	
	@Test
	public void testmthd_X() {
	System.out.println("Test method X-----");
	}	
	
	@Test
	public void testmthd_C() {
	System.out.println("Test method C-----");
	}
	
	@AfterMethod
	public void Af_mthd() {
	System.out.println("Aftermethod----");
	}
	
	@AfterClass
	public void Ac_mthd() {
	System.out.println("AfterClassMthd----");
	}
	
	@AfterTest
	public void At_mthd() {
	System.out.println("AfterTestMthd----");
	}
}
