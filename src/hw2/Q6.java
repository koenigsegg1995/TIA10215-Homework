package hw2;

public class Q6 {

	public static void main(String[] args) {
		int column, row; //宣告兩個變數計次外內層迴圈
		int time = 10; //宣告一個變數存放內層迴圈要印的次數，起始值為10
		
		for (column = 1; column <= 10; column++) { //外層迴圈跑10次
			for(row = 1; row <= time; row++) { //內層迴圈跑time次
				System.out.print(row + " "); //印出數字
			}
			
			time--; //完成一次迴圈遞減
			System.out.println(); //換行
		}
	}
}
