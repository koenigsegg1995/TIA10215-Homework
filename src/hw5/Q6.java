package hw5;

public class Q6 {
	
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(genAuthCode());
	}
	public static String genAuthCode() {
		char[] random = new char[8];
		
		int count = 0;
		while(count < 8) {
			int a = (int)((Math.random() * 75) + 48);
			if(a >= 58 && a <= 64 || a >= 91 && a<= 96) {
				continue;
			}
			else {
				random[count] = (char)a;
				count++;
			}
		}
		String AuthCode = new String(random);
		
		return AuthCode;
	}
}
