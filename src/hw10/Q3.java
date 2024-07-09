package hw10;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reg = "^\\d{4}[0-1]{1}[0-9]{1}[0-3]{1}[0-9]{1}$";
		String inputDate, function;
		Date date;
		
		Again:
		while(true) {
			System.out.println("請輸入日期 eg.20240621 或 exit 結束程式:");
			inputDate = sc.next();
			if(!(inputDate.matches(reg) && okDate(inputDate))) {
				System.out.println("輸入格式錯誤");
				continue;
			}
			else if(inputDate.equals("exit")) {
				break;
			}
			
			while(true) {
				System.out.println("輸入格式: (1)年/月/日 (2)月/日/年 (3)日/月/年");
				function = sc.next();
				
				SimpleDateFormat sdformat = new SimpleDateFormat("yyyyMMdd");
				try {
					date = sdformat.parse(inputDate);
					
					if(function.equals("1")){
						Format f = new SimpleDateFormat("yyyy/MM/dd");
						System.out.println(f.format(date));
						continue Again;
					}
					else if(function.equals("2")) {
						Format f = new SimpleDateFormat("MM/dd/yyyy");
						System.out.println(f.format(date));
						continue Again;
					}
					else if(function.equals("3")) {
						Format f = new SimpleDateFormat("dd/MM/yyyy");
						System.out.println(f.format(date));
						continue Again;
					}
					else {
						System.out.println("輸入格式: (1)年/月/日 (2)月/日/年 (3)日/月/年");
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				continue;
			}
		}
		
		sc.close();
	}
	
	public static boolean okDate(String date) {
		int year = Integer.parseInt(date.substring(0, 4));
		
		int month1 = Integer.parseInt(date.substring(4, 5));
		int month2 = Integer.parseInt(date.substring(5, 6));
		int month = month1 * 10 + month2;
		
		int day1 = Integer.parseInt(date.substring(6, 7));
		int day2 = Integer.parseInt(date.substring(7));
		int day = day1 * 10 + day2;
		GregorianCalendar gcal = new GregorianCalendar();
		
		if(year > 0 || (1 <= month || month <= 12)) {
			if(
				(gcal.isLeapYear(year) && month == 2 && day <= 29) ||
				((!gcal.isLeapYear(year)) && month == 2 && day <= 28) ||
				(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31 ||
				(month == 4 || month == 6 || month == 9 || month == 11) && day <= 30
			  ) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}
