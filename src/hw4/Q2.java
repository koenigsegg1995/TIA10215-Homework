package hw4;

public class Q2 {
	
	public static void main(String[] args) {
		String s = "Hello World";
		
		int j = 0;
		char[] reverse2 = new char[s.length()];
		for(int i = s.length() - 1; i >= 0; i--) {
			if(j < s.length()) {
				reverse2[j] = s.charAt(i);
				j++;
			}
		}
		String reverse = new String(reverse2);
		
		System.out.println(reverse);
	}
}