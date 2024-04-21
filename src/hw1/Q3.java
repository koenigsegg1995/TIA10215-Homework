package hw1;

public class Q3 {
	
	public static void main(String[] args) {
		int num = 256559; //宣告變數存放256559秒
		int time; //宣告變數未計算時間
		
		int sec, min, hr, day; //宣告變數秒、分、小時、天
		
		sec = num % 60; //答案秒數
		time = num / 60; //總共分鐘數
		min = time % 60; //答案幾分鐘
		time /= 60; //總共幾小時
		hr = time % 24; //答案幾小時
		day = time / 24; //總共幾天
		
		System.out.printf("%d天%d小時%d分%d秒", day, hr, min, sec); //印出答案
	}
}
