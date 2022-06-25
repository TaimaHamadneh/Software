package test;

import fullpro.MyApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addbook {
	

	MyApplication app;
	//constructor injection
	public addbook() {
		app = new MyApplication();
	}

	
	
	@Given("that the administrator is logged in")
	public void that_the_administrator_is_logged_in() {
		System.out.println(" admin is logged in.\n");	
	}

	@Given("there is a book with title {string}, author {string}, and signature {string}")
	public void there_is_a_book_with_title_author_and_signature(String string, String string2, String string3) {
	app.addBook(string, string2, string3);
		System.out.println("This step admin is logged in.\n");	
	}

	@When("the book is added to the library")
	public void the_book_is_added_to_the_library() {
		System.out.println("the book is added to the library\n");	
	}

	@Then("the book with title {string}, author {string}, and signature {string} is contained in the library")
	public void the_book_with_title_author_and_signature_is_contained_in_the_library(String string, String string2, String string3) {
		System.out.println("the book with title {string}, author {string}, and signature {string} is contained in the library\n");	
	}

	@Given("that the administrator is not logged in")
	public void that_the_administrator_is_not_logged_in() {
		System.out.println("that the administrator is not logged in\n");	

	}

	@Then("the error message {string} is given")
	public void the_error_message_is_given(String string) {
		System.out.println("the error message {string} is given\n");	

	}


}
