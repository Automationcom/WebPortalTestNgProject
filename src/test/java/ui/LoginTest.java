package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority = 1,description = "This is my login test", groups="regression")
	public void dloginTest() {
		
		System.out.println("Login is successful");
		}
	@Test(priority=2,description = "This is my Logout TestCase ", groups="regression")
	public void alogoutTest() {
		System.out.println("Logout ,,,,is successful");
	}
@BeforeTest
	public void loginintoapplication() {
		System.out.println("This is login Aplication");
	}
	@AfterTest   
	public void logoutfromapplication() {
		System.out.println("This is logout from Aplication");
	}
	@BeforeMethod
	public void connectDB() {
		System.out.println("This is runs before the every @Testmethod Every time. If We have 4 @Test then it runs 4time beforemethod");
	}
	@AfterMethod
	public void disconnectDB() {
		System.out.println("This is runs After the @Testmethod Every time");
	}
	
	@Test
	public void signinTest() {
		System.out.println("This is 3Rd Test");
	}
	
	
	
	
	
}

