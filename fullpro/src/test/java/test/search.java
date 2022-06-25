package test;

import fullpro.MyApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	MyApplication app;
	//constructor injection
	public search() {
		app = new MyApplication();
	}

	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
		System.out.println(" that the admin is logged in\n");	

	}

	@Given("these books are contained in the library")
	public void these_books_are_contained_in_the_library(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(" these books are contained in the library.\n");	
	}

	@Given("the admin logs out")
	public void the_admin_logs_out() {
		System.out.println(" the admin logs out\n");	

	}

	@Given("that the admin is not logged in")
	public void that_the_admin_is_not_logged_in() {
		System.out.println("that the admin is not logged in\n");	
	}

	@When("the user searches for the text {string}")
	public void the_user_searches_for_the_text(String string) {
//		app.searchA(string, string, string);
//		
	

	}

	@Then("the book with code {string} is found")
	public void the_book_with_code_is_found(String string) {
		
		System.out.println("the book with code {string} is found\n");	

	}

	@Then("no books are found")
	public void no_books_are_found() {
		System.out.println("no books are found\n");	

	}

	@Then("the books with code {string} and {string} are found")
	public void the_books_with_code_and_are_found(String string, String string2) {
		System.out.println("the books with code {string} and {string} are found\n");	

	}


}
