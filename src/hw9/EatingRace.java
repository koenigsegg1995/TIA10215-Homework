package hw9;

public class EatingRace {

	public static void main(String[] args) {		
		Thread t1 = new Thread(new Eating("詹姆士"));
		Thread t2 = new Thread(new Eating("饅頭人"));
		
		System.out.println("-----大胃王快食比賽開始！-----");
		t1.start();
		t2.start();
		Eating.ready = true;
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束！-----");
	}
}
