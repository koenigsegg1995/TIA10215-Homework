package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		//讓使用者輸入三邊
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入三邊判斷是否為三角形: ");
		
		//宣告 triangle 陣列存放三邊
		int[] triangle = new int[3];
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = sc.nextInt();
		}
		//排序陣列元素
		Arrays.sort(triangle);

		//使用 isTriangle 方法判斷是否為三角形
		Q1 q1 = new Q1();
		String ans;
		if(q1.isTriangle(triangle) == true) {
			//是，再使用 whichTriangle 方法判斷為何種三角形，並以 ans 存放回傳字串
			ans = q1.whichTriangle(triangle);
		}
		else {
			//不是，並以 ans 存放回傳字串
			ans = "不是三角形";
		}
		
		//印出答案
		System.out.println(ans);
		sc.close();
	}
	
	//判斷是否為三角形
	public boolean isTriangle(int[] array) {
		//判斷 長邊 + 短邊 是否大於 斜邊
		if(array[0] + array[1] > array[2]) {
			//是
				return true;
		}
		else {
			//否
			return false;
		}
	}
	
	//判斷是哪種三角形
	public String whichTriangle(int[] array) {
		//三邊相等是正三角形
		if(array[0] == array[1] && array[1] == array[2]) {
			return "是正三角形";
		}
		//其中兩邊相等為等腰三角形
		else if(array[0] == array[1] || array[0] == array[2] || array[1] == array[2]){
			return "是等腰三角形";
		}
		//短邊平方 + 長鞭平方 等於 斜邊平方 為直角三角形
		else if((int)(Math.pow(array[0], 2)) + (int)(Math.pow(array[1], 2)) == (int)(Math.pow(array[2], 2))) {
			return "是直角三角形";
		}
		//為其他三角形
		else {
			return "是其他三角形";
		}
	}
}
