package hw3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		//讓使用者輸入並宣告變數 input 存放
		Scanner sc = new Scanner(System.in);
		
		//產生亂數
		Q2 q2 = new Q2();
		int random = q2.getRandom();

		while (true) {
			System.out.println("請輸入數字: ");
			int input = sc.nextInt();

			//輸入數字大於答案
			if (input > random) {
				System.out.println("大於答案");
			}
			//輸入數字小於答案
			else if (input < random) {
				System.out.println("小於答案");
			}
			//輸入數字等於答案
			else {
				System.out.println("猜對了");
				break;
			}
		}

		sc.close();
	}

	//取得亂數 0~100
	public int getRandom() {
		return (int) (Math.random() * 100);
	}

}
