package POMtestpackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMbasepackage.Baseclass;
import POMpagepackage.Loginpage;

public class Logintest extends Baseclass
{
	
	Loginpage obj;
	
	
	
	@BeforeMethod
	public void objectmethod() 
	{
		obj=new Loginpage(driver);
	}
	
	@Test
	public void logintest() 
	{
		obj.setvalues();
		obj.loginmthd();
	}
	
	@Test
	public void titleverification() 
	{
		System.out.println(obj.titlemthd());
	}
	
}
