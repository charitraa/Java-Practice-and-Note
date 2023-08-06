package week7.day0.mdi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MDI1 extends JFrame implements ActionListener {
	JMenu menu1;
	JMenuBar menubar1;
	JMenuItem menuItem1;
	JDesktopPane desktopPane;

	public MDI1() {
		this.setTitle("MDI Window Example");
		this.setExtendedState(this.MAXIMIZED_BOTH);

		menubar1 = new JMenuBar();
		menu1 = new JMenu("Student");
		menuItem1 = new JMenuItem("New Student");
		menuItem1.addActionListener(this);

		menu1.add(menuItem1);
		menubar1.add(menu1);
		desktopPane = new JDesktopPane();

		this.add(menubar1, BorderLayout.NORTH);
		this.add(desktopPane, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MDI1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItem1) {
			NewWindow newWindow = new NewWindow();
			desktopPane.add(newWindow);
		}
	}
}