package task1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar cl = Calendar.getInstance();
		System.out.println("input number of month started from 0:");
		int month = sc.nextInt();
		System.out.println("input number of day of month started from 0:");
		int day = sc.nextInt();
		cl.set(Calendar.MONTH, month);
		cl.set(Calendar.DAY_OF_MONTH, day);
		Date date = cl.getTime();
		long date1 = date.getTime();
		System.out.println("milliseconds from 1970 for your date:" + date1);
		cl.set(Calendar.MONTH, month - 1);
		cl.set(Calendar.DAY_OF_MONTH, day);
		Date date2 = cl.getTime();
		long date3 = date2.getTime();
		System.out.println("milliseconds from 1970 for date before yours by 1 month:" + date3);
		System.out.println("Milliseconds from 1 month before to today:" + (date1 - date3));
	}

}
