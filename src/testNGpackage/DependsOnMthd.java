package testNGpackage;

import org.testng.annotations.Test;

public class DependsOnMthd {
	
	@Test 
	public void Reg() {
		System.out.println("Registration Method");
	}
	
	@Test (dependsOnMethods = "Reg") //login method is depended on the reg(), so it will work only after execute
	public void login() {
		System.out.println("Login Method");
	}
	
	@Test (dependsOnMethods = {"Reg","login"})
	public void home() {
		System.out.println("Home Method");
	}

}
