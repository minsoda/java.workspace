package project.controller;

import java.util.HashMap;

import project.model.User;

public class UserController {

	private HashMap<String, User> map = new HashMap<>();
	
	public boolean joinUser(String id, User u) {
		if(!map.containsKey(id)) {
			map.put(id, u);
			return true;
		}
		
		return false;
	}
	
	
	public String login(String id, String password) {
		
		if(map.containsKey(id) && map.get(id).getPassword().equals(password)) {
			return map.get(id).getName();
		}
		
		return null;
	}

	
	public boolean changePassword(String id, String oldpw, String newPw) {
		if(map.containsKey(id) && map.get(id).getPassword().equals(oldpw)) {
			return true;
		}
		return false;
	}
	
	}

