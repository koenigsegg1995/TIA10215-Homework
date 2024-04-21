package hw2;

public class Q7 {

	public static void main(String[] args) {
		int column, row; //宣告兩個變數計次外內迴圈
		char alphabet = 65; //宣告變數存放ascii編碼'A'

		for (column = 1; column <= 6; column++) { //外層迴圈跑6次
			for (row = 1; row <= column; row++) { //內層迴圈跑column次
				System.out.print(alphabet); //印出字母
			}
			alphabet++; //完成迴圈遞增

			System.out.println(); //換行
		}
	}
}
