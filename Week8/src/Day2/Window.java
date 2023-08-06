package Day2;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Window extends JFrame{
	JTextField txtUser;
	JPasswordField txtPass;
	JButton btnLogin;
	JLabel l1 , l2 ;
	public Window() {
		
		setTitle("Login Window");
		setSize(300, 200);
		setResizable(false);
		setLayout(null);
		l1 = new JLabel();
		l1.setText("Username:");
		l1.setBounds( 20 ,20 , 100 , 50);
		txtUser = new JTextField();
		txtUser.setBounds(100, 30, 100, 30);
		l2 = new JLabel();
		l2.setText("Password:");
		l2.setBounds( 20 ,55 , 100 , 50);
		txtPass = new JPasswordField();
		txtPass.setBounds(100, 65, 100, 30);
		
		btnLogin=new JButton();
		
		btnLogin.setBounds(100, 100, 100, 30);
		btnLogin.setText("Login");
		
		add(txtUser);
		add(txtPass);
		add(btnLogin);
		add(l1);
		add(l2);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Window(); //call constructor

	}

}
