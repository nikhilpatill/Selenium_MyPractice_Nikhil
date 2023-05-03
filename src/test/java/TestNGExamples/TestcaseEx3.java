package TestNGExamples;

import org.testng.annotations.Test;

public class TestcaseEx3 {
	
	@Test(priority=1)
	
	public void TestcaseMethod()
	{
		
		System.out.println( "first tast case" );
		
	}
	
  @Test(priority=2)
	
	public void testcaseMethod2()
	{
		
		System.out.println( "first tast case2" );
		
	}
  
  
  @Test(priority=3)
	
	public void TestcaseMethod3()
	{
		
		System.out.println( "first tast case3");
		
	}
  
  @Test(priority=2)
	
 	public void TestcaseMethod4()
 	{
 		
 		System.out.println( "first tast case4");
 		
 	}

}
