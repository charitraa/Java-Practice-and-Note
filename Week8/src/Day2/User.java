package Day2;

public class User {
	private int uid;
	private String userName;
	private String userPass;
	private Boolean isUser ;
	public User() {

		this.uid = 0;
		this.userName = "";
		this.userPass = "";
		this.isUser = false;
	}
	public User(int uid, String userName, String userPass, Boolean isUser) {
		
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
	
	
	public Boolean getIsUser() {
		return isUser;
	}
	public void setIsUser(Boolean isUser) {
		this.isUser = isUser;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", userPass=" + userPass + ", isUser=" + isUser + "]";
	}

}
