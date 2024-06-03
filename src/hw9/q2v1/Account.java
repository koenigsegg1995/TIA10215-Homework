package hw9.q2v1;

public class Account {
	
	private int deposit = 0;

	public int getDeposit() {
		return deposit;
	}
	
	synchronized public void addMoney(int money) {
		while(deposit >= 3000) {
			try {
				System.out.println("媽媽看到餘額在 3000 以上，暫停匯款");
				wait();
				System.out.println("媽媽被熊大要求匯款");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		deposit += money;
		System.out.println("媽媽存了 2000 ，帳戶共有: " + deposit);
		notify();
	}
	
	synchronized public void burnMoney(int money) {
		while(deposit < money) {
			try {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				wait();
				System.out.println("熊大被老媽告知帳戶已經有錢");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		deposit -= money;
		System.out.println("熊大領了 " + money + "元，帳戶共有: " + deposit);
		
		if(deposit <= 2000) {
			System.out.println("熊大看到餘額在 2000 以下，要求匯款");
			notify();
		}
	}
	
}
