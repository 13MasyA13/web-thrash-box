package ua.khpi.golik.service;

public class LoginService {
	
	public boolean authenticate(String userId, String userPassword) {
		if(userPassword == null || userPassword.trim().equals("")) {
			return false;
		}
		else {
			return true;
		}
	}
}
