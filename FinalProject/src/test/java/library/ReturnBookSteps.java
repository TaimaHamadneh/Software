package library;

import static org.junit.Assert.assertTrue;
import javax.swing.JOptionPane;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import librarry.Admin;
import librarry.BookLibrary;
import librarry.MyBook;
import librarry.User;

public class ReturnBookSteps {
	Admin a = new Admin();
	MyBook b = new MyBook();
	BookLibrary b2;
	boolean l, v, t;

	public ReturnBookSteps(BookLibrary bl2) {
		super();
		b2 = bl2;
	}
	@Given("user is logged in")
	public void user_is_logged_in() {

	}
	@When("user {string} select to return a book")
	public void user_select_to_return_a_book(String username) {
	//b2.returnBook(title);	
		l = b2.checkLogin(username);

	}	

	@Then("the book is available in the library now")
	public void the_book_is_available_in_the_library_now() {
	}

	@Then("the book is returned to the library")
	public void the_book_is_returned_to_the_library() {
		
		if (b2.returnBook == 0) {
	        System.out.println("Sorry, this book is not in our catalog.");
	        assertTrue(!t);

	    } else if (b2.returnBook == 1) {
	        System.out.println("Sorry, this book is not borrowed.");
	        assertTrue(!t);

	    } else if (b2.returnBook == 2) {
	        System.out.println("You successfully returned " );
	        assertTrue(t);
	    }
	}
	
	@When("the book with {string} is not Borrowed")
	public void the_book_with_is_not_borrowed(String title) {
		b2.returnBook(title);	

	}

	@Then("the user could not return the book")
	public void the_user_could_not_return_the_book() {
		assertTrue(!t);
	}

	@Given("that the user is not logged in")
	public void that_the_administrator_is_not_logged_in() {

	}
	@When("user with select to return a book")
	public void user_with_select_to_return_a_book() {
		l = b2.checkLogin(a.getUsername());
	}

	@Then("user could not return book")
	public void user_could_not_return_book() {
	    assertTrue(!t);
	}



	

}
