package P12_ignoreCases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestIgnoreAtClassLevel {
	
	
	 @Ignore	 
	  	@Test(priority=-1) //Negative values are allowed as it will consider before 0 for executions
	  	public void SignUp()
	  	{
	  		System.out.println("Sign up");
	  	}


	  	@Test  // Will set default priority i.e 0
	  	public void Login()
	  	{
	  		System.out.println("Login");
	  	}
	  	@Test(priority=2)
	  	public void SearchFlight()
	  	{
	  		System.out.println("Search Flight");
	  	}
	  	@Test(priority=3)
	  	public void Bookflightticket()
	  	{
	  		System.out.println("Bookflightticket");
	  	}
	  	@Test(priority=3)
	  	public void SaveTicket()
	  	{
	  		System.out.println("SaveTicket");
	  	}
	  	@Test(priority=4)
	  	public void Logout()
	  	{
	  		System.out.println("Logout");
	  	}


}
