package hw1;

public class Q5 {
	
	public static void main(String[] args) {
		double deposit = 1_500_000; //宣告變數存放初始存款150萬
		final double  RATE = 1.02; //宣告常數存放每年利率
		deposit *= Math.pow(RATE, 10); //第十年為10次方
	
		System.out.printf("第十年存款為%f", deposit); //印出第十年存款
	}
}
