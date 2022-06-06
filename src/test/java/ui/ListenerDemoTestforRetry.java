package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerDemoTestforRetry extends BaseTest {
	
	//Now iam using retrt from testng using retryilistener
 @Test//(retryAnalyzer = common.Retry.class)

	public void launchApp() {
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}

}
