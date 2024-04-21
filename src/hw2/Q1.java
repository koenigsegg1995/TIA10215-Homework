package hw2;

public class Q1 {
	
	public static void main(String[] args) {
		int num; //宣告變數存放1~1000數字
		int sum = 0; //宣告變數存放偶數和
		
		for (num = 1; num <= 1000; num++) { //num 從1跑到1000
			if (num % 2 == 0) { //可被2整除為偶數
				sum += num;     //偶數和
			}
		}
		
		System.out.println(sum); //印出偶數和
	}
}
