package hw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 {
	
	public static void main(String[] args) {
		try {
			File data = new File("C:\\TIA102_Workspace\\TIA10215-Homework\\file\\Data.txt");
			FileWriter output = new FileWriter(data, true);
			
			for(int i = 1; i <= 10; i++) {
				String randomNum = Integer.toString(getRandom());
				char[] numArray = randomNum.toCharArray();
				
				output.write(numArray);
				output.write(32);
				output.flush();
			}
			
			output.close();
		}
		catch(IOException e) {
			System.out.println("找不到檔案");
		}
	}
	
	public static int getRandom() {
		return (int)(Math.random() * 1000 + 1);
	}

}
