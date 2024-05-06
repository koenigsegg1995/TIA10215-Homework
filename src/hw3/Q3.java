package hw3;

import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args) {
		Q3 q3 = new Q3();
		//讓使用者輸入不想選的數字
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入不要的數字: ");
		//用 String 更好比對
		String input = sc.next();
		
		System.out.println();
		//印出能選的數字與數量
		q3.allLuckyNum(input);
		System.out.println();
		//代客簽賭
		q3.getRandom(input);
		
		sc.close();
	}
	
	//印出可以選的數字
	public void allLuckyNum(String input) {
		System.out.println("可以選擇的數字: ");
		//宣告變數存放能選的數字數
		int count = 0; 
		//從 1~49 確認是否能選
		for(int num = 1; num <= 49; num++) {
			if(canChoose(num, input) == false) {
				//跳到下一個數字
				continue;
			}
			else {
				//印出可以選的數字
				System.out.print(num + " ");
				//計算能選的數字數
				count++;
			}
		}
		//印出可以選的數字與數量
		System.out.printf("\n" + "總共有%d個數字可以選擇\n", count);
	}
	
	//選出 6 個能選的數字
	public void getRandom(String input) {
		System.out.println("代客簽賭: ");
		//宣告變數計算選了幾個數字
		int count = 0;
		//宣告陣列存放選的 6 個數字
		int[] chosenNum = new int[6];
		
		//重複亂數選 6 個數字
		while(count < 6){
			int num = (int)(Math.random() * 49) + 1;
			//確認是否能選
			if(canChoose(num, input) == false) {
				//不能，重新迴圈選數字
				continue;
			}
			else {
				//可以，確認是否重複
				if(count > 0 && isRepeat(chosenNum, num, count) == true) {
					//是，重新迴圈選數字
					continue;
				}
				//將此數字計入陣列
				chosenNum[count] = num;
				//計算已選數字數量
				count++;
			}
		}
		//印出選出的 6 個數字
		for(int i = 0; i < chosenNum.length; i++) {
			System.out.print(chosenNum[i] + " ");
		}
	}
	
	//判斷數字能不能選
	public boolean canChoose(int num, String input) {
		//將要比對的數字轉成 String
		String s = Integer.toString(num);
		//含有不想選的數字在內會是 true 為符合功能名所以取反以 false 代表不能選
		return !(s.contains(input));
	}
	
	//判斷數字是否重複
	public boolean isRepeat(int[] array, int num, int count) {
		//比對和目前在內所有的元素是否重複
		for(int i = 0; i < count; i++) {
			if(array[i] == num) {
				//重複
				return true;
			}
		}
		//不重複
		return false;
	}
	
}
