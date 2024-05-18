package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
	private File origin;
	private File copy;
	
	public CopyFile() {
		
	}
	
	public CopyFile(String location, String copyLoc) {
		origin = new File(location);
		copy = new File(copyLoc);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入想複製的檔案位址");
		String location = sc.next();
		System.out.println("請輸入複製檔的檔案位址");
		String copyLoc = sc.next();
		
		CopyFile cf = new CopyFile(location, copyLoc);
		try {
				cf.copyFile();
		}
		catch(IOException e) {
			System.out.println("找不到檔案");
		}
		
		sc.close();	
	}

	public void copyFile() throws IOException {
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(copy);
		BufferedInputStream reader = new BufferedInputStream(fis);
		BufferedOutputStream writer = new BufferedOutputStream(fos);
		
		int c;
		while((c = reader.read()) != -1) {
			writer.write(c);
			writer.flush();
		}
		
		writer.close();
		reader.close();
		fos.close();
		fis.close();
	}
	
//	public void copyTxt() throws IOException {
//		FileReader fr = new FileReader(origin);
//		FileWriter fw = new FileWriter(copy);
//		BufferedReader reader = new BufferedReader(fr);
//		BufferedWriter writer = new BufferedWriter(fw);
//		
//		int c;
//		while((c = reader.read()) != -1) {
//			writer.write(c);
//			writer.flush();
//		}
//		
//		writer.close();
//		reader.close();
//		fw.close();
//		fr.close();
//	}
	
}
