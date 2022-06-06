package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	

	@Test(dataProvider ="Create",dataProviderClass = DataProvidercon.class)
	public void test(String username, String password) {
		System.out.println(username+ "===="+password);
		
	
		
	}
	
	@Test(dataProvider ="Create",dataProviderClass = DataProvidercon.class)
	public void test1(String username, String password,String test) {
		System.out.println(username+ "===="+password+"+++" +test);
		
	
		
	}

	@Test(dataProvider ="Create",dataProviderClass = DataProvidercon.class)
	public void test2(String username, String password,String test, String test1) {
		System.out.println(username+ "===="+password+"+++" +test+"===="+test1);
		
	
		
	}
	
@DataProvider(name = "Create")

public Object[][] dataSet1() {
	return new Object[][]
			{{ "username","password","test"}, 
		   {"username1","password1","test2"},
			 {"username2","password2", "test3"}
			
			};
}

	@DataProvider// this 1way to give datprovider
	public Object[][] dataSet() {
		//it a multi dimentional arrya  r  c 
		Object[][] dataset = new Object[4][2];
		
		//first row
		dataset[0][0]="user1";
		dataset[0][1]="pass1";
		//2nd row
		dataset[1][0]="user2";
		dataset[1][1]="pass2";
		//3rd row
		dataset[2][0]="user3";
		dataset[2][1]="pass3";
		//4th row
		dataset[3][0]="user4";
		dataset[3][1]="pass4";
		
		return dataset;
		
		}
	}
