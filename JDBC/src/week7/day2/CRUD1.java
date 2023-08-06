package week7.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUD1 {
	public static void main(String[] args) {
		//Connect with database
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/level4c","root", "");//Connect with database
			//Insert
			/*
			String sql = "INSERT INTO tbl_persons(pid, name) VALUES(?, ?)";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, 6);
			pstat.setString(2, "Rahul");
			pstat.executeUpdate();//save
			pstat.close();
			*/
			
			//Select
			/*
			String sql = "SELECT * FROM tbl_persons";
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+","
									+rs.getString("name"));
			}
			pstat.close();
			*/
			
			//Update
			/*
			String sql="UPDATE tbl_persons SET name=? WHERE pid=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, "New Name");
			pstat.setInt(2, 5);
			pstat.executeUpdate();
			pstat.close();
			*/
			
			//Delete
			String sql="DELETE FROM tbl_persons WHERE pid=?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, 5);
			pstat.executeUpdate();
			pstat.close();
			
			conn.close();//Close Connection
			System.out.println("Record inserted");
		}
		catch(Exception ex) {
			System.out.println("Error: "+ex.getMessage());
		}

	}

}
