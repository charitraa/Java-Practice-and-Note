package week8.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC {
	public boolean insert(int pid, String name) {
		boolean result = false;
		//sql statement
		String sql = "INSERT INTO tbl_persons VALUES(?, ?);";
		try {
			//connect
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/level4c","root", "");
			//prepared statement
			PreparedStatement pstat = conn.prepareStatement(sql);
			//set values
			pstat.setInt(1, pid);
			pstat.setString(2, name);
			//execute sql statement
			pstat.executeUpdate(); //insert record
			//close all
			pstat.close();
			conn.close();
			result=true;
		} catch (Exception ex) {
			//error message
			System.out.println("Error : "+ex.getMessage());
			result = false;
		}
		return result;//return result
	}

	public boolean update(int pid, String name) {
		try {

		} catch (Exception ex) {

		}
		return false;
	}

	public void all() {
		try {

		} catch (Exception ex) {

		}
	}

	public void search(int pid) {
		try {

		} catch (Exception ex) {

		}
	}

	public boolean delete(int pid) {
		try {

		} catch (Exception ex) {

		}
		return false;
	}
}
