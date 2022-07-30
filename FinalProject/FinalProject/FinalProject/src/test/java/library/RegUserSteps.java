package library;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import librarry.Admin;
import librarry.BookLibrary;
import librarry.MyBook;
import librarry.User;

public class RegUserSteps {
	User user = new User();
	Admin admin = new Admin();
	MyBook book = new MyBook();
	BookLibrary booklib;
	boolean l, v, t;

	public RegUserSteps(BookLibrary bl2) {
		super();
		booklib = bl2;
	}

	@Given("Admin selected to Create {string}")
	public void admin_selected_to_create(String username) {
		l = booklib.checkLogin(username);// Check Admin

	}

	@When("Admin entered the valid {string} and the valid {string} and the valid {string} and the valid {string} and the valid {string} and the valid {string}")
	public void admin_entered_the_valid_and_the_valid_and_the_valid_and_the_valid_and_the_valid_and_the_valid(String id,
			String name, String email, String address, String postal, String city) {
		user.setAddress(address);
		user.setcity(city);
		user.setEmail(email);
		user.setName(name);
		user.setpostal(postal);
		user.setID(id);
		t = user.login();// t boolean
	}

	@Then("Create user must be successful")
	public void create_user_must_be_successful() {
		assertTrue(t);
	}

	/*
	 * @When("Admin entered the valid Email and the valid <ID> and the valid <Email> and the valid <Address> and the valid <Postal code> and the valid <City>"
	 * ) public void
	 * admin_entered_the_valid_email_and_the_valid_id_and_the_valid_email_and_the_valid_address_and_the_valid_postal_code_and_the_valid_city
	 * () {
	 * 
	 * }
	 * 
	 * @When("Admin entered the valid Address and the valid <ID> and the valid <Email> and the valid <Address> and the valid <Postal code> and the valid <City>"
	 * ) public void
	 * admin_entered_the_valid_address_and_the_valid_id_and_the_valid_email_and_the_valid_address_and_the_valid_postal_code_and_the_valid_city
	 * () { }
	 * 
	 * @When("Admin entered the valid Postal code and the valid <ID> and the valid <Email> and the valid <Address> and the valid <Postal code> and the valid <City>"
	 * ) public void
	 * admin_entered_the_valid_postal_code_and_the_valid_id_and_the_valid_email_and_the_valid_address_and_the_valid_postal_code_and_the_valid_city
	 * () {
	 * 
	 * }
	 * 
	 * @When("Admin entered the valid City and the valid <ID> and the valid <Email> and the valid <Address> and the valid <Postal code> and the valid <City>"
	 * ) public void
	 * admin_entered_the_valid_city_and_the_valid_id_and_the_valid_email_and_the_valid_address_and_the_valid_postal_code_and_the_valid_city
	 * () {
	 * 
	 * }
	 */

	@Given("Admin is logged in")
	public void admin_is_logged_in() {
	}

	@When("Admin selected to create {string}")
	public void admin_selected_to_create_user(String username) {
		l = booklib.checkLogin(username);// Check Admin

	}

	@When("user is already exist")
	public void user_is_already_exist() {
		if (booklib.foundUser == 1) {
			assertTrue(!t);
		}
	}

	@Then("Admin can not add this user")
	public void admin_can_not_add_this_user() {
		assertTrue(!t);
	}

	@Given("Admin is not logged in")
	public void admin_is_not_logged_in() {
	}

	@When("Admin selected to create user")
	public void admin_selected_to_create_user() {
		l = booklib.checkLogin(admin.getUsername());

	}

	@Then("Admin can not create user")
	public void admin_can_not_create_user() {
		assertTrue(!l);
		System.out.print("You should log in");

	}

}
