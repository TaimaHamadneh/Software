package fullpro;

public class users{
	
	private String username;
	private String password;

	public String getusername() {
		return username;
	}
	public void setusername(String name) {
		 this.username = name;
	}
	public void users(String user, String pass){
	    username = user;
	    password = pass;
	}
	
	public boolean isNameEqual(String name){
        return this.username.toLowerCase().contains(name.toLowerCase());
    }
    public boolean isPassEqual(String pass){
        return this.password.toLowerCase().contains(pass.toLowerCase());
    }
}