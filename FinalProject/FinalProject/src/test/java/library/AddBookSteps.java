package library;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import librarry.Admin;
import librarry.BookLibrary;
import librarry.MyBook;


public class AddBookSteps {

	Admin a = new Admin();
	MyBook b = new MyBook();
	BookLibrary bl;
	boolean l, v, t;

	public AddBookSteps(BookLibrary bl2) {
		super();
		bl = bl2;
	}

	@Given("Admin loged in")
	public void admin_loged_in() {

	}

	@When("Admin {string} select to add book")
	public void admin_select_to_add_book(String username) {
		l = bl.checkLogin(username);
	}

	@When("Admin must enter the {string},{string},{string}")
	public void admin_must_enter_the(String auther, String title, String ISBN) {
		b.setTitle(title);
		b.setAuther(auther);
		b.setISBN(ISBN);
	}

	@When("valid isbn {string}")
	public void valid_isbn(String ISBN) {
		
			b.setISBN(ISBN);
			t = bl.addBook(b);
		
	}

	@Then("book was added to the library")
	public void book_was_added_to_the_library() {
		assertTrue(t);
	}

	@When("unvalid isbn {string}")
	public void unvalid_isbn(String ISBN) {
	
			t = false;
	}

	@Then("The book has not been added")
	public void the_book_has_not_been_added() {
		assertTrue(!t);
	}

	@Given("Admin not loged in")
	public void admin_not_loged_in() {

	}

	@When("Admin with select to add book")
	public void admin_with_select_to_add_book() {
		l = bl.checkLogin(a.getUsername());
	}

	@Then("Admin could not add book")
	public void admin_could_not_add_book() {
		assertTrue(!l);
	}

}