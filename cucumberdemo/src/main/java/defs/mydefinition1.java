package defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mydefinition1 {
	@Given("Apllication URL is not working")
	public void apllication_URL_is_not_working() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//System.out.println("appplication is not working properly!");
	}

	@When("user enters username")
	public void user_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("user enters username");
	}

	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("user enters password");
	}

	@Then("he clickles on the submit button")
	public void he_clickles_on_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("he clickles on the submit button");
	}

	@Then("verifies the login process")
	public void verifies_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("verifies the login process");
	}

	@Then("he choses to close the application")
	public void he_choses_to_close_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("he choses to close the application");
	}

}
