package Week6Gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Menu extends JFrame {
    JMenuBar menu = new JMenuBar();
    JMenu menu1 = new JMenu();

    public Menu() {
        this.setSize(400, 500);
        this.setVisible(true);
        menu1.setText("Student");
        menu.add(menu1);

    }

    public static void main(String[] args) {
        new Menu();

    }
}
