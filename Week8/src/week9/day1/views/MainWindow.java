package week9.day1.views;

import javax.swing.JFrame;

import week9.day1.models.User;

public class MainWindow extends JFrame{
	
	public MainWindow(User user) {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("Welcome : "+user.getUserName());
		setResizable(false);
		setVisible(true);
	}
}
