package hw9.q2v1;

public class BrownMom extends Thread{
	
	private Account account;
	private int money;
	
	public BrownMom(Account account_, int money_) {
		this.account = account_;
		this.money = money_;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			account.addMoney(money);
		}
	}

}
