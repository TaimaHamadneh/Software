package library;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import librarry.Admin;
import librarry.BookLibrary;
import librarry.MyBook;
import librarry.User;


public class BorrowBook {
	User a = new User();
	MyBook b = new MyBook();
	BookLibrary bl;
	boolean l, v, t;
	boolean userlogin,days21;

	
	public BorrowBook(BookLibrary bl2) {
		super();
		bl = bl2;
	}
	
	@Given("user logged in")
	public void user_logged_in() {
		
	}

	@When("user {string} select to borrow book")
	public void user_select_to_borrow_book(String username) {
		l = bl.checkLogin(username);
	}

	@When("user must enter the {string}")
	public void user_must_enter_the(String title) {
	   bl.borrowBook(title);
	}

	@Then("book was borrowed from the library if it available")
	public void book_was_borrowed_from_the_library_if_it_available() {
		if (bl.found == 0) {
	        System.out.println("Sorry, this book is not in our catalog.");
	        assertTrue(!t);

	    } else if (bl.found == 1) {
	        System.out.println("Sorry, this book is already borrowed.");
	        assertTrue(!t);

	    } else if (bl.found == 2) {
	        System.out.println("You successfully borrowed " );
	        assertTrue(t);
	    }
	
	}

	@Then("the book is not in library now")
	public void the_book_is_not_in_library_now() {
		if (bl.found == 1) {
	        System.out.println("Sorry, this book is already borrowed.");
	        assertTrue(!t);

	    }
		
	}

	@When("user have {int} book from library")
	public void user_have_book_from_library(Integer int1) {
	//    if(bl.counter == 5) {
		if(int1 == 5) {
	    	assertTrue(!t);
	    System.out.println("you can't borrow more than five books");
	    }
	    
	}

	@Then("user con not borrow another books")
	public void user_con_not_borrow_another_books() {
		assertTrue(!t);
	}

	@Given("user not logged in")
	public void user_not_logged_in() {
	    
	}

	@When("user with select to borrow book")
	public void user_with_select_to_borrow_book() {
		l = bl.checkLogin(a.getName());

	}

	@Then("user could not borrow book")
	public void user_could_not_borrow_book() {
		assertTrue(!l);
	}
	

//*************************************************
	@Given("a book with code {string} is in the library")
	public void a_book_with_code_is_in_the_library(String string) {

	}

	@When("the user borrows the book with code {string}")
	public void the_user_borrows_the_book_with_code(String string) {

		userlogin = a.login();

	}

	@When("{int} days have passed")
	public void days_have_passed(Integer int1) {
		if (int1 == 21) {
			assertTrue(days21);
		}

	}

	@Then("the book with code {string} is not borrowed by the user")
	public void the_book_with_code_is_not_borrowed_by_the_user(String string) {

	}

	@Then("the error message {string}")
	public void the_error_message(String string) {

	}

	@Given("a user is registered with the library")
	public void a_user_is_registered_with_the_library() {

	}

	@Then("the user has to pay a fine of {int} NIS")
	public void the_user_has_to_pay_a_fine_of_nis(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user returns the book with code {string}")
	public void the_user_returns_the_book_with_code(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the book with code {string} is not borroweed by the user")
	public void the_book_with_code_is_not_borroweed_by_the_user(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
