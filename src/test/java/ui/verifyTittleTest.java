package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyTittleTest {
	@Test
	public void titleTest() {
		
//Difference between Hard Assert and Soft Assert.. Hard we can't see all failure, in soft we can excecute all the test cases without any 
	//Breaks.
		// TetNG provides the functionality of categorize your Testcases into groups.
		SoftAssert softassert = new SoftAssert();
		String expectedtitle = "Electronics, Cars, --gFashion, Collectibles & More | eBay";
		String expectedtext = "submit loo";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		softassert.assertEquals(actualtitle, expectedtitle);
		System.out.println(actualtitle);
		
		String actualtext = driver.findElement(By.xpath("//input[@value='Search']")).getAttribute("type");
		softassert.assertEquals(actualtext, expectedtext, "Text Varification Failed");
		System.out.println(actualtext);
		softassert.assertAll();
		driver.close();
	}

}
