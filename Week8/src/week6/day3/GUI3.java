package week6.day3;
import javax.swing.*;
import java.awt.event.*;

public class GUI3 extends JFrame implements ActionListener{
	JTextField txt1;
	JButton btn1, btn2, btn3;
	
	public GUI3() {
		this.setTitle("Demo-1");
		this.setSize(350, 350); //Pixel
		this.setResizable(false);
		
		txt1 =  new JTextField();
		txt1.setText("0");
		txt1.setBounds(20, 20, 50, 20);
		
		btn1 = new JButton();
		btn1.setText("++");
		btn1.setBounds(20, 50, 70, 30);
		btn1.addActionListener(this);
		
		btn2 = new JButton();
		btn2.setText("--");
		btn2.setBounds(80, 50, 70, 30);
		btn2.addActionListener(this);
		
		btn3 = new JButton();
		btn3.setText("CLOSE");
		btn3.setBounds(20, 80, 100, 30);
		btn3.addActionListener(this);
		
		this.setLayout(null);
		
		this.add(txt1);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btn1) {//increment
			/*
			//read value of txt1 -> string
			String tmp1 = this.txt1.getText();
			//convert to int
			int num1 = Integer.parseInt(tmp1);
			//increase value by 1
			num1+=1; //num1++;
			//convert int to string
			tmp1 = Integer.toString(num1);
			//update the value of txt1
			this.txt1.setText(tmp1);
			*/
			
			//Read value from num1
			System.out.println(++Class1.num1);
			this.txt1.setText(Class1.num1+"");
			
		}
		else if(ae.getSource()==btn2) {//decrement
			//read value of txt1 -> string
			String tmp1 = this.txt1.getText();
			//convert to int
			int num1 = Integer.parseInt(tmp1);
			//decrease value by 1
			num1-=1; //num1--;
			//convert int to string
			tmp1 = Integer.toString(num1);
			//update the value of txt1
			this.txt1.setText(tmp1);
		}
		else if(ae.getSource()==btn3) {//close
			this.dispose();//exit
		}
	}
	
	public static void main(String[] args) {
		new GUI3();

	}
}
