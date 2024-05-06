package hw4;

public class Q3 {

	public static void main(String[] args) {
		//宣告陣列存放八大行星
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		//宣告變數存放母音數量
		int count = 0;
		//取出 planet 陣列元素
		for(int i = 0; i < planet.length; i++) {
			//宣告陣列存放轉成字元後的字串元素
			char[] check = planet[i].toCharArray();
			
			for(int j = 0; j < planet[i].length(); j++) {
				if(check[j] == 'a' ||
				   check[j] == 'e' ||
				   check[j] == 'i' ||
			       check[j] == 'o' ||
				   check[j] == 'u') {
						count++;
				}
			}
		}
		System.out.println(count);
		
	}
}
