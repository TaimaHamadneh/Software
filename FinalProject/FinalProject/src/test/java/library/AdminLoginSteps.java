package library;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import librarry.Admin;
import librarry.BookLibrary;

public class AdminLoginSteps {

	BookLibrary bl;
	Boolean t1,t;
	Admin a = new Admin();

	public AdminLoginSteps(BookLibrary bl2) {
		super();
		bl = bl2;
	}

	@Given("Admin selected to log in")
	public void admin_selected_to_log_in() {
		
	}

	@When("Admin entered the valid {string} and the valid {string}")
	public void admin_entered_the_valid_and_the_valid(String username, String password) {
		a.setUsername(username);
		a.setPasword(password);
		t = a.login();//t boolean , a admin
	}

	@Then("log in must be successful")
	public void log_in_must_be_successful() {
		assertTrue(t);
	}

	@When("Admin entered the valid {string} and the unvalid {string}")
	public void admin_entered_unvalid_password(String username, String password)  {
		a.setUsername(username);
		a.setPasword(password);
		t = a.login();
	}

	@Then("log in must be field")
	public void log_in_must_be_field() {
		assertTrue(!t);
	}
}