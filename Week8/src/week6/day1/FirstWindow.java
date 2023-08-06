package week6.day1;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener; //Listen all events
import java.awt.event.ActionEvent; //Specific event

public class FirstWindow implements ActionListener{ //Listen all events
	final int WIDHT = 300;
	final int HEIGHT = 250;
	JFrame firstWindow = new JFrame();
	JButton btnClose = new JButton();
	
	public FirstWindow(){//Default Constructor
		firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		firstWindow.setSize(WIDHT, HEIGHT);
		firstWindow.setLayout(null);
		
		btnClose.setText("Close");
		btnClose.addActionListener(this); //Register the event -> actionPerformed()
		btnClose.setBounds(20, 20, 100, 30);
		firstWindow.add(btnClose);
		firstWindow.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FirstWindow(); //Create an Pseudo Object
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnClose) {
			//what to do?
			//Close the window - Dispose
			firstWindow.dispose();
		}
	}
}