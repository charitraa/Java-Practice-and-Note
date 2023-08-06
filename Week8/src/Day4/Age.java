package Day4;

import java.util.ArrayList;

import javax.swing.*;

public class Age extends JFrame{
	JComboBox cmbAge;
	public Age(){
    this.setSize(250,150);
    this.setResizable(false);
    cmbAge= new JComboBox();
    cmbAge.setBounds(10, 10, 100, 30);
    ArrayList ages = new MyDatabase().getAges();
    cmbAge.addItem(ages);
    this.add(cmbAge);
    this.setLayout(null);
    this.setVisible(true);
	}

	public static void main(String[]args) {
		new Age();
	}
}
