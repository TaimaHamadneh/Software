package fullpro;

public class book {
	   private  String isbn;
	   private String title;
	   private String author;

	   public book(String isbn, String title, String author) {
	        this.isbn = isbn;
	        this.title = title;
	        this.author = author;
	       

	    }
	   public String getisbn() {
	    	return isbn;
	    }
	    
	    public String gettitle() {
	    	return title;
	    }
	    
	    public String getauthor() {
	    	return author;
	    }
	    
	    public void setisbn(String isbn) {
	    	this.isbn=isbn;
	    }
	    public void settitle(String title) {
	    	this.title=title;
	    }
	    public void setauthor(String author) {
	    	this.author=author;
	    }
}
