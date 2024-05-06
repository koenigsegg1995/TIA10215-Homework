package hw5;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("請輸入寬與高:");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();

		starSquare(width, height);
		sc.close();
	}

	public static void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
