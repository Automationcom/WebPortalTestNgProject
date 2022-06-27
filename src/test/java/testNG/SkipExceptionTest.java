package testNG;
    import org.testng.SkipException;
	import org.testng.annotations.Test;

	public class SkipExceptionTest {
		Boolean data = false;
		@Test(enabled=false)
		public void skipTest1() {
			System.out.println("Skip this Test it is not implementd");
		}
		
		@Test
		public void skipTest2() {
			System.out.println("Skip this testcase forcefully");
			throw new SkipException("Skipping this Test");
		}

		@Test
		public void skipTest3() {
			System.out.println("Skip this test bassend on the codition");
			
			if(data==true) {
				System.out.println("Execute this test");
			}else {
				System.out.println("DO not execute this step");
				throw new SkipException("Do not execute this test");
			}
		}
	}
		


	


