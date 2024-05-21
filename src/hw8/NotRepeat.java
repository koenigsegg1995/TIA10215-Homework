package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NotRepeat {
	
	public static void main(String[] args) {
		Set<Train> train = new HashSet<Train>();
		train.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		train.add(new Train(118, "自強", "高雄", "台北", 500));
		train.add(new Train(1288, "區間", "新竹", "基隆", 400));
		train.add(new Train(122, "自強", "台中", "花蓮", 600));
		train.add(new Train(1222, "區間", "樹林", "七堵", 300));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		//Iterator
//		Iterator<Train> it = train.iterator();
//		while(it.hasNext()) {
//			Train theTrain = it.next();
//			int number = theTrain.getNumber();
//			String type = theTrain.getType();
//			String start = theTrain.getStart();
//			String dest = theTrain.getDest();
//			double price = theTrain.getPrice();
//			
//			System.out.println(number + " " + type + " " + start + " " + dest + " " + price);
//		}
		
		//for-each
		for(Train theTrain: train) {
			int number = theTrain.getNumber();
			String type = theTrain.getType();
			String start = theTrain.getStart();
			String dest = theTrain.getDest();
			double price = theTrain.getPrice();
			
			System.out.println(number + " " + type + " " + start + " " + dest + " " + price);
		}
	}

}
