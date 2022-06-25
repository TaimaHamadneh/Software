package test;

import fullpro.MyApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class logout {
	MyApplication app;
	//constructor injection
	public logout() {
		app = new MyApplication();
	}

	
	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
			System.out.println("This step admin is logged in.");	
	}

	@When("the admin logs out")
	public void the_admin_logs_out() {
		app.logout();
		System.out.println("This step admin is logged out.");	

	}
}
