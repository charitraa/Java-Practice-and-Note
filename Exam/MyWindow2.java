
package Day3;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow2 implements ActionListener {
    JFrame frame;
    JButton b1, b2;
    JLabel l1;
    JTextField t1;

    public MyWindow2() {
        frame = new JFrame();
        b1 = new JButton();
        b2 = new JButton();
        l1 = new JLabel();
        t1 = new JTextField();

        frame.setSize(350, 450);
        frame.setVisible(true);
        frame.setTitle("My Window2");
        l1.setText("Number1:");
        l1.setBounds(20, 20, 70, 40);
        frame.add(l1);
        t1.setText("<num1>");
        t1.setBounds(100, 20, 70, 40);
        frame.add(t1);
        b1.setText("send");
        b1.setBounds(20, 100, 70, 40);
        frame.add(b1);
        b1.addActionListener(this);

        b2.setText("Close");
        b2.setBounds(150, 160, 80, 30);
        b2.addActionListener(this);
        frame.add(b2);

        frame.setResizable(false);
        frame.setLayout(null);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            // System.out.println("click on b1");
            String temp = t1.getText();
            System.out.println(temp);
        }
        if (ae.getSource() == b2) {
            MyWindow2.dispose();
        }

    }

    public static void main(String[] args) {
        // System.out.println("hello world");
        new MyWindow2();
    }

}
