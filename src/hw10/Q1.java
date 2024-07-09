package hw10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q1 {
	
	public static void main(String[] args) {
		Set<Integer>randomNum = new HashSet<Integer>();
		
		int i = 0;
		while(i < 5) {
			boolean success = randomNum.add(randomNum());
			if(success) {
				i++;
			}
		}
		
		Iterator<Integer> it = randomNum.iterator();
		while(it.hasNext()) {
			int itNum = (int)it.next();
			if(isPrime(itNum)) {
				System.out.println(itNum + "是質數");
			}
			else {
				System.out.println(itNum + "不是質數");
			}
		}
	}
	
	public static int randomNum() {
		int num;
		
		num = (int)(Math.random() * 100) + 1;
		
		return num;
	}
	
	public static boolean isPrime(int num) {
		int i = 2;
		while(i < num) {
			if(num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
}
