package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo2test {
	

	@Test(dataProvider ="dataSet",dataProviderClass = DataProvidercon.class)
	public void test(String username, String password) {
		System.out.println(username+ "===="+password);
		
	
		
	}
	
	@Test(dataProvider ="WITHCODE",dataProviderClass = DataProvidercon.class)
	public void test1(String username, String password) {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login-button")).click();
		System.out.println(username+ "===="+password+"+++" );
		driver.close();
		System.out.println(username+ "===="+password+"+++" );
}
	
@DataProvider(name = "Create")

public Object[][] dataSet1() {
	return new Object[][]
			{{ " standard_user","secret_sauce"}, 
		   {" locked_out_user","secret_sauce"},     
		  {"problem_user","secret_sauce"},
		   {"performance_glitch_user", "secret_sauce"}
			
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
