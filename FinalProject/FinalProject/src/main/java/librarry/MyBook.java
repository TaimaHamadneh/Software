package librarry;

import javax.persistence.Entity;

@Entity
public class MyBook {
	
	private String bookTitle;
	private String bookAuther;
	private String bookIsbn;
	private Boolean bookBorrow;

	public void setTitle(String title){
		this.bookTitle = title;
	}
	public String getTitle(){
		return bookTitle;
	}
	
	public void setAuther(String auther){
		this.bookAuther = auther;
	}
	public String getAuther(){
		return bookAuther;
	}
	
	public void setISBN(String myIsbn){
		this.bookIsbn = myIsbn;
	}
	public String getISBN(){
		return bookIsbn;
	}
	public void setBorrow(Boolean Borrow){
		this.bookBorrow = Borrow;
	}
	public Boolean getBorrow(){
		return bookBorrow;
	}
	
}
