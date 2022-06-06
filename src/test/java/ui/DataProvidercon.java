package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvidercon {

	
	@DataProvider(name = "Create")

	public Object[][] dataSet1(Method m) {
		
		Object[][]testdata = null;
		
		if(m.getName().equals("test"))
		{
			testdata = new Object[][]
		          {
				  { "username","password"}, 
				  {"username1","password1"},
				  {"username2","password2"}
					
			      };
		}
		
				else if (m.getName().equals("test1"))
				{
						testdata = new Object[][]
					        {
							{ "username","password","test"}, 
						    {"username1","password1","test2"},
							{"username2","password2", "test3"}
							 };
				}
				else if (m.getName().equals("test2"))
				{
						testdata = new Object[][]
					        {
							{ "username","password","test","test1"}, 
						    {"username1","password1","test2","test1"},
							{"username2","password2", "test3","test1"}
							 };
				}
		
					return testdata;
								
					}
		
		
		

		
		
		@DataProvider(name = "WITHCODE")
//dataset1 and dataset2 aresame
		public Object[][] dataSet2() {
			return new Object[][]
					{{ " standard_user","secret_sauce"}, 
				   {" locked_out_user","secret_sauce"},     
				  {"problem_user","secret_sauce"},
				   {"performance_glitch_user", "secret_sauce"}
					
					};
		}
}
