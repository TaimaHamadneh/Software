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

}
