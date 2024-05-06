package hw4;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		int[][] bank = {{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("你是要借多少: ");
		int howMuch = sc.nextInt();
		
		System.out.println("能借你的同事有:");
		
		int count = 0;
		for (int i = 0; i < bank.length; i++) {
			if(howMuch <= bank[i][1]) {
				System.out.print(bank[i][0] + "\t");
				count++;
			}
		}
		
		if(count > 0) {
			System.out.println();
			System.out.printf("共%d人", count);
		}
		else {
			System.out.println("沒人能借你");
		}
		
		sc.close();
	}
	
}
