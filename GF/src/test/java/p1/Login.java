package p1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class Login {
	@Given("i Enter the username")
	public void i_Enter_the_username() {
		
		System.out.println("username is entered");
	   
	}

	@And("i Enter the password")
	public void i_Enter_the_password() {
		System.out.println("password is entered");
	    
	}

	@When("i click on Login button")
	public void i_click_on_Login_button() {
		System.out.println("Login button clicked");
	    
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("user in home page");
	    
	}


}
