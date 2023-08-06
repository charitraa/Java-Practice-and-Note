package week4.day4;
import javax.swing.JFrame; // Window
import javax.swing.JLabel; // Label
import javax.swing.JTextField; //TextBox
import javax.swing.JButton; //Button

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import mylib.Class1; //User Defined Data Type
import mylib.MyLibrary1; //Library

public class MyWindow2 implements ActionListener {
	JFrame frame; //declare
	JLabel lblNum1;
	JTextField txtNum1;
	JButton btnSend;
	
	public MyWindow2() {
		frame=new JFrame(); //initializes
		lblNum1=new JLabel();
		txtNum1=new JTextField();
		btnSend=new JButton();
		
		frame.setSize(350, 350);
		frame.setTitle("MyWindow2");
		frame.setResizable(false);
		frame.setLayout(null);
		
		lblNum1.setText("Number1 : ");
		lblNum1.setBounds(20, 20, 70, 40);
		
		txtNum1.setText("<num1>");
		txtNum1.setBounds(100, 20, 70, 40);
		
		btnSend.setText("SEND");
		btnSend.setBounds(20, 100, 70, 40);
		btnSend.addActionListener(this);
		
		frame.add(lblNum1);
		frame.add(txtNum1);
		frame.add(btnSend);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnSend) {
			String tmp = txtNum1.getText(); //read
			int tmpNum = Integer.parseInt(tmp);//type conversion
			Class1 obj1 = new Class1(); //object
			obj1.setNum1(tmpNum);//set
			MyLibrary1 lib1 = new MyLibrary1();//object
			lib1.receiveValue(obj1);//send
		}
	}
	
	public static void main(String[] args) {
		new MyWindow2();
	}
}
