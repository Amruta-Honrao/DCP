package StepDefinitions;

import PageClasses.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	
	LoginPage LoginPageObj = new LoginPage(DriverManage.getDriver());
		
	@Given("I launch the url")
	public void i_launch_the_url() {
		
		//DriverManage.getDriver().get("");
	}

	@When("I enter the {string} and {string}")
	public void i_enter_the_and(String UserName, String Password) {
		//LoginPageObj.enterLoginDetails(UserName, Password);
	
	}
	

	@Then("I click Login")
	public void i_click_login() {
	//	LoginPageObj.click();
	}
	
	@Then("I verify the successful login happeped")
	public void i_verify_the_successful_login_happeped() {
		
		System.out.println("Login successful");

}

}
