package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result, x, y;
		Calculator cal = new Calculator();
		
		while(true) {
			try {
				System.out.println("請輸入x的值:");
				x = sc.nextInt();
				System.out.println("請輸入y的值");
				y = sc.nextInt();
			
				
				result = cal.powerXY(x, y);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("輸入格式不正確");
//				sc.next();
			}
			catch(CalException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
