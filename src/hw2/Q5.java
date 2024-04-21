package hw2;

public class Q5 {

	public static void main(String[] args) {
		int num; // 宣告變數存放可以選的數字
		int count = 0; //宣告變數存放可以選的數字數量並設起始值為0
		
		System.out.print("可以選的數字有:"); //印出說明文字
		
		for (num = 1; num < 40; num++) { //迴圈從1跑到39，40後都不能選
			if(num == 4 || num == 14 || num == 24 || num == 34) { //跑到4、14、24、34跳過
				continue;
			}
			System.out.print(num + " "); //印出可以選的號碼
			count++; //計算可以選的數字數量
		}
		
		System.out.println(); //換行
		System.out.print("可以選的數字有:" + count + "個"); //印出可以選的數字數量
	}
}