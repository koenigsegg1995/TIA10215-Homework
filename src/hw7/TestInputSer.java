package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestInputSer {

	public static void main(String[] args) {
		File ser = new File("C:\\TIA102_Workspace\\TIA10215-Homework\\Data\\Object.ser");
		
		try {
			FileInputStream fis  = new FileInputStream(ser);
			ObjectInputStream input = new ObjectInputStream(fis);
			try {
				while(true) {
					Object obj = input.readObject();
					((Animal)obj).speak();
				}
			}
			catch(EOFException e) {
				input.close();
				fis.close();
			}
		}
		catch(IOException e) {
			System.out.println("找不到檔案");
		}
		catch(ClassNotFoundException e) {
			System.out.println("找不到輸出原始檔案");
		}
	}
	
}
