package library;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.datatable.DataTable;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import librarry.MyBook;
import librarry.BookLibrary;

public class SearchBookSteps {

	public BookLibrary b;
	public static ArrayList<MyBook> item = new ArrayList<MyBook>();
	String s;
	String out;

	public SearchBookSteps(BookLibrary b) {
		super();
		this.b = b;
	}
	

	@Given("i choose to search by title")
	public void i_choose_to_search_by_title() {
		s = "title";
	}

	@When("i entered a valid substring {string}")
	public void i_entered_a_valid_substring(String string) {
		out = b.search(s, string);
	}

	@Then("the book for this title will shown")
	public void the_book_for_this_title_will_shown() {
		assertSame("markiting",out);
		
	}
	
	@Then("all book for this title will shown")
	public void all_book_for_this_title_will_shown() {
		assertSame("lost and Wanted",out);
	}

	@Given("i choose to search by author")
	public void i_choose_to_search_by_author() {
		s = "auther";
	}

	
	@Then("the book for this auther will shown")
	public void the_book_for_this_auther_will_shown() {
		assertSame("tolkien",out);
	}

	
	@Then("all book for this auther will shown")
	public void all_book_for_this_auther_will_shown() {
		assertSame("tolkien",out);
	}

	@Given("i choose to search by ISBN")
	public void i_choose_to_search_by_isbn() {
		s = "isbn";
	}

	
	@Then("the book for this isbn will shown")
	public void the_book_for_this_isbn_will_shown() {
		assertSame("0936385405",out);
	}



	@When("i entered  invalid substring {string}")
	public void i_entered_invalid_substring(String string) {
		out = b.search(s, string);
	}

	@Then("no information will apear")
	public void no_information_will_apear() {
		assertSame( "",out);
	}

}