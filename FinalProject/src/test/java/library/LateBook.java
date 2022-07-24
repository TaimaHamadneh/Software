package library;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Period;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import librarry.BookLibrary;
import librarry.MyBook1;

public class LateBook {
	BookLibrary bl;
	boolean late, day, t;
	MyBook1 b = new MyBook1();
	
	@Given("the user has borrowed a book")
	public void the_user_has_borrowed_a_book() {
		if(bl.found == 2) {
        assertTrue(t);
        }
	}

	@Given("{int} days have passed")
	public void days_have_passed(Integer int1) {
		if(int1 == 21) {
			System.out.print(" 21 days have passed\r\n");
			assertTrue(day);
		}
	}

	@Given("the fine for one late book is {int} NIS")
	public void the_fine_for_one_late_book_is_nis(Integer int1) {
		if(day == true) {
			assertTrue(late);
			
		}
		
	}

	@Then("the user has Late books")
	public void the_user_has_late_books() {
		
	}

	@Then("the user has to pay a fine of {int} NIS")
	public void the_user_has_to_pay_a_fine_of_nis(Integer int1) {
		LocalDate today = LocalDate.now();
		Period period = Period. between(b.getDate(), today);
		if(period.getDays() == 21 && day == true ) {
			System.out.print("The user has to pay a fine of "+ int1 +" NIS \n");
		
		}
	}

}