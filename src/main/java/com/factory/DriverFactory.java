package com.factory;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	 
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	/**
	 * This will give a parlor Execution
	 * This method is used to intialize the threadlocal driver on the basis of given browser
	 * @param browser
	 * @return
	 */
	
	
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is " + browser);
		
		if (browser.equals(browser)) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals(browser)) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}else if (browser.equals(browser)) {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		}else {
			System.out.println("Please pass the correct browse value" + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
			
	}
	
	/**
	 * This is used to get the driver with Threadlocal
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
		
	}
	

}
