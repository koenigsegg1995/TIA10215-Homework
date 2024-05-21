package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add(new Short("100"));
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
//		Iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//for
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		//for-each
		for(Object obj: list) {
			System.out.print(obj + " ");
		}
		
		System.out.println("\n" + "========");
		
		it = list.iterator();
		while(it.hasNext()) {
			if(!(it.next() instanceof Number)) {
				it.remove();
			}
		}
		
		it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
}
