package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		String input;
		
		Again:
		while(true) {
			String reg = "^\\d{1,}.?\\d*$";
			System.out.print("請輸入數字 或 exit 結束程式: ");
			input = sc.next();
			if(!input.matches(reg)){
				System.out.println("數字格式不正確，請再輸入一次！");
				sc.next();
				continue;
			}
			else if(input.equals("exit")){
				break;
			}
			else {
				num = Double.parseDouble(input);
			}
		
			while(true) {
				System.out.println("欲格式化成 (1)千分位 (2)百分比 (3)科學記號: ");
				String choose = sc.next();
				if(choose.equals("1")) {
					Format df = new DecimalFormat("#,###.00");
					System.out.println(df.format(num));
					
					continue Again;
				}
				else if(choose.equals("2")) {
//					NumberFormat nf = NumberFormat.getPercentInstance();
					Format df = new DecimalFormat("###.###%");
					System.out.println(df.format(num));
					
					continue Again;
				}
				else if(choose.equals("3")) {
					Format df = new DecimalFormat("0.###E0");
					System.out.println(df.format(num));
					
					continue Again;
				}
				else {
					System.out.println("輸入格式不正確！");
					continue;
				}
			}
		}
		
		sc.close();
	}
	
}
