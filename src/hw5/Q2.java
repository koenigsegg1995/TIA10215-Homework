package hw5;

public class Q2 {

	public static void main(String[] args) {
		int[] randomNum = new int[10];

		System.out.println("本次亂數結果:");
		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int) (Math.random() * 101) + 1;
			System.out.print(randomNum[i] + " ");
		}
		
		System.out.println();
		System.out.println("平均是: " + randAvg(randomNum));
	}
	
	public static int randAvg(int[] randomNum) {
		int avg = 0, sum = 0;
		
		for(int i = 0; i < randomNum.length; i++) {
			sum += randomNum[i];
		}
		avg = sum / randomNum.length;
		
		return avg;
	}
}