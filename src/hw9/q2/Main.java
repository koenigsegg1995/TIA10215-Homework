package hw9.q2;

public class Main {

	public static void main(String[] args) {
		Account account = new BearAccount(); //辦一個帳戶
		BearHuman brown = new BearHuman("熊大", account, -1000, 10); //生成熊人
		BearHuman brownMom = new BearHuman("媽媽", account, 2000, 10); //生成熊人
		
		brownMom.start(); //媽媽開始匯款
		brown.start(); //熊大開始提款
		
//		if (brown.isFinished && brownMom.isAlive()) {
//			brownMom.interrupt();
//		}
	}

}
