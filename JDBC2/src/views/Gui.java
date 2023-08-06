package views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controllers.ManageStudent;
import models.Student;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener{
	JLabel lblsid, lblname, lblcourse;
	JTextField txtsid, txtname, txtcourse;
	JButton btnsave, btnclose;
	
	
	
	public Gui() {
		
		setTitle("Manage Student");
		setSize(275,300);
		setResizable(false);
		
		lblsid = new JLabel("SID: ");
		lblname = new JLabel("NAME: ");
		lblcourse = new JLabel("COURSE: ");
		
		txtsid = new JTextField();
		txtname = new JTextField();
		txtcourse = new JTextField();
		
		btnsave = new JButton("SAVE");
		btnclose = new JButton("CLOSE");
		setLayout(new GridLayout(4,2));
		add(lblsid);add(txtsid);
		add(lblname);add(txtname);
		add(lblcourse);add(txtcourse);
		add(btnsave); add(btnclose);
		btnsave.addActionListener(this);
		btnclose.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()==btnsave) {
			int sid = Integer.parseInt(txtsid.getText());
			String name = txtname.getText();
			String course = txtcourse.getText();
			Student s1 = new Student(sid, name, course);		
			ManageStudent std  = new ManageStudent();
			boolean result = std.save(s1);
			if(result == true) {
				JOptionPane.showMessageDialog(this,"save");
				txtsid.setText("");
				txtname.setText("");
				txtcourse.setText("");
			}
			else {
				JOptionPane.showMessageDialog(this, "Error to save record");
			}
		}
		if(e.getSource()==btnclose) {
			this.dispose();
		}
		
	}
	
	public static void main (String[]args){
		new Gui();
	}
	

}
