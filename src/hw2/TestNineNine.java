package hw2;

public class TestNineNine {

	public static void main(String[] args) {

//		for 迴圈:
		
//		int i, j; // 宣告兩個變數
//
//		for (i = 1; i <= 9; i++) { // 外層迴圈從1到9執行9次
//			for (j = 1; j <= 9; j++) { // 內層迴圈從1到9執行9次
//				System.out.print(i + "*" + j + "=" + i * j + "\t"); // 印出九九乘法表
//			}
//
//			System.out.println(); // 換行
//		}
		
/*************************************************/
		
//		for 迴圈 + while 迴圈:
		
//		int i, j; // 宣告兩個變數
//		
//		for (i = 1; i <= 9; i++) { // 外層迴圈從1到9執行9次
//			j = 1; //內層迴圈第1次開始執行
//			while (j <= 9) {// 內層迴圈9次以內重複
//				System.out.print(i + "*" + j + "=" + i * j + "\t"); // 印出九九乘法表
//				j++; //遞增
//			}
//
//			System.out.println(); // 換行
//		}
		
/*************************************************/
		
//      for 迴圈 + do while 迴圈
		int i, j; // 宣告兩個變數
		
		for (i = 1; i <= 9; i++) { // 外層迴圈從1到9執行9次
			j = 1; //內層迴圈第1次開始執行
			
			do { //內圈先執行第1次
				System.out.print(i + "*" + j + "=" + i * j + "\t"); // 印出九九乘法表
				j++; //遞增
			}while (j <= 9);// 內層迴圈9次以內重複

			System.out.println(); // 換行
		}
	}
}
