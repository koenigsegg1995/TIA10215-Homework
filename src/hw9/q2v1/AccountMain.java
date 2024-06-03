package hw9.q2v1;

public class AccountMain {
	
	public static void main(String[] args) {
		Account account = new Account();
		Thread t1 = new Thread(new Brown(account, 1000));
		Thread t2 = new Thread(new BrownMom(account, 2000));
		
		t1.start();
		t2.start();
	}

}
