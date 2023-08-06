package week7.day0.fileio;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWrite0 {

	public ReadWrite0() {
		//write();
		//read();
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
			File file = new File("MyFile1.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		new ReadWrite0();
	}
}