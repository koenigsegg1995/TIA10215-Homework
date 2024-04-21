package hw1;

public class Q2 {
	
	public static void main(String[] args) {
		 int egg = 200; //宣告變數存放蛋的數量
		 
		 int dozen = egg / 12; //宣告變數存放幾打的數字
		 int mod = egg % 12; //宣告變數存放剩餘的蛋數
		 
		 System.out.printf("共有%d打\n", dozen); //印出幾打
		 System.out.printf("剩餘%d顆", mod); //印出剩餘幾顆
	}
}
