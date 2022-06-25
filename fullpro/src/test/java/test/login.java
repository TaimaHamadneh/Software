package test;

import fullpro.MyApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class login {
	
	MyApplication app;
	//constructor injection
	public login() {
		app = new MyApplication();
	}

	public boolean flag=false;

	@Given("that the admin is not logged in")
	public void that_the_admin_is_not_logged_in() {
		System.out.print("that the admin is not logged in\n");
	
	}

	@Given("the password is {string}")
	public void the_password_is(String string) {
		app.login();
		if(flag == true) {
			System.out.print("User logged in\n");
		}
		else {
			System.out.print("User is not logged in\n");
		
		}		
	}

	@Then("the admin login succeeds")
	public void the_admin_login_succeeds() {
		//Assert.assertEquals(true,app.login());

		System.out.print("the admin login succeeds\n");
	

	}

	@Then("the admin is logged in")
	public void the_admin_is_logged_in() {
		System.out.print("the admin is logged in\n");
		
	}

	@Then("the admin login fails")
	public void the_admin_login_fails() {
	//	Assert.assertEquals(false,app.login());
		System.out.print("the admin login fails\n");
		

	}

	@Then("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
		System.out.print("the admin is not logged in");
	 
	}




}
