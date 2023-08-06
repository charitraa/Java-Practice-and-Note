package week6.day2;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIControls2 implements ActionListener{
	JFrame frame;
	JMenuBar menubar1;
	JMenu menu1;
	JMenuItem menuItem1;
	
	public GUIControls2() {
		frame=new JFrame();
		frame.setSize(450, 300);//width, height
		frame.setTitle("Basic Controls");
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		
		menubar1=new JMenuBar();
		menu1 = new JMenu();
		menu1.setText("File");
		menuItem1=new JMenuItem();
		menuItem1.setText("Exit");
		menu1.add(menuItem1);
		menuItem1.addActionListener(this);
		
		menubar1.add(menu1);
		
		frame.add(menubar1);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		new GUIControls2();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menuItem1) {
			frame.dispose();//exit
		}
	}
}
