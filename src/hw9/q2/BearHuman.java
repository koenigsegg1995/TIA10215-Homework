package hw9.q2;

public class BearHuman extends Thread {
	private Account account; //帳戶
	public int amount; //提匯金額
	public int times; //提匯次數

	//建構子
	public BearHuman(String name, Account account_, int amount_, int times_) {
		super(name); //執行緒名字
		this.account = account_;
		this.amount = amount_;
		this.times = times_;
	}
	
	//執行緒
	public void run() {
		if(amount > 0) { //匯款
			for(int i = 0; i < 10; i++) { //匯 10 次
				
				while (account.deposit >= 3000) { 
					try {
						System.out.println(this.getName() + "看到餘額在 3000 以上，暫停匯款");
						synchronized(this) {
							wait();
						}
						System.out.println(this.getName() + "被要求匯款");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				synchronized(this) {
					account.transfer(getName(), amount);
					notify(); //通知匯款
				}
			}
		}
		else if(amount < 0) { //領錢
			for(int i = 0; i < 10; i++) {
				try {
					while (account.deposit < -amount) { //存款低於提款
						System.out.println(getName() + "看到帳戶沒錢，暫停提款");
						synchronized(this) {
							wait();
						}
						System.out.println(this.getName() + "被告知帳戶已經有錢！");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
			
				synchronized(this) {
					account.withDraw(getName(), amount);
					if (account.deposit <= 2000) {
						System.out.println(getName() + "看到餘額在 2000 以下，要求匯款");
						notifyAll(); //要求匯款
					}
				}
			}
		}
	}

}
