package week9.day1.controllers;

import week9.day1.models.User;

public class ManageUser {
	//receive
	private User user;
	public ManageUser() {
		this.user=new User();
	}
	
	public ManageUser(User user) {
		this.user=user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	//process
	public void login() {
		this.user = new JDBC().login(this.user);
	}
	//send
}
