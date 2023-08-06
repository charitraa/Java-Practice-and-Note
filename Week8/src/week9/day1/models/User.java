package week9.day1.models;

public class User {
	private int uid;
	private String userName;
	private String userPass;
	private boolean isUser;
	
	public User() {
		this.uid = 0;
		this.userName = "";
		this.userPass = "";
		this.isUser = false;
	}
	
	public User(int uid, String userName, String userPass, boolean isUser) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.userPass = userPass;
		this.isUser = isUser;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public boolean isUser() {
		return isUser;
	}

	public void setIsUser(boolean isUser) {
		this.isUser = isUser;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", userPass=" + userPass + ", isUser=" + isUser + "]";
	}
}
