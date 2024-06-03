package hw9.q2;

public class Account {
	
	public int deposit = 0; //預設存款為 0
	
	public Account() {
		
	}
	
	 public void transfer(String name, int amount) { //匯款
		synchronized(this) {
		deposit += amount;
		System.out.println(name + "匯了" + amount + "，帳戶共有：" + deposit);}
	}

	synchronized public void withDraw(String name, int amount) { //領錢
		deposit += amount;
		System.out.println(name + "領了" + -amount + "，帳戶共有：" + deposit);
	}
	
}
