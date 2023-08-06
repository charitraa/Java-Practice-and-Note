package week7.day0.fileio;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWrite1 {

	public ReadWrite1() {
		write();
		read();		
	}

	public void write() {
		try {
			FileWriter writer = new FileWriter("MyFile1.txt", true);
			writer.write("Hello World");
			writer.close();			
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void read() {
		try {
			FileReader reader = new FileReader("MyFile1.txt");
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.println((char) ch);
			}
			reader.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		new ReadWrite1();
	}
}