package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritypgm {
	
	@BeforeClass
	public void BfClass_mthd() {
		System.out.println("BeforeClass_mthd");
	}
	
	@Test(priority=1,invocationCount = 3)
	public void Mthd_X() {
		System.out.println("Mthd_X-----");
	}

	
	@Test(priority=2, enabled = false )
	public void Mthd_A() {
		System.out.println("Mthd_A-----");
	}
	
	@Test(priority=3)
	public void Mthd_F() {
		System.out.println("Mthd_F-----");
	}
	
	@AfterClass
	public void AFClass_mthd() {
		System.out.println("AfterClass_mthd-----");
	}
}
