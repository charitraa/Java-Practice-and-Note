import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentGUI {
    static final int INVALID = -1;
    JFrame frame;
    JPanel panel, panel1, panel2;
    JLabel NumOfModule, dayspres, numcrehrs, topic, enrollid, corsname, stdname, dob, doe, corsdurn, tutfee, numremmod,
            nomonthatten, Datedropout, enrollmentID, numofdayspresent, coursename;
    JTextField textField, textField1, textField2, textField3, textField4, textField5, textField6, textField7,
            textField8, textField9, textField10, textField11;
    JComboBox combobox, combobox1, combobox2, combobox3, combobox4, combobox5;
    Border border;
    JButton AddRegular, Presentper, grantcetr, paybills, Dropout, remove, display, clear, calculate, Back;

    public void show() {
        ArrayList<Student> students = new ArrayList<>();
        // making a new frame
        frame = new JFrame("Student management Form");
        frame.setSize(700, 820);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -----------------for panel-----------------

        panel = new JPanel();
        panel.setSize(630, 215);
        panel.setLocation(25, 30);
        panel.setBackground(Color.pink);
        frame.add(panel);

        panel1 = new JPanel();
        panel1.setSize(630, 200);
        panel1.setLocation(25, 275);
        panel1.setBackground(Color.pink);
        frame.add(panel1);

        panel2 = new JPanel();
        panel2.setSize(630, 200);
        panel2.setLocation(25, 505);
        panel2.setBackground(Color.pink);
        frame.add(panel2);

        border = BorderFactory.createLineBorder(Color.BLACK, 2, false);
        panel.setBorder(border);
        panel1.setBorder(border);
        panel2.setBorder(border);

        // -----------------------------Label and text
        // field---------------------------------

        topic = new JLabel("STUDENT");
        topic.setForeground(Color.BLACK);
        topic.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(topic);

        enrollid = new JLabel(" Enrollment ID");
        enrollid.setBounds(20, 30, 150, 25);
        panel.add(enrollid);
        textField = new JTextField();
        textField.setBounds(120, 31, 130, 25);
        panel.add(textField);

        corsname = new JLabel("Course name");
        corsname.setBounds(20, 70, 100, 25);
        panel.add(corsname);
        textField1 = new JTextField();
        textField1.setBounds(120, 71, 130, 25);
        panel.add(textField1);

        dob = new JLabel("DOB");
        dob.setBounds(21, 110, 100, 30);
        panel.add(dob);
        String array[] = { "YYYY", "1915", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                "2005",
                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
                "2019" };
        combobox = new JComboBox(array);
        combobox.setBounds(120, 111, 60, 30);
        panel.add(combobox);

        String array1[] = { "MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        combobox1 = new JComboBox(array1);
        combobox1.setBounds(190, 111, 50, 30);
        panel.add(combobox1);

        String array2[] = { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        combobox2 = new JComboBox(array2);
        combobox2.setBounds(250, 111, 50, 30);
        panel.add(combobox2);

        doe = new JLabel("Date of enrollment");
        doe.setBounds(20, 150, 150, 30);
        panel.add(doe);

        String array3[] = { "YYYY", "1915", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004",
                "2005",
                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
                "2019" };
        combobox3 = new JComboBox(array3);
        combobox3.setBounds(120, 151, 60, 30);
        panel.add(combobox3);

        String array4[] = { "MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        combobox4 = new JComboBox(array4);
        combobox4.setBounds(190, 151, 50, 30);
        panel.add(combobox4);

        String array5[] = { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        combobox5 = new JComboBox(array5);
        combobox5.setBounds(250, 151, 50, 30);
        panel.add(combobox5);

        stdname = new JLabel("Student name");
        stdname.setBounds(350, 30, 150, 25);
        panel.add(stdname);
        textField2 = new JTextField();
        textField2.setBounds(450, 30, 130, 25);
        panel.add(textField2);

        corsdurn = new JLabel("Course Duration");
        corsdurn.setBounds(350, 70, 100, 25);
        panel.add(corsdurn);
        textField3 = new JTextField();
        textField3.setBounds(450, 70, 130, 25);
        panel.add(textField3);

        tutfee = new JLabel("Tution Fee");
        tutfee.setBounds(350, 110, 100, 25);
        panel.add(tutfee);
        textField4 = new JTextField();
        textField4.setBounds(450, 110, 130, 25);
        panel.add(textField4);

        NumOfModule = new JLabel(" Number of Module");
        NumOfModule.setBounds(20, 30, 150, 25);
        panel1.add(NumOfModule);
        textField5 = new JTextField();
        textField5.setBounds(140, 31, 130, 25);
        panel1.add(textField5);

        dayspres = new JLabel(" Days present");
        dayspres.setBounds(20, 70, 150, 25);
        panel1.add(dayspres);
        textField6 = new JTextField();
        textField6.setBounds(140, 71, 130, 25);
        panel1.add(textField6);

        numcrehrs = new JLabel("Number of credit hours");
        numcrehrs.setBounds(330, 30, 150, 25);
        panel1.add(numcrehrs);
        textField7 = new JTextField();
        textField7.setBounds(480, 31, 130, 25);
        panel1.add(textField7);

        numremmod = new JLabel(" Number of Module Remaining Modules");
        numremmod.setBounds(20, 30, 240, 25);
        panel2.add(numremmod);
        textField8 = new JTextField();
        textField8.setBounds(260, 31, 130, 25);
        panel2.add(textField8);

        nomonthatten = new JLabel("Number of Months Attended");
        nomonthatten.setBounds(20, 70, 200, 25);
        panel2.add(nomonthatten);
        textField9 = new JTextField();
        textField9.setBounds(260, 71, 130, 25);
        panel2.add(textField9);

        Datedropout = new JLabel("Date of dropout");
        Datedropout.setBounds(20, 110, 150, 25);
        panel2.add(Datedropout);
        combobox3 = new JComboBox(array3);
        combobox3.setBounds(260, 111, 60, 30);
        panel2.add(combobox3);

        combobox4 = new JComboBox(array4);
        combobox4.setBounds(330, 111, 50, 30);
        panel2.add(combobox4);

        combobox5 = new JComboBox(array5);
        combobox5.setBounds(400, 111, 50, 30);
        panel2.add(combobox5);

        // -------------------------------------------------------------------buttons
        // for Regular------------------------------------

        AddRegular = new JButton("Regular");
        AddRegular.setBounds(60, 130, 100, 35);
        panel1.add(AddRegular);
        AddRegular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id3 = getNumOfModule();
                if (id3 == INVALID) {

                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of number of module in integers.",
                            "id file error", 0);
                    return;
                }

                int id4 = getNumOfCreditHours();
                if (id4 == INVALID) {

                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Number of credit hours in integers.",
                            "id file error", 0);
                    return;
                }

                int id5 = getDaysPresent();
                if (id5 == INVALID) {

                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Days present in integers.",
                            "id file error", 0);
                    return;
                }
            }
        });

        Presentper = new JButton("Present percentage");
        Presentper.setBounds(390, 90, 150, 35);
        panel1.add(Presentper);
        Presentper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // new
                                                         // frames---------------------------------------------------------------
                JFrame newframe = new JFrame();
                newframe.setSize(400, 290);
                newframe.setVisible(true);
                newframe.setLocation(250, 300);
                newframe.setResizable(false);
                newframe.setLayout(null);

                enrollmentID = new JLabel("Enrollment ID");
                enrollmentID.setBounds(50, 50, 100, 25);
                newframe.add(enrollmentID);
                textField10 = new JTextField();
                textField10.setBounds(200, 50, 100, 25);
                newframe.add(textField10);

                numofdayspresent = new JLabel("Number of days present");
                numofdayspresent.setBounds(50, 100, 150, 25);
                newframe.add(numofdayspresent);
                textField6 = new JTextField();
                textField6.setBounds(200, 100, 100, 25);
                newframe.add(textField6);

                calculate = new JButton("Calculate");
                calculate.setBounds(250, 170, 100, 35);
                newframe.add(calculate);
                calculate.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {

                        int id = getEnrollmentID();
                        if (id == INVALID) {
                            JOptionPane.showMessageDialog(null, "ID should only be positive", "id file error", 0);
                            return;
                        }

                        int id5 = getDaysPresent();
                        if (id5 == INVALID) {
                            JOptionPane.showMessageDialog(null, "ID should only be positive", "id file error", 0);
                            return;
                        }

                    }

                });
                Back.setBounds(5, 10, 70, 25);
                newframe.add(Back);
            }
        });

        grantcetr = new JButton(" Grant certificate");
        grantcetr.setBounds(390, 135, 150, 35);
        panel1.add(grantcetr);
        grantcetr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // new frames-------------------------------
                JFrame newframe = new JFrame();
                newframe.setSize(400, 330);
                newframe.setVisible(true);
                newframe.setLocation(250, 300);
                newframe.setResizable(false);
                newframe.setLayout(null);

                enrollmentID = new JLabel("Enrollment ID");
                enrollmentID.setBounds(50, 50, 100, 25);
                newframe.add(enrollmentID);
                textField = new JTextField();
                textField.setBounds(170, 50, 100, 25);
                newframe.add(textField);

                coursename = new JLabel("Course Name");
                coursename.setBounds(50, 100, 150, 25);
                newframe.add(coursename);
                textField1 = new JTextField();
                textField1.setBounds(170, 100, 100, 25);
                newframe.add(textField1);

                doe.setBounds(50, 150, 150, 25);
                newframe.add(doe);

                combobox3.setBounds(170, 150, 60, 25);
                newframe.add(combobox3);
                combobox4.setBounds(240, 150, 50, 25);
                newframe.add(combobox4);
                combobox5.setBounds(300, 150, 50, 25);
                newframe.add(combobox5);

                calculate = new JButton("Grant certificate");
                calculate.setBounds(220, 220, 130, 35);
                newframe.add(calculate);
                calculate.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {

                        int id = getEnrollmentID();
                        if (id == INVALID) {
                            JOptionPane.showMessageDialog(null, "ID should only be positive", "id file error", 0);
                            return;
                        }

                        String cname = getCourseName();
                        if (cname.equals("")) {
                            JOptionPane.showMessageDialog(null, "please! Enter your name.", "id file error", 0);
                            return;
                        }

                        String doe = getDateOfEnrollment();
                        if (doe == null) {
                            JOptionPane.showMessageDialog(null, "date of Enrollement is not selected",
                                    "Date field error", 0);// dialouge bbox open gar combobox ma selsect gar vako xaina
                            return;
                        }

                    }

                });

                Back.setBounds(5, 10, 70, 25);
                newframe.add(Back);

            }
        });
        // ---------------------------------------------button for drop
        // out---------------------------------------------------------------------

        Dropout = new JButton("Dropout");
        Dropout.setBounds(130, 150, 100, 35);
        panel2.add(Dropout);
        Dropout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (Student dropout : students) {
                    dropout.display();
                }
                int id6 = getNumOfRemainignModules();
                if (id6 == INVALID) {
                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Remaining module in integers",
                            "id file error", 0);
                    return;
                }

                int id7 = getNumOfMonthsAttended();
                if (id7 == INVALID) {
                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Months attendede in integers",
                            "id file error", 0);
                    return;
                }

                String dod = getDateOfDropout();
                if (dod == null) {
                    JOptionPane.showMessageDialog(null, "date of Dropout is not selected", "Date field error", 0);// dialouge
                                                                                                                  // bbox
                                                                                                                  // open
                                                                                                                  // gar
                                                                                                                  // combobox
                                                                                                                  // ma
                                                                                                                  // selsect
                                                                                                                  // gar
                                                                                                                  // vako
                                                                                                                  // xaina
                    return;
                }
            }

            // method for chrcking teh validity of unique enroolment id

            // public boolean checkEnrollmentIdUnique(int eid) {
            // for (Student obj : students) {
            // if (obj instanceof Regular) {
            // Regular r = (Regular) obj; // downcasting
            // if (r.getEnrollmentID() == eid) {
            // return true;
            // }
            // }
            // if (obj instanceof Dropout) {
            // Dropout d = (Dropout) obj; // downcasting
            // if (d.getEnrollmentID() == eid) {
            // return true;
            // }
            // }
            // }
            // return false; // Return false if enrollment ID is not found
            // }

            // // Assuming textField and combobox represent user input
            // int enrollmentID = Integer.parseInt(textField.getText()); // Convert
            // textField to an integer
            // boolean check = checkEnrollmentIdUnique(enrollmentID);

            // if (check) {
            // JOptionPane.showMessageDialog(this, "Please check enrollment ID");
            // return;
            // } else {
            // // Assuming combobox, combobox1, combobox2, combobox3, combobox4, and
            // combobox5 represent different parts of a string
            // String courseInfo = combobox.getSelectedItem() + combobox1.getSelectedItem()
            // + combobox2.getSelectedItem();
            // String attendanceInfo = combobox3.getSelectedItem() +
            // combobox4.getSelectedItem() + combobox5.getSelectedItem();

            // Dropout dropstd = new Dropout(enrollmentID, dob, studentName,
            // dateOfEnrollement, tutionFee, courseDuration, numOfRemainingModules,
            // dateOfDropout, numOfMonthsAttended);
            // students.add(dropstd);
            // }
        });
        paybills = new JButton("Pay of bill");
        paybills.setBounds(490, 90, 100, 35);
        panel2.add(paybills);
        paybills.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // new frames-----------------------------------
                JFrame newframe = new JFrame();
                newframe.setSize(340, 200);
                newframe.setVisible(true);
                newframe.setLocation(250, 300);
                newframe.setResizable(false);
                newframe.setLayout(null);

                enrollmentID = new JLabel("Enrollment ID");
                enrollmentID.setBounds(50, 50, 100, 25);
                newframe.add(enrollmentID);
                textField = new JTextField();
                textField.setBounds(150, 50, 100, 25);
                newframe.add(textField);

                calculate = new JButton("Pay the bills");
                calculate.setBounds(180, 100, 110, 30);
                newframe.add(calculate);
                calculate.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {

                        int id = getEnrollmentID();
                        if (id == INVALID) {
                            JOptionPane.showMessageDialog(null, "ID should only be positive", "id file error", 0);
                            return;
                        }

                    }

                });
                Back.setBounds(5, 10, 70, 25);
                newframe.add(Back);

            }
        });

        // --------------------------remove
        // button----------------------------------------------------------------
        remove = new JButton("Remove");
        remove.setBounds(490, 40, 100, 35);
        panel2.add(remove);
        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // new frames-------------------------------
                JFrame newframe = new JFrame();
                newframe.setSize(340, 200);
                newframe.setVisible(true);
                newframe.setLocation(250, 300);
                newframe.setResizable(false);
                newframe.setLayout(null);

                enrollmentID = new JLabel("Enrollment ID");
                enrollmentID.setBounds(50, 50, 100, 25);
                newframe.add(enrollmentID);
                textField = new JTextField();
                textField.setBounds(150, 50, 100, 25);
                newframe.add(textField);

                calculate = new JButton("Remove");
                calculate.setBounds(190, 100, 100, 30);
                newframe.add(calculate);
                calculate.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {

                        int id = getEnrollmentID();
                        if (id == INVALID) {
                            JOptionPane.showMessageDialog(null, "ID should only be positive", "id file error", 0);
                            return;
                        }

                    }

                });

                Back.setBounds(5, 10, 70, 25);
                newframe.add(Back);
            }

        });

        // ----------Action listener for dropout ,regular and display
        // button----------------------------------------------------------------
        ActionListener buttonActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int id = getEnrollmentID();
                if (id == INVALID) {

                    JOptionPane.showMessageDialog(null, "ID should only be positive", "id file error", 0);
                    return;
                }

                String sname = getStudentName();
                if (sname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Olease!Enter your name.", "name file error", 0);
                    return;
                }

                String cname = getCourseName();
                if (cname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please!Enter your course name", "name file error", 0);
                    return;
                }

                int id1 = getCourseDuration();
                if (id1 == INVALID) {

                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of course Duration in integers.",
                            "id file error", 0);
                    return;
                }

                String dob = getDateOfBirth();
                if (dob == null) {
                    JOptionPane.showMessageDialog(null, "date of birth is not selected.", "Date field error", 0);// dialouge
                                                                                                                 // bbox
                                                                                                                 // open
                                                                                                                 // gar
                                                                                                                 // combobox
                                                                                                                 // ma
                                                                                                                 // selsect
                                                                                                                 // gar
                                                                                                                 // vako
                                                                                                                 // xaina
                    return;
                }

                String doe = getDateOfEnrollment();
                if (doe == null) {
                    JOptionPane.showMessageDialog(null, "date of Enrollment is not selected", "Date field error", 0);// dialouge
                                                                                                                     // bbox
                                                                                                                     // open
                                                                                                                     // gar
                                                                                                                     // combobox
                                                                                                                     // ma
                                                                                                                     // selsect
                                                                                                                     // gar
                                                                                                                     // vako
                                                                                                                     // xaina
                    return;
                }

                int id2 = getTutionFee();
                if (id2 == INVALID) {
                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Tution fee in integers.",
                            "id file error", 0);
                    return;
                }

            }
        };

        // ----------------------------------------------------------------display
        // button----------------------------------------------------------------
        display = new JButton("Display");
        display.setBounds(120, 730, 100, 35);
        frame.add(display);
        display.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int id3 = getNumOfModule();
                if (id3 == INVALID) {

                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of number of module in integers.",
                            "id file error", 0);
                    return;
                }

                int id4 = getNumOfCreditHours();
                if (id4 == INVALID) {

                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Number of credit hours in integers.",
                            "id file error", 0);
                    return;
                }

                int id5 = getDaysPresent();
                if (id5 == INVALID) {

                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Days present in integers.",
                            "id file error", 0);
                    return;
                }

                int id6 = getNumOfRemainignModules();
                if (id6 == INVALID) {
                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Remaining module in integers",
                            "id file error", 0);
                    return;
                }

                int id7 = getNumOfMonthsAttended();
                if (id7 == INVALID) {
                    JOptionPane.showMessageDialog(null, "PLEASE!Enter value of Remaining module in integers",
                            "id file error", 0);
                    return;
                }

                String dod = getDateOfDropout();
                if (dod == null) {
                    JOptionPane.showMessageDialog(null, "date of Dropout is not selected", "Date field error", 0);// dialouge
                                                                                                                  // bbox
                                                                                                                  // open
                                                                                                                  // gar
                                                                                                                  // combobox
                                                                                                                  // ma
                                                                                                                  // selsect
                                                                                                                  // gar
                                                                                                                  // vako
                                                                                                                  // xaina
                    return;
                }

            }
        });
        display.addActionListener(buttonActionListener);
        Dropout.addActionListener(buttonActionListener);
        AddRegular.addActionListener(buttonActionListener);

        clear = new JButton("Clear");
        clear.setBounds(420, 730, 100, 35);
        frame.add(clear);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");
                textField11.setText("");
                combobox.setSelectedIndex(0);
                combobox1.setSelectedIndex(0);
                combobox2.setSelectedIndex(0);
                combobox3.setSelectedIndex(0);
                combobox4.setSelectedIndex(0);
                combobox5.setSelectedIndex(0);
            }

        });

        Back = new JButton("Back");

        panel1.setLayout(null);
        panel.setLayout(null);
        panel2.setLayout(null);
        frame.setVisible(true);
    }

    // getter method----------------------------------------------------------------

    public String getDateOfBirth() {
        String day = combobox2.getSelectedItem().toString();
        String month = combobox1.getSelectedItem().toString();
        String year = combobox.getSelectedItem().toString();
        String date = null;

        if (day.equals("DD") || month.equals("MM") || year.equals("YYYY")) {
            date = null;
        } else {
            date = (day + "/" + month + "/" + year);
        }
        return date;
    }

    // getter method for date of enrollment

    public String getDateOfEnrollment() {

        String day = combobox5.getSelectedItem().toString();
        String month = combobox4.getSelectedItem().toString();
        String year = combobox3.getSelectedItem().toString();
        String date = null;

        if (day.equals("DD") || month.equals("MM") || year.equals("YYYY")) {
            date = null;
        } else {
            date = (day + "/" + month + "/" + year);
        }
        return date;

    }

    // --------------------------------getter method for date of
    // dropout------------------------------------------------------
    public String getDateOfDropout() {

        String day = combobox5.getSelectedItem().toString();
        String month = combobox4.getSelectedItem().toString();
        String year = combobox3.getSelectedItem().toString();
        String date = null;

        if (day.equals("DD") || month.equals("MM") || year.equals("YYYY")) {
            date = null;
        } else {
            date = (day + "/" + month + "/" + year);
        }
        return date;
    }

    // ---------------------------------Getter method for enrollement
    // id--------------------
    public int getEnrollmentID() {
        int id = INVALID;
        String StringId = textField.getText().trim();// trim le d
        try {
            id = Integer.parseInt(StringId);
            if (id <= 0) {
                id = INVALID;
            }
        } catch (NumberFormatException nfe) {
            // later
        }
        return id;

    }

    // ----------------------------------------------------------------getter methid
    // for course
    // duration----------------------------------------------------------------

    public int getCourseDuration() {
        int id = INVALID;
        String StringId = textField3.getText().trim();// trim le d
        try {
            id = Integer.parseInt(StringId);
            if (id <= 0) {
                id = INVALID;
            }
        } catch (NumberFormatException nfe) {

        }
        return id;

    }

    // ----------------------------------------------------------------getter methid
    // for tution fee------------------------
    public int getTutionFee() {
        int id = INVALID;
        String StringId = textField4.getText().trim();// trim le d
        try {
            id = Integer.parseInt(StringId);
            if (id <= 0) {
                id = INVALID;
            }
        } catch (NumberFormatException nfe) {

        }
        return id;
    }

    // ----------------------------------------------------------------getter method
    // for number of
    // module----------------------------------------------------------------
    public int getNumOfModule() {
        int id = INVALID;
        String StringId = textField5.getText().trim();
        try {
            id = Integer.parseInt(StringId);
            if (id <= 0) {
                id = INVALID;
            }
        } catch (NumberFormatException nfe) {

        }
        return id;
    }

    // ----------------------------------------------------------------getter method
    // of numof credit hours----
    public int getNumOfCreditHours() {
        int id = INVALID;
        String StringId = textField7.getText().trim();
        try {
            id = Integer.parseInt(StringId);
            if (id <= 0) {
                id = INVALID;
            }
        } catch (NumberFormatException nfe) {

        }
        return id;
    }

    // ----------------------------------------------------------------getter method
    // for DAYS
    // present----------------------------------------------------------------
    public int getDaysPresent() {
        int id = INVALID;
        String StringId = textField6.getText().trim();
        try {
            id = Integer.parseInt(StringId);
            if (id <= 0) {
                id = INVALID;
            }
        } catch (NumberFormatException nfe) {

        }
        return id;
    }

    // ----------------------------------------------------------------getter method
    // of number of remainignmodue
    // ----------------------------------------------------------------
    public int getNumOfRemainignModules() {
        int id = INVALID;
        String StringId = textField8.getText().trim();
        try {
            id = Integer.parseInt(StringId);
            if (id <= 0) {
                id = INVALID;
            }
        } catch (NumberFormatException nfe) {

        }
        return id;

    }

    // ----------------------------------------------------------------getter method
    // of number of months
    // attended----------------------------------------------------------------
    public int getNumOfMonthsAttended() {

        int id = INVALID;
        String StringId = textField9.getText().trim();
        try {
            id = Integer.parseInt(StringId);
            if (id <= 0) {
                id = INVALID;
            }
        } catch (NumberFormatException nfe) {

        }
        return id;
    }

    // ----------------------------------------------------------------getter method
    // for student
    // name----------------------------------------------------------------
    public String getStudentName() {
        String name = textField2.getText().trim();
        return name;
    }

    // ----------------------------------------------------------------getter method
    // for Course
    // name----------------------------------------------------------------
    public String getCourseName() {
        String cname = textField1.getText().trim();
        return cname;
    }

    public static void main(String[] args) {
        StudentGUI cw = new StudentGUI();
        cw.show();
    }

}