package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q1 {
	
	public static void main(String[] args) {
		File sample = new File("C:\\TIA102_Workspace\\TIA10215-Homework\\file\\sample.txt");
		try {
			FileReader input = new FileReader(sample);
			BufferedReader inputbr = new BufferedReader(input);
			
			long fileSize= sample.length();
			
			int charactor = 0;
			int line = 0;
			String str;
			while((str = inputbr.readLine()) != null) {
				charactor += (str).length() + 1;
				line++;
			}
			
			System.out.print("共有" + fileSize + "個位元組，" + charactor + "個字元，" + line + "列資料");
			inputbr.close();
			input.close();
		}
		catch(IOException e) {
			System.out.println("找不到檔案");
		}
	}
}