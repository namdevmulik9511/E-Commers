package eCommerce;

import java.util.*;

public class UserManager 
{
	private List<User> userList;
    private User loggedInUser;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void register(User user)
    {
    	for(User u:userList)
    	{
    		if(u.getUsername().equals(user.getUsername()))
    		{
    			System.out.println("Username already taken");
    			return;
    		}
    	}
    	 userList.add(user);
         System.out.println("User registered: " + user.getUsername());
    }

    public void login(String username, String password) 
    {
    	for(User u:userList)
    	{
    		if(u.getUsername().equals(username) && u.getPassword().equals(password))
    		{
    			loggedInUser=u;
    			u.login();
    			return;
    		}
    	}
    	System.out.println("Error: Invalid username or password");
    }

    public void logout()
    {
        if (loggedInUser != null) 
        {
            loggedInUser.logout();
            loggedInUser = null;
        } 
        else 
        {
            System.out.println("No user is logged in.");
        }
    }

    public User getLoggedInUser() 
    {
        return loggedInUser;
    }

}
