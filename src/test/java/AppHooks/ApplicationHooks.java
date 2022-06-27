package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private DriverFactory driverfcat;
	private WebDriver driver;
	private ConfigReader configread;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
		configread= new ConfigReader();
		prop = configread.inti_prop();
	}
	@Before(order=1)
	public void launchBrowser() {
		String browserName =prop.getProperty("browser");
		driverfcat = new DriverFactory();
		driverfcat.init_driver(browserName);
	}
@After(order=0)
public void quitBrowser() {
	driver.quit();
}

@After(order=1)
public void Teardown(Scenario scenario) {
	if (scenario.isFailed()) {
		//take screenshot:
		String screenshotname = scenario.getName().replace(" ", "_");
		byte [] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath,"image/png",screenshotname);
	}
	
}


}
