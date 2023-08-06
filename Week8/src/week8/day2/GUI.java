package week8.day2;

public class GUI {
	public static void main(String []args) {
		JDBC jdbc = new JDBC();
		boolean result = jdbc.insert(10, "Rajesh Rai");
		if(result==true) {
			System.out.println("Insert record successfully");
		}
		else {
			System.out.println("Error to insert record");
		}
	}
}
