package hw9.q2v1;

public class Brown implements Runnable {
	
	private Account account;
	private int money;
	
	public Brown(Account account_, int money_) {
		this.account = account_;
		this.money = money_;
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
			account.burnMoney(money);
		}
	}

}
