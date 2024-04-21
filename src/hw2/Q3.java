package hw2;

public class Q3 {
	
	public static void main(String[] args) {
		int product = 1; //宣告變數存放連乘積
		int i = 1; //宣告變數作為迴圈起始值
		
		while (i <= 10) { //迴圈跑到10
			product *= i; //連乘積
			i++; //次數+1
		}
		
		System.out.println(product); //印出連乘積
	}
}
