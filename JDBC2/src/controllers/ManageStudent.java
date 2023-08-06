package controllers;

import java.sql.*;

import models.Student;

public class ManageStudent {
	public boolean save (Student student) {
		boolean result = false;
	
		try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root"," ");
				String sql = "INSERT INTO tbl_students VALUES(?, ?, ?)";
				PreparedStatement pstat = conn.prepareStatement(sql);
				pstat.setInt(1, student.getSid());
				pstat.setString(2, student.getName());
				pstat.setString(3, student.getCourse());
				pstat.executeUpdate();
				pstat.close();
				conn.close();
				result = true;
				
		}
		catch(Exception ex){
			System.out.println("Error: " +ex.getMessage());
		
		}
		return result;
		
	}

}
