package librarry;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import librarry.Admin;
public class BookLibrary {
	protected static final List<MyBook1> item = new ArrayList<MyBook1>();
	protected static final MyBook1 b1=new MyBook1();
	protected static final MyBook1 b2=new MyBook1();
	protected static final MyBook1 b3=new MyBook1();
	protected static final MyBook1 b4=new MyBook1();
	
	
	protected static final List<Admin> admins = new ArrayList<Admin>();
	public static final Admin a1 = new Admin();
	protected static final Admin a2 = new Admin();
	protected static final Admin a3 = new Admin();

	protected static final List<User> Users = new ArrayList<User>();
	public static final User u1 = new User();
	protected static final User u2 = new User();
	protected static final User u3 = new User();
	
	
	Logger logger=Logger.getLogger(BookLibrary.class.getName());
	
	public BookLibrary () {
		super();
		b1.setTitle("lost");
		b1.setAuther("tolkien");
		b1.setISBN("0936385405");
		item.add(b1);
		
		b2.setTitle("markiting");
		b2.setAuther("mechell booth");
		b2.setISBN("0198534531");
		item.add(b2);
		
		b3.setTitle("lost and Wanted");
		b3.setAuther("NELL FREUDENBERGER");
		b3.setISBN("9780804170");
		item.add(b3);
		
		b4.setTitle("project managment");
		b4.setAuther("mechell booth");
		b4.setISBN("0471472840");
		item.add(b4);
		
		a1.setUsername("ali");
		a2.setUsername("aya");
		a3.setUsername("noor");

		a1.setPasword("12345");
		a2.setPasword("54321");
		a3.setPasword("6789");

		admins.add(a1);
		admins.add(a2);
		admins.add(a3);
		
		u1.setID("2479854");
		u1.setName("Taima");
		u1.setEmail("taimanizar45@gmail.com");
		u1.setAddress("Asira street");
		u1.setcity("Nablus");
		u1.setpostal("P400");
		
		u2.setID("2984754");
		u2.setName("Ahmad Ali");
		u2.setEmail("ahm@gmail.com");
		u2.setAddress(" Nablus street");
		u2.setcity("Nablus");
		u2.setpostal("P407");
		
		Users.add(u1);
		Users.add(u2);
	}
	/***** Search ********/
	public String search(String type, String string) {
		String t = "null";
		CharSequence seq = string;
		if (type.equalsIgnoreCase("title")) {
			t = "";
			for (int l = 0; l < item.size(); l++) {
				String test =(item.get(l).getTitle());				
				t = resultFound(t, seq, l, test);
			}
		}		
		if (type.equalsIgnoreCase("auther")) {
			t = "";
			for (int l = 0; l < item.size(); l++) {
				String test =(item.get(l).getAuther());

				t = resultFound(t, seq, l, test);
			}
		}		
		if (type.equalsIgnoreCase("isbn")) {
			t = "";
			for (int l = 0; l < item.size(); l++) {
				String test =(item.get(l).getISBN());
				t = resultFound(t, seq, l, test);
			}
		}				
		return t;
	}

	private String resultFound(String t, CharSequence seq, int l, String test) {
		if (test.contains(seq)) {
			t = test;
			logger.log(Level.INFO,item.get(l).getISBN()) ; 
			logger.log(Level.INFO,item.get(l).getTitle());
			logger.log(Level.INFO,item.get(l).getAuther());
		}
		return t;
	}

	public boolean addBook(MyBook1 b) {
		item.add(b);
		return true;
	}

	public boolean checkLogin(String username) {

		for (int i = 0; i < 3; i++)

		{
			if ((username.equalsIgnoreCase(admins.get(i).getUsername()))&&admins.get(i).getLogin().equals(Boolean.FALSE)) {
				
					return true;
			}
		}
		return false;
	}

	public static int foundUser = 0;

	 public void searchUser(String name) 
	 {
		  
	    for (User b : Users) 
	    {
	        if (b.getName().equals(name)) 
	        {
	           if (foundUser == 0) 
	    {
	        	   foundUser = 1;
	        }    
	       
	    }
	}
	    
	}
	 public static int counter= 0;
		public static int found = 0;
		 public void borrowBook(String title) 
		 {
			 counter++;
		  
		    for (MyBook1 b : item) 
		    {
		        if (b.getTitle().equals(title)) 
		        {
		           if (found == 0) 
		    {
		            found = 1;
		        }
		           
		        if (b.getBorrow() == false) 
		    {
		            b.setBorrow(true);
		            found = 2;
		            break;
		        }
		    }
		}
		    
		}
			public static int returnBook = 0;
			 public void returnBook(String title) 
			 {
				 counter--;
			    for (MyBook1 b : item) 
			    {
			        if (b.getTitle().equals(title)) 
			        {
			        	if(returnBook == 0) {
			        		returnBook = 1; // not borrowed
			        	}
			    
			        if (b.getBorrow() == true) 
			    {
			            b.setBorrow(false);
			            returnBook = 2;
			            break;
			        }
			    }
			}
			       
			}

}