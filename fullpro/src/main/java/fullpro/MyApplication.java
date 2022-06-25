package fullpro;

import java.util.ArrayList;

public class MyApplication {
	  public  boolean flag = false;
	  public  boolean flagadd = false;
	  
	    users var = null ;
    	ArrayList<users> userclass = new ArrayList<users>();
    	ArrayList<book> books= new ArrayList<book>();
    	book b;

		
		boolean Author_flag=false;
		boolean Title_flag=false;
		boolean ISBN_flag=false;
		
		boolean found_Author=false;
		boolean found_Title=false;
		boolean found_ISBN=false;

		ArrayList <book> Books=new ArrayList <book> ();
		
	
		
    	//log in
		public boolean login(){
			for (int usersize = 0 ; usersize < userclass.size() ; usersize++) {
				if(userclass.contains(var)) {
					flag = true;
				}
			}
			if(flag == true)
				return true;
			
			return false;
		}
		

		
		// log out function
		public boolean logout(){
			if(flag == true)
				{ flag=false; }
						
			return flag;
		}
		public  boolean addBook(String isbn,String title,String author) {
			 for (int ubook = 0 ; ubook < books.size() ; ubook++) {
				 if(books.get(ubook).getisbn().equals(isbn)) {
					 flagadd=false;
					 
					}
				 
			}
			 if (flagadd == false)
				 return false;
			 else {
				 b.setisbn(isbn);
				 b.setauthor(author);
				 b.settitle(title);

			 books.add(b);
			     return true; } 
			 }
	
//
//				public  boolean searchA (String isbn,String title,String author) {
//				book variable1= new book(null, null, null);
//				variable1.setauthor("Areen");
//				variable1.settitle("Hello");
//				variable1.setisbn("123");
//				Books.add(variable1);
//				
//				for(int array_size=0; array_size<Books.size() ;array_size++)
//				{
//					if(Books.get(array_size).getauthor().toLowerCase().contains(variable1.getauthor().toLowerCase()))
//					{
//						System.out.println(Books.get(array_size).getauthor()+" "+Books.get(array_size).gettitle()+" "+Books.get(array_size).getisbn());
//						//Author_flag=true;
//						found_Author=true;
//					}
//					else 
//						Author_flag=false;
//
//				}
//		         if (Author_flag==found_Author)
//		            {
//			System.out.println("not found");
//		             }
//		      //   return found_Author;
//				return found_Author;
//				
//				}
//				
//				
//				
//				public  boolean searcht(String isbn,String title,String author) {
//			
//				
//				book variable2= new book(null, null, null);
//				variable2.setauthor("Taima");
//				variable2.settitle("Hi");
//				variable2.setisbn("123");
//				
//		
//		         for(int array_size=0; array_size<Books.size() ;array_size++)
//		 		{
//		 			if(Books.get(array_size).gettitle().toLowerCase().contains(variable2.gettitle().toLowerCase()))
//		 			{
//		 				System.out.println(Books.get(array_size).getauthor()+" "+Books.get(array_size).gettitle()+" "+Books.get(array_size).getisbn());
//		 				//Title_flag=true;
//		 				found_Title=true;
//		 			}
//		 			else 
//		 				Title_flag=false;
//
//		 		}
//		          if (Title_flag==found_Title)
//		             {
//		 	System.out.println("not found");
//		              }
//				return found_Title;
//		          
//		      
//				}
//	    
//
//				public  boolean searchi (String isbn,String title,String author) {          
//		            book variable1= new book(null, null, null);
//				variable1.setauthor("hi");
//				variable1.settitle("Hello");
//				variable1.setisbn("124");
//
//				Books.add(variable1);
//			 for(int array_size=0; array_size<Books.size() ;array_size++)
//				{
//					if(Books.get(array_size).getisbn().toLowerCase().contains(variable1.getisbn().toLowerCase()))
//					{
//						System.out.println(Books.get(array_size).getauthor()+" "+Books.get(array_size).gettitle()+" "+Books.get(array_size).getisbn());
//						//ISBN_flag=true;
//						found_ISBN=true;
//					}
//					else 
//						ISBN_flag=false;
//
//				}
//		       if (ISBN_flag==found_ISBN)
//		          {
//		    	 	System.out.println("not found");
//		           }
//			return found_ISBN;
//		       
//		      
//			       
//				}
//
//			
//		 

		//serach
		
		
}