package hw9;

public class Eating implements Runnable {
	public static boolean ready = false;
	private String name;
	
	public Eating(String name) {
		this.name = name;
	}
	
	public void run() {
		while(!ready) {
		}
		
		int pcs = 1;

		for (; pcs <= 10; pcs++) {
			System.out.printf("%s吃第%d碗飯\n", name, pcs);
			
			if(pcs == 10) {
				System.out.printf("%s吃完了\n", name);
			}
			
			try {
				Thread.sleep((long) randomNum());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int randomNum() {
		return (int) (Math.random() * 3000) + 500;
	}
}
