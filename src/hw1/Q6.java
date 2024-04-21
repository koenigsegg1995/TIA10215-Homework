package hw1;

public class Q6 {
	
	public static void main(String[] args) {
		int num = 5; //宣告變數存放數字5
		char f = '5'; //宣告變數存放字元'5'
		String F = "5"; //宣告變數存放字串"5"
		
		System.out.println(num + num); //5 + 5，數字相加
		System.out.println(num + f); //5 + '5'，數字與字元Unicode號碼轉十進位相加
		System.out.println(num + F); //5 + "5"，數字與字串串接
	}

}
