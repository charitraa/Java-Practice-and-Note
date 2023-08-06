package week3.day2;
import javax.swing.JFrame; //Window
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWindow2 {

	public static void main(String[] args) {
		JFrame frame= new JFrame(); //declare and initialize
		JLabel lblNum1 = new JLabel();
		JTextField txtNum1 = new JTextField();
		
		frame.setTitle("My 2nd Window"); //call setter
		frame.setSize(300, 250); // width, height
		frame.setLayout(null);
		
		lblNum1.setText("Enter number1 : ");
		lblNum1.setBounds(20, 20, 150, 50);
		
		txtNum1.setColumns(20);
		txtNum1.setBounds(170, 20, 100, 30);
		
		frame.add(lblNum1);
		frame.add(txtNum1);
		frame.setVisible(true); //call setter
	}
}
