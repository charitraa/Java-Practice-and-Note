package week7.day0.fileio;

import java.io.BufferedReader;
//BufferedWriter
//InputStreamReader
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadWrite2 {

	public ReadWrite2() {
		//write();
		//read();
		write2();
		read2();
	}

	public void write() {
		try {
			FileWriter writer = new FileWriter("MyFile2.txt", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("Hello World");
			bufferedWriter.close();
			System.out.println("Write contents on file successfully");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void write2() {
		try {
			FileOutputStream outputStream = new FileOutputStream("MyFile2.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);            
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello World");             
            bufferedWriter.close();
			System.out.println("Write contents on file successfully");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void read() {
		try {
			FileInputStream inputStream = new FileInputStream("MyFile2.txt");
			InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8"); // "UTF-16"
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.println((char) ch);
			}
			reader.close();
			System.out.println("Read contents from file successfully");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void read2() {
		try {
			FileReader reader = new FileReader("MyFile2.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			System.out.println("Read contents from file successfully");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public static void main(String[] args) {
		new ReadWrite2();
	}
}