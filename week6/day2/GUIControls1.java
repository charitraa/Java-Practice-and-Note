package week6.day2;
import javax.swing.*;
import java.awt.event.*;

public class GUIControls1 implements ActionListener{
	JFrame frame;
	JLabel label1;
	JTextField txt1;
	JTextArea txt2;
	JPasswordField txt3;
	JRadioButton rb1, rb2;
	JCheckBox chk1, chk2;
	JComboBox cmb1;
	JButton btn1;
	
	public GUIControls1(){
		frame = new JFrame();
		
		JLabel label1 = new JLabel();
		label1.setText("ID : ");
		label1.setBounds(10, 10, 50, 30);
		
		txt1=new JTextField();
		txt1.setBounds(10, 50, 50, 30);
		
		txt2 = new JTextArea();
		txt2.setBounds(10, 90, 150, 100);
		
		txt3=new JPasswordField();
		txt3.setBounds(10, 200, 50, 30);
		
		rb1=new JRadioButton();
		rb2=new JRadioButton();
		rb1.setText("Male");
		rb2.setText("Female");
		rb1.setBounds(10, 240, 150, 30);
		rb2.setBounds(10, 280, 150, 30);
		
		chk1 = new JCheckBox();
		chk2 = new JCheckBox();
		chk1.setText("Reading");
		chk2.setText("Playing");
		chk1.setBounds(10, 330, 150, 30);
		chk2.setBounds(10, 370, 150, 30);
		
		cmb1=new JComboBox<>();
		cmb1.setBounds(10, 420, 150, 30);
		
		btn1 = new JButton();
		btn1.setText("Close");
		btn1.setBounds(10, 460, 150, 30);
		btn1.addActionListener(this);
		
		frame.setSize(250, 600);//width, height
		frame.setTitle("Basic Controls");
		frame.setResizable(false);
		frame.setLayout(null);
		
		frame.add(label1);//which layout
		frame.add(txt1);
		frame.add(txt2);
		frame.add(txt3);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(cmb1);
		frame.add(btn1);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btn1) {
			frame.dispose();
		}
	}
	
	public static void main(String[] args) {
		new GUIControls1();
	}

}
