package hw4;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年、月、日: ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		while(true) {
			if((month == 1 ||
			    month == 3 ||
			    month == 5 ||
			    month == 7 ||
			    month == 8 ||
		        month == 10 ||
		        month == 12) && day >31 || month > 12 ||
			    year <= 0 || month <= 0 || day <= 0) {
					System.out.println("請確認輸入年月日是否正確");
					System.out.println("請輸入年、月、日: ");
					year = sc.nextInt();
					month = sc.nextInt();
					day = sc.nextInt();
			}
			else if ((month == 4 ||
			          month == 6 ||
			          month == 9 ||
			          month == 11) && day >30 || month > 12 ||
					  year <= 0 || month <= 0 || day <= 0){
						System.out.println("請確認輸入年月日是否正確");
						System.out.println("請輸入年、月、日: ");
						year = sc.nextInt();
						month = sc.nextInt();
						day = sc.nextInt();
			}
			else if (month == 2 && year % 4 == 0){
				System.out.println("2 月不得大於 29 日");
				System.out.println("請輸入年、月、日: ");
				year = sc.nextInt();
				month = sc.nextInt();
				day = sc.nextInt();
			}
			else if (month == 2 && year % 4 != 0){
				System.out.println("2 月不得大於 28 日");
				System.out.println("請輸入年、月、日: ");
				year = sc.nextInt();
				month = sc.nextInt();
				day = sc.nextInt();
			}
			else {
				break;
			}
		}
		
		int whichDay = days(year, month, day);
		
		System.out.printf("輸入的日期為該年第%d天", whichDay);
		
		sc.close();
	}
	
	public static boolean leapYear(int year) {
		if(year % 4 == 0) {
			return true;
		}
		return false;
	}
	
	public static int days(int year, int month, int day) {
		int big, small, days;
		
		if(leapYear(year) == true && month >= 2 && month <= 7) {
			small = month / 2 - 1;
			big = month - small - 1;
			
			if(month % 2 == 0 && month <= 7 && month != 2) {
				small -= 1;
			}
			else if(month % 2 != 0 && month <= 7 && month != 2) {
				big -= 1;
			}
			else if(month % 2 == 0 && month > 7) {
				big -= 1;
			}
			else if(month % 2 != 0 && month > 7) {
				small -= 1;
			}
			
			days = small * 30 + big * 31 + 29 + day;
			return days;
		}
		else if(leapYear(year) == true && month > 7){
			int month2 = month - 7;
			small = 7 / 2 - 1;
			big = 7 - small - 1;
			
			int small2 = month2 / 2;
			int big2 = month2 - small2;
			
			small += small2;
			big += big2;
			
			if(month % 2 == 0 && month <= 7 && month != 2) {
				small -= 1;
			}
			else if(month % 2 != 0 && month <= 7 && month != 2) {
				big -= 1;
			}
			else if(month % 2 == 0 && month > 7) {
				big -= 1;
			}
			else if(month % 2 != 0 && month > 7) {
				small -= 1;
			}
			
			days = small * 30 + big * 31 + 29 + day;
			return days;
		}
		else if(leapYear(year) == false && month >= 2 && month <= 7) {
			small = month / 2 - 1;
			big = month - small - 1;
			
			if(month % 2 == 0 && month <= 7 && month != 2) {
				small -= 1;
			}
			else if(month % 2 != 0 && month <= 7 && month != 2) {
				big -= 1;
			}
			else if(month % 2 == 0 && month > 7) {
				big -= 1;
			}
			else if(month % 2 != 0 && month > 7) {
				small -= 1;
			}
			
			days = small * 30 + big * 31 + 28 + day;
			return days;
		}
		else if(leapYear(year) == false && month > 7) {
			int month2 = month - 7;
			small = 7 / 2 - 1;
			big = 7 - small - 1;
			
			int small2 = month2 / 2;
			int big2 = month2 - small2;
			
			small += small2;
			big += big2;
			
			if(month % 2 == 0 && month <= 7 && month != 2) {
				small -= 1;
			}
			else if(month % 2 != 0 && month <= 7 && month != 2) {
				big -= 1;
			}
			else if(month % 2 == 0 && month > 7) {
				big -= 1;
			}
			else if(month % 2 != 0 && month > 7) {
				small -= 1;
			}
			
			days = small * 30 + big * 31 + 28 + day;
			return days;
		}
		else{
			return day;
		}
	}
	
}