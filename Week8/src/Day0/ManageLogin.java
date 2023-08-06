package Day0;


public class ManageLogin {
	
		private User user;
		public ManageLogin() {
			this.user=new User();
		}
		
		public ManageLogin(User user) {
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
			this.user = new LoginJDBC().login(this.user);
		}
}	

