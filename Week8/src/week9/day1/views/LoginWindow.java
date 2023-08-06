package week9.day1.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import week9.day1.controllers.ManageUser;
import week9.day1.models.User;

public class LoginWindow extends JFrame implements ActionListener {
	JTextField txtUser;
	JPasswordField txtPass;
	JButton btnLogin;
	
	public LoginWindow() {
		
		setTitle("Login Window");
		setSize(300, 200);
		setResizable(false);
		setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(50, 30, 100, 30);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(50, 65, 100, 30);
		
		btnLogin=new JButton();
		btnLogin.addActionListener(this);
		btnLogin.setBounds(50, 100, 100, 30);
		btnLogin.setText("Login");
		
		add(txtUser);
		add(txtPass);
		add(btnLogin);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new LoginWindow(); //call constructor

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin) {
			//do Login
			User user = new User();
			ManageUser userManager = new ManageUser();
			user.setUserName(txtUser.getText());
			user.setUserPass(txtPass.getText());
			userManager.setUser(user);
			userManager.login();
			user = userManager.getUser();
			if(user.getUid()>=1) {
				JOptionPane.showMessageDialog(this, "Welcome !");
				//display mainwindow
				MainWindow mainWindow = new MainWindow(user);
				
			}
			else {
				JOptionPane.showMessageDialog(this, "Error: user/password");
			}
			
		}
		
	}

}
