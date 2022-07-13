package librarry;

public class User {	
	
	private String ID;
	private String name;
	private String email;
	private String address;
	private String postal;
	private String city;
	private Boolean login;

	public User() {
		super();
	    this.name="";
	    this.ID="";
		this.email ="";
		this.address="";
		this.postal="";	
		this.city="";
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		this.ID = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getpostal() {
		return postal;
	}
	public void setpostal(String postal) {
		this.postal = postal;
	}
	
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public Boolean getLogin() {
		return login;
	}
	public void setLogin(Boolean login) {
		this.login = login;
	}
	public Boolean login() {
		
		for (int i = 0; i < 6; i++)
		{
			if (getName().equalsIgnoreCase(BookLibrary.Users.get(i).getName())
					&& getEmail().equalsIgnoreCase(BookLibrary.Users.get(i).getEmail())
					&& getAddress().equalsIgnoreCase(BookLibrary.Users.get(i).getAddress())
					&& getpostal().equalsIgnoreCase(BookLibrary.Users.get(i).getpostal())
					&& getcity().equalsIgnoreCase(BookLibrary.Users.get(i).getcity())
					&& getID().equalsIgnoreCase(BookLibrary.Users.get(i).getID())

					) {
				BookLibrary.Users.get(i).setLogin(true);
				return true;
			}
		}
		return false;
	}
	
	
}
