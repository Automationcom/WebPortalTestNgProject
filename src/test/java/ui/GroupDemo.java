package ui;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
@Test(groups = "user-registration")
public class GroupDemo {
	@BeforeClass
	public void beforeCLass() {
		System.out.println("This will run before the class");
	}
	@AfterClass
	public void afterCLass() {
		System.out.println("This will run After the class");
	}
	@BeforeGroups(value = "regression")
	public void beforeGroups() {
		System.out.println("run this method  before the regression");
	}
	@AfterGroups
	public void aftergroups() {
		System.out.println("run After the regression");
	}
	
		@Test(priority = 1, groups = "Regression")
		public void alogTest1() {
			
			System.out.println("Login1 is successful");
			}
		@Test(priority=2, groups = "Regression")
		public void blogTest() {
			System.out.println("Logout2 is successful");
		}

		@Test(groups = {"Regression","bvt"})
		public void bTest2() {
			System.out.println("BTest2 is successful");
			Assert.assertTrue(false);
		}
		@Test(groups = "bvt")
		public void bTest3() {
			System.out.println("BTest4 successful");
		}

}
