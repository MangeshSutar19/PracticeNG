package P13_GroupConcept;

import org.testng.annotations.*;

public class P13_02_NewTestClass {

	@Test(groups = {"functional" ,"sanity"})
	public void Method5()
	{
		System.out.println("funtional and sanity group METHOD-5");

	}
	@Test(groups = {"smoke","functional" })
	public void Method6()
	{
		System.out.println("Smoke and funtional  group METHOD-6");

	}
	@Test(groups = {"smoke" ,"sanity"})
	public void Method7()
	{
		System.out.println("Smoke  and sanity group METHOD-7");

	}
	@Test
	public void Method8()
	{
		System.out.println("This method is not belongs to any group METHOD-8");

	}

}
