package day1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Lib.Class2;
import Lib.MyLibrary2;

public class MyWindow3 implements ActionListener {
    JFrame frame; // declare
    JLabel lblNum1;
    JLabel lblNum2;
    JLabel lblNum3;
    JTextField txtNum1;
    JTextField txtNum2;
    JTextField txtNum3;
    JButton btnAdd, b;

    public MyWindow3() {
        frame = new JFrame(); // initializes
        lblNum1 = new JLabel();
        lblNum2 = new JLabel();
        lblNum3 = new JLabel();
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        txtNum3 = new JTextField();
        btnAdd = new JButton();
        b = new JButton();

        frame.setSize(600, 600);
        frame.setTitle("MyWindow3");
        frame.setResizable(false);
        frame.setLayout(null);

        lblNum1.setText("Number1 : ");
        lblNum1.setBounds(20, 20, 70, 40);

        txtNum1.setText("");
        txtNum1.setBounds(100, 20, 100, 40);

        lblNum2.setText("Number2 : ");
        lblNum2.setBounds(20, 75, 70, 40);

        txtNum2.setText("");
        txtNum2.setBounds(100, 75, 100, 40);

        btnAdd.setText("ADD");
        btnAdd.setBounds(100, 125, 70, 40);

        lblNum3.setText("Result");
        lblNum3.setBounds(20, 175, 70, 40);
        b.setText("close");
        b.setBounds(20, 250, 70, 40);

        txtNum3.setText("");
        txtNum3.setBounds(100, 175, 100, 40);
        btnAdd.addActionListener(this);
        b.addActionListener(this);

        frame.add(lblNum1);
        frame.add(lblNum2);
        frame.add(lblNum3);
        frame.add(txtNum1);
        frame.add(txtNum2);
        frame.add(txtNum3);
        frame.add(btnAdd);
        frame.add(b);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnAdd) {
            String tmp1 = txtNum1.getText();
            String tmp2 = txtNum2.getText();
            int tmpNum1 = Integer.parseInt(tmp1);
            int tmpNum2 = Integer.parseInt(tmp2);
            Class2 obj1 = new Class2();
            obj1.setNum1(tmpNum1);
            obj1.setNum2(tmpNum2);
            obj1.sum();
            txtNum3.setText(obj1.toString());
            MyLibrary2 lib1 = new MyLibrary2();
            lib1.receiveValue(obj1);
        }
        if (ae.getSource() == b) {
            MyWindow3.dispose();
        }
    }

    public static void main(String[] args) {
        new MyWindow3();
    }
}