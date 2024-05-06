package hw4;

public class Q6 {
	
	public static void main(String[] args) {
		//宣告陣列存放分數
		int[][] test = {{10, 35, 40, 100, 90, 85, 75, 70},
						{37, 75, 77, 89, 64, 75, 70, 95},
						{100, 70, 79, 90, 75, 70, 79, 90},
						{77, 95, 70, 89, 60, 75, 85, 89},
						{98, 70, 89, 90, 75, 90, 89, 90},
						{90, 80, 100, 75, 50, 20, 99, 75}};
		//4 8 1 2 1 3
		//宣告陣列存放每位同學考最高分次數
		int[] highest = {0, 0, 0, 0, 0, 0, 0, 0};
		
		//計算每次最高分者並存入陣列
		for(int testTime = 0; testTime < 6; testTime++) {
			highest[whoIsBest(test, testTime)] += 1;
		}
		
		//印出每位同學最高分次數
		for(int i = 0; i < 8; i++) {
			System.out.printf("%d號考最高分次數為%d\n", i+1, highest[i]);
		}
	}
	
	//算出每次考試最高分的學生索引值
	public static int whoIsBest(int[][]array, int testTime) {
		int max = 0, maxIndex = 0;
//		a:
//		for(int j = 0; j < array[testTime].length; j++) {
//			for(int k = j + 1; k < array[testTime].length; k++) {
//				if(array[testTime][j] < array[testTime][k]) {
//					continue a;
//				}
//			}
//			max = j;
//			break;
//		}
		
		for(int i = 0;  i < array[testTime].length; i++) {
			if(max < array[testTime][i]) {
				max = array[testTime][i];
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
}