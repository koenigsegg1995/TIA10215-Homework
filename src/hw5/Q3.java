package hw5;

import java.util.Arrays;

public class Q3{

	public static void main(String[] args) {
		int[][] intArray = {{1, 6, 3}, 
							{9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2},
								  {7.4, 2.1, 8.2}};
		
		System.out.println("intArray 最大元素是: " + maxElement(intArray));
		System.out.println("doubleArray : 最大元素是" + maxElement(doubleArray));
		
	}
	
	public static int maxElement(int[][] intArray) {
		int max = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			Arrays.sort(intArray[i]);
			if(max < intArray[i][intArray.length]) {
				max = intArray[i][intArray.length];
			}
		}
		
		return max;
	}
	
	public static double maxElement(double[][] doubleArray) {
		double max = 0;
		
		for(int i = 0; i < doubleArray.length; i++) {
			Arrays.sort(doubleArray[i]);
			if(max < doubleArray[i][doubleArray.length]) {
				max = doubleArray[i][doubleArray.length];
			}
		}
		
		return max;
	}
	
}
