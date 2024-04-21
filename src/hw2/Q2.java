package hw2;

public class Q2 {
	
	public static void main(String[] args) {
		int product = 1; //宣告變數存放連乘積
		
		for (int i = 1; i <= 10; i++) { //從1跑到10
			product *= i; //連乘積
		}
		
		System.out.println(product); //印出連乘積
	}
}
