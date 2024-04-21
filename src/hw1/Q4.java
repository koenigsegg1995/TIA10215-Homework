package hw1;

public class Q4 {
	
	public static void main(String[] args) {
		final double PI = 3.1415; //宣告常數圓周率
		int r = 5; //宣告變數半徑
		
		double cir = 2 * PI * r; //宣告變數圓周長存放結果
		double area = PI * Math.pow(r, 2); //宣告變數園面積存放結果
		
		System.out.printf("圓周長為%f，圓面積為%f", cir, area);
	}
}
