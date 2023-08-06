package week7.day0.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

	public JDBC() {
		// connect();
		// insert();
		// select();
		// update();
		// select();
		delete();
	}

	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/level4c", "root", "");
			conn.close();
			System.out.println("Connect and Close database connection!");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void insert() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/level4c", "root", "");
			String strSql = "INSERT INTO tbl_persons(pid, name, address) VALUES(?, ?, ?)";
			PreparedStatement pstat = conn.prepareStatement(strSql);
			pstat.setInt(1, 2);
			pstat.setString(2, "Rajan Thapa");
			pstat.setString(3, "KTM");
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			System.out.println("Record inserted!");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void select() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/level4c", "root", "");
			String strSql = "SELECT * FROM tbl_persons";
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(strSql);
			while (rs.next()) {
				System.out.println(rs.getInt("pid") + ", " + rs.getString("name") + ", " + rs.getString("address"));
			}
			rs.close();
			stat.close();
			stat.close();
			conn.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void update() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/level4c", "root", "");
			String strSql = "UPDATE tbl_persons SET name=?, address=? WHERE pid=?";
			PreparedStatement pstat = conn.prepareStatement(strSql);
			pstat.setString(1, "New Name");
			pstat.setString(2, "New Address");
			pstat.setInt(3, 1);
			pstat.executeUpdate();
			conn.close();
			System.out.println("Record inserted!");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void delete() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/level4c", "root", "");
			String strSql = "DELETE FROM tbl_persons WHERE pid=?";
			PreparedStatement pstat = conn.prepareStatement(strSql);			
			pstat.setInt(1, 2);
			pstat.executeUpdate();
			conn.close();
			System.out.println("Record deleted!");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new JDBC();
	}
}