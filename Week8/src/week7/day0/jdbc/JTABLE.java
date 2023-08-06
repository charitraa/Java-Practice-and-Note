package week7.day0.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTABLE extends JFrame{
	
	String[] columnNames = {"PID", "Name"};
	JTable table1;
	DefaultTableModel tableModel;
	JScrollPane scroll;
	
	public JTABLE() {
		this.setTitle("Table Demo");
		this.setSize(450, 350);
		this.setResizable(false);
		
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(columnNames);
		table1=new JTable();
		table1.setModel(tableModel); 
		table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table1.setFillsViewportHeight(true);
		scroll = new JScrollPane(table1);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/level4c","root","");
			String sql = "SELECT * FROM tbl_persons";
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				int pid=rs.getInt("pid");
				String name=rs.getString("name");
				tableModel.addRow(new Object[]{pid, name});
			}
			rs.close();
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}		
		this.add(scroll);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTABLE();
	}
}