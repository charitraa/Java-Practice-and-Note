package Week6Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

    public static void main(String[] args) {
        new login();
    }

}

class login implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JTextField text1 = new JTextField();
    JPasswordField text2 = new JPasswordField();

    public login() {
        frame.setSize(500, 600);
        frame.setTitle("LOGIN PAGE");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        label1.setText("Username");
        label1.setBounds(50, 50, 100, 60);
        text1.setBounds(115, 65, 100, 30);
        label2.setText("Password");
        label2.setBounds(50, 100, 100, 60);
        text2.setBounds(115, 115, 100, 30);
        button1.setText("LOGIN");
        button1.setBounds(120, 160, 80, 30);
        button2.setText("Close");
        button2.setBounds(150, 160, 80, 30);

        button1.addActionListener(this);
        button2.addActionListener(this);
        frame.add(label1);
        frame.add(text1);
        frame.add(text2);
        frame.add(label2);
        frame.add(button1);
        frame.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String uname;
            String pass;
            uname = text1.getText();
            pass = text2.getText();

            if (uname.equals("admin") && pass.equals("admin")) {
                Menu me = new Menu();
                me.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(frame, "invalid username or password");
            }
        }

        if (e.getSource() == button2) {
            System.exit(0);

        }
    }

    private static void dispose() {
        login.dispose();
    }

}
