package eCommerce;

public abstract class User
{
	private int priuserId;
	private String username;
	private String password;
	private String email;
	
	// getter and setter method
	public int getPriuserId() {
		return priuserId;
	}
	public void setPriuserId(int priuserId) {
		this.priuserId = priuserId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	// for print 
	@Override
	public String toString()
	{
		return "User [priuserId=" + priuserId + ", username=" + username + ", password=" + password + ", email=" + email
				+ "]";
	}
	
	public User(int priuserId, String username, String password, String email) 
	{
		this.priuserId = priuserId;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	// for Login
	public void login() 
	{
        System.out.println(username  + " logged in");
    }
	// for Logout
	public void logout() 
	{
        System.out.println(username + " logged out.");
    }
	// for view profile
	 public abstract void viewProfile();
	// for Update profile
	 public abstract void updateProfile();
	
	
	
	
	
	
}
