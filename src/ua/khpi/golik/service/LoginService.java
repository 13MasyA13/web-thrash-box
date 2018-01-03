package ua.khpi.golik.service;

import java.util.HashMap;

public class LoginService {
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService() {
		users.put("johndoe", "John Doe");
		users.put("derickwinston", "Derick Winston");
		users.put("sarahjohnson", "Sarah Johnson");
	}
	
	public boolean authenticate(String userId, String userPassword) {
		if(userPassword == null || userPassword.trim().equals("")) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
