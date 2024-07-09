package hw9.q2;

public class BearHuman extends Thread {
	private Account bearAccount; //帳戶
	public int amount; //提匯金額
	public int times; //提匯次數
	public static boolean isFinished = false;

	//建構子
	public BearHuman(String name, Account bearAccount_, int amount_, int times_) {
		super(name); //執行緒名字
		this.bearAccount = bearAccount_;
		this.amount = amount_;
		this.times = times_;
	}
	
	//執行緒
	public void run() {
		if(amount > 0) { //匯款
			for(int i = 0; i < 10; i++) { //匯 10 次
				bearAccount.transfer(getName(), amount);
				
				if(isFinished == false) {
					break;
				}
			}
		}
		else if(amount < 0) { //領錢
			for(int i = 0; i < 10; i++) {
				bearAccount.withDraw(getName(), amount);
			}
			isFinished = true;
		}
	}

}
