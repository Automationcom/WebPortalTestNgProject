package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	Boolean datasetup = true;
	
	@Test(enabled=false)
	public void skipTest1() {
		System.out.println("Skipping this as it is not complete");
	}
	@Test
	public void skipTest2() {
		System.out.println("Skipping this forcefully");
		throw new SkipException("Skipping this Test");
	}
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test bassend on the codition");
		if(datasetup==true) {
			System.out.println("Execute the test");
		}else {
			System.out.println("DO not execute the step");
			throw new SkipException("Do not execute this test");
		}
	}
	


}
