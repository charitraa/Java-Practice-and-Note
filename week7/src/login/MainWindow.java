package login;
import javax.swing.JFrame;
public class MainWindow extends JFrame{
	
public MainWindow(User user) {
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	setTitle("Welcome : "+user.getUserName());
	setResizable(false);
	setVisible(true);
}
}
