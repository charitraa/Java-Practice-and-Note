package week7.day0.fileio;

import java.io.File;

public class FileHandle {

	public FileHandle() {
		try {
			//createFile();
			//renameFile();
			deleteFile();
			
		}
		catch(Exception ex) {
			System.out.println("Error : "+ ex.getMessage());
		}
	}

	public void createFile() {
		try {
			String FILE_NAME = "C:\\Users\\Dell\\OneDrive - Lord Buddha Education Foundation\\Desktop\\Test\\data1.txt";
			File file1 = new File(FILE_NAME);
			if (file1.exists()) {
				System.out.println("File already exists");
			} else {
				file1.createNewFile();
				System.out.println("New file create successfully");
			}
		} catch (Exception ex) {
			System.out.println("Error : "+ ex.getMessage());
		}
	}

	public void renameFile() {
		try {
			String FILE_NAME = "C:\\Users\\Dell\\OneDrive - Lord Buddha Education Foundation\\Desktop\\Test\\data1.txt";
			String NEW_FILE_NAME = "C:\\Users\\Dell\\OneDrive - Lord Buddha Education Foundation\\Desktop\\Test\\data2.txt";
			File file1 = new File(FILE_NAME);
			File file2;
			
			if (file1 .exists()) {
				file2=new File(NEW_FILE_NAME);
				file1.renameTo(file2);
				System.out.println("Rename file successfully");
			} else {
				file1=new File(NEW_FILE_NAME);
				file1.createNewFile();
				System.out.println("New file create successfully");
			}
		} catch (Exception ex) {
			System.out.println("Error : "+ ex.getMessage());
		}
	}
	
	public void deleteFile() {
		try {
			String FILE_NAME = "data2.txt";			
			File file1 = new File(FILE_NAME);
						
			if (file1 .exists()) {				
				file1.delete();
				System.out.println("Delete file successfully");
			} else {				
				file1.createNewFile();
				System.out.println("New file create successfully");
			}
		} catch (Exception ex) {
			System.out.println("Error : "+ ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new FileHandle();

	}
}
