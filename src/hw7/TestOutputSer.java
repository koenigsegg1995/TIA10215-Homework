package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestOutputSer {
	
	public static void main(String[] args) {
		Animal[] animal = new Animal[2];
		animal[0] = new Cat("cat");
		animal[1] = new Dog("dog");
		
		File dir = new File("C:\\TIA102_Workspace\\TIA10215-Homework\\Data");
		if(!(dir.exists())) {
			dir.mkdir();
		}
		try {
			FileOutputStream fos = new FileOutputStream("C:\\TIA102_Workspace\\TIA10215-Homework\\Data\\Object.ser");
			ObjectOutputStream output = new ObjectOutputStream(fos);
			
			for(int i = 0; i < animal.length; i++) {
				output.writeObject(animal[i]);
			}
			
			output.close();
		}
		catch(IOException e) {
			System.out.println("找不到檔案");
		}
	}

}
