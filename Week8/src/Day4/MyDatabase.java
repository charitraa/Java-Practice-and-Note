package Day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MyDatabase {
	public ArrayList getAges() {
		String sql = "Select * from tbl_agegroups";
		ArrayList ages = new ArrayList();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/level4c", "root","");
			
			
			PreparedStatement pstat = con.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery()	;	
			while (rs.next()) {
				String ag = rs.getString("age");
				ages.add(ag);
			}
			rs.close();
			pstat.close();
			con.close();
			}
		catch (Exception ex) {
			System.out.println("Error" +ex.getMessage());
		}
		return ages;
	}
}
