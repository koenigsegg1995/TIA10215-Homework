package hw9.q2;

public class BearAccount extends Account{
	
	public synchronized void transfer(String name, int amount) { //匯款
		while (deposit > 3000) { 
			try {
				System.out.println(name + "看到餘額在 3000 以上，暫停匯款");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
//				main方法呼叫媽媽執行緒的interrupt()，就是代表wait被中斷了，就會觸發此例外
//				System.err.println("媽媽可以結束匯款惹～");
//				結束該次方法執行
//				return;
			}
		}
		System.out.println(name + "被要求匯款");
		super.transfer(name, amount);
		notify(); //通知匯款
	}

	public synchronized void withDraw(String name, int amount) { //領錢
		while (deposit < -amount) { //存款低於提款
				System.out.println(name + "看到帳戶沒錢，暫停提款");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 會從wait狀態醒過來並執行至此，代表被Mom執行緒notify
				System.out.println(name + "被告知帳戶已經有錢！");
		}
		super.withDraw(name, amount);
		if (deposit <= 2000) {
			System.out.println(name + "看到餘額在 2000 以下，要求匯款");
			notify(); //要求匯款
		}
	}

}
