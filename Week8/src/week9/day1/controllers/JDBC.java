package week9.day1.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import week9.day1.models.User;

public class JDBC {
	//io in database
	public User login(User user) {
		String sql = "SELECT * FROM tbl_users WHERE user_name = ? AND user_pass=?";
		try {
			//connect
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/level4c", "root","");
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setString(1, user.getUserName());
			pstat.setString(2, user.getUserPass());
			//run sql statement
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				user.setUid(rs.getInt("uid"));
				user.setIsUser(true);
			}
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return user;
	}
}
