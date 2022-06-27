package stepDefination;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.BlogPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class blogpageStepsTest {

	BlogPage blogpage = new BlogPage(DriverFactory.getDriver());
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		DriverFactory.getDriver().get("https://www.dietician/home.com");
	}

	@When("User clicks on Blogs link")
	public void user_clicks_on_blogs_link() {
		 blogpage.clickOnBolglink();
           System.out.println(blogpage.getbligtitle());
		
		
	}

	@Then("User is directed to Blogs Page")  
	public void user_is_directed_to_blogs_page() {
		
		Assert.assertSame(blogpage,blogpage);
	}


}
