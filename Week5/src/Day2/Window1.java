package Day2;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

public class Window1 extends JFrame implements ActionListener {
    JLabel l1 = new JLabel();

    JLabel l2 = new JLabel();

    JTextField t1 = new JTextField();

    JTextField t2 = new JPasswordField();

    JButton b1 = new JButton();

    JButton b2 = new JButton();

    public Window1() {

        this.setSize(350, 300);

        this.setTitle("Login page");

        l1.setText("User");

        l1.setBounds(20, 20, 100, 30);

        l2.setText("Pass");

        l2.setBounds(20, 80, 100, 30);

        t1.setBounds(80, 20, 100, 30);

        t2.setBounds(80, 80, 100, 30);

        b1.setText("Login");

        b1.setBounds(100, 150, 100, 30);

        b1.addActionListener(this);

        b2.setText("Close");

        b2.setBounds(210, 150, 100, 30);

        b2.addActionListener(this);

        this.setLayout(null);

        this.add(l1);

        this.add(l2);

        this.add(t1);

        this.add(t2);

        this.add(b1);

        this.add(b2);

        this.setVisible(true);

    }

    public static void main(String[] args) {

        new Window1();

    }

    @Override

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b2) {
            this.dispose();
        }
        // for login pages
        if (ae.getSource() == b1) {
            String user = t1.getText();
            String password = t2.getText();
            if (user.equals("sparsha") && password.equals("sparsha")) {
                JOptionPane.showMessageDialog(this, "Login Successfully");

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username and Password");
            }
        }
    }

}