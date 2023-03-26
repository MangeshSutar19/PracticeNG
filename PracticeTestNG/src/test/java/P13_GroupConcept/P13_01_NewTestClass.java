package P13_GroupConcept;

import org.testng.annotations.*;

@Test(groups ="all")
public class P13_01_NewTestClass {

	@Test(groups = {"smoke","functional" ,"sanity"})
	public void Method1()
	{
		System.out.println("Smoke ,funtional and sanity group- METHOD-1");
		
	}
	@Test(groups = {"smoke" ,"sanity"})
	public void Method2()
	{
		System.out.println("Smoke and sanity group METHOD-2");
		
	}
	@Test(groups = {"functional" ,"sanity"})
	public void Method3()
	{
		System.out.println("funtional and sanity group METHOD-3");		
	}
	@Test(groups = {"smoke","functional" })
	public void Method4()
	{
		System.out.println("Smoke and funtional  group METHOD-4");

	}

}
