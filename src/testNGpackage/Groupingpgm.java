package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Groupingpgm {
	@BeforeClass(alwaysRun=true)
	public void BfClass_mthd() {
		System.out.println("BFClass_mthd---");
	}

	@Test(priority=1,groups="smoke")
	public void TS_mthd() {
		System.out.println("TS_mthd---");
	}
	
	@Test(priority=2,groups="sanity")
	public void TS1_mthd() {
		System.out.println("TS1_mthd---");
	}
	
	@Test(priority=3,groups= {"regression","smoke"})
	public void TS2_mthd() {
		System.out.println("TS2_mthd---");
	}
	
	@AfterClass
	public void AfClass_mthd() {
		System.out.println("AFClass_mthd---");
	}
}
