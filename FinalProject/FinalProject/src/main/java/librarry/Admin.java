package librarry;

public class Admin {
	
	private String username;
	private String pasword;
	private Boolean login;
	
	public Admin() {
		super();
	    this.pasword="";
	    this.username="";
		this.login = false;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public Boolean getLogin() {
		return login;
	}
	public void setLogin(Boolean login) {
		this.login = login;
	}
	public Boolean login() {
		for (int i = 0; i < 3; i++)
	
		{
			if (getUsername().equalsIgnoreCase(BookLibrary.admins.get(i).getUsername())
					&& getPasword().equalsIgnoreCase(BookLibrary.admins.get(i).getPasword())) {
				BookLibrary.admins.get(i).setLogin(true);
				return true;
			}
		
		}
		return false;
	}
	public boolean logout(String username) {
	
		for (int i = 0; i < 3; i++)
	
		{
			if (username.equalsIgnoreCase(BookLibrary.admins.get(i).getUsername())&& BookLibrary.admins.get(i).getLogin().equals(Boolean.FALSE)) 
			 {
					BookLibrary.admins.get(i).setLogin(false);
					return true;
				}
	
			
		}
		return false;
	
	}
	
}