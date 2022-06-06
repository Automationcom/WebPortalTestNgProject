package ui;

import org.testng.annotations.Test;

import common.CommonDataSetup;

public class GroupDemoTest2 extends CommonDataSetup{
	
	
	
	
		@Test(priority = 1, groups = "Regression")
		public void aloginTest() {
			
			System.out.println("Login1 is successful");
			}
		@Test(priority=2,groups = "Regression")
		public void blogoutTest() {
			System.out.println("Logout2 is successful");
		}

		@Test(groups = {"Regression","bvt"})
		public void bTest2() {
			System.out.println("BTest3 successful");
		}
		@Test(groups = "bvt")
		public void bTest3() {
			System.out.println("BTest4 successful");
		}

}
