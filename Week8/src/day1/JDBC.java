package day1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
	public boolean insert(int pid, String name) {
		boolean result=false;
		//sql statement for inserting the data
		String sql= "INSERT INTO tbl_persons VALUES(?,?);";
		try {
			//connect
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/level4c","root","");
			//prepared statement
			PreparedStatement pstat  =conn.prepareStatement(sql);
			//set values
			pstat.setInt(1,pid);
			pstat.setString(2,name);
			//execute sql
			pstat.executeUpdate();
			//close all
			pstat.close();
			conn.close();
			result=true;
		}
		catch(Exception ex) {
			//error message
			System.out.println("Error :"+ex.getMessage());
			result=false;
		}
		return result;//return result
	}
	public boolean update(String name,int pid) {
		boolean result=false;
		//sql statement for updating the data
		String sql= "UPDATE tbl_persons SET name=? WHERE pid=?";
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/level4c","root","");
			PreparedStatement pstat  =conn.prepareStatement(sql);
			//set values
			pstat.setString(1,name);
			pstat.setInt(2,pid);
			//execute sql
			pstat.executeUpdate();
			//close all
			pstat.close();
			conn.close();
			result=true;
			
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
			result=false;
		}
		return result;
	}
	public void all() {
		
		String sql= "Select * from tbl_persons;";
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/level4c","root","");
			PreparedStatement pstat  =conn.prepareStatement(sql);
			ResultSet rs= pstat.executeQuery();
			System.out.print("pid"+"  ");
			System.out.println("name");
			while(rs.next()) {
				System.out.print(rs.getInt("pid")+"  ");
				
				System.out.println(rs.getString("name"));
			}
			pstat.close();
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
			
		}
	}
	public void search(int pid) {
		String sql = "SELECT pid , name FROM tbl_persons WHERE pid=?";
		try {

			//connect

			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/level4c","root","");

			//prepare statement

			PreparedStatement pstat= conn.prepareStatement(sql);
			pstat.setInt(1,pid );
			ResultSet rs= pstat.executeQuery();

			while (rs.next()) {

			System.out.println(rs.getInt("pid")+ ","+ rs.getString("name"));

			}

			//close all
		

			pstat.close();

			}

			catch(Exception ex) {

			System.out.println("Error:"+ ex.getMessage());//error message

			

			}
		
	}
	public boolean delete(int pid) {
		boolean result=false;
		String sql= "DELETE FROM tbl_persons WHERE pid=?";
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/level4c","root","");
			PreparedStatement pstat  =conn.prepareStatement(sql);
			//set values
			pstat.setInt(1,pid);
			//execute sql
			pstat.executeUpdate();
			//close all
			pstat.close();
			conn.close();
			result=true;
			
		}
		catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
			result=false;
		}
		return result;
	}
}


