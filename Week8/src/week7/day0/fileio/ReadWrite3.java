package week7.day0.fileio;

import java.io.BufferedReader;
//BufferedWriter
//InputStreamReader
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class ReadWrite3 {

	public ReadWrite3() {
		write();
		read();	
	}

	public void write() {
		try {
			Person p1 = new Person(1, "Raj Rai");			
			FileOutputStream fileOutputStream= new FileOutputStream("MyFile3.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(p1);
			objectOutputStream.close();            
			System.out.println("Write object on file successfully");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}		

	public void read() {
		try {	
			FileInputStream fileInputStream= new FileInputStream("MyFile3.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Person p1 = (Person) objectInputStream.readObject();
			System.out.println(p1);
			objectInputStream.close();            			
			System.out.println("Read object from file successfully");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new ReadWrite3();
	}
}