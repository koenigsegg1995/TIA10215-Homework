package hw4;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		//宣告陣列存放數字
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		//排序陣列元素
		Arrays.sort(array);
		
		//宣告變數存放元素總和
		int sum = 0;
		//加總陣列元素
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		//宣告變數存放陣列元素平均值
		int average = sum / (array.length);
		//印出陣列元素平均值
		System.out.println(average);
		
		System.out.println("大於陣列平均的元素有: ");
		//確認大於陣列平均的元素
		for(int i = 0; i < array.length; i++){
			if(array[i] > average) {
				//印出大於平均值的陣列元素
				System.out.print(array[i] + "\t");
			}
		}
	}
	
}