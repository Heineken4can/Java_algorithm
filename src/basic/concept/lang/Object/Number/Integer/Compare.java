package basic.concept.lang.Object.Number.Integer;

import java.util.Calendar;
import java.util.Date;

//https://nowonbun.tistory.com/509

public class Compare {
	public static void main(String... args) {
		
		System.out.println("\n1 =========>");
		System.out.println(Integer.compare(1, 2));// -1, 앞에 수에서 뒤의 수를 빼는건가
		System.out.println(Integer.compare(2, 2));// 0
		System.out.println(Integer.compare(3, 2));// 1
		
		
		System.out.println("\n2 =========>");
		Date date = getDate(2019, 7, 3);
		//System.out.println(date);
		System.out.println(date.compareTo(getDate(2019, 7, 4)));// -1
		System.out.println(date.compareTo(getDate(2019, 7, 3)));// 0
		System.out.println(date.compareTo(getDate(2019, 7, 2)));// 1
	}

	private static Date getDate(int year, int month, int day) {
		System.out.println("\n3 =========>");
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		cal.set(year, month, day);
		
		//System.out.println(Calendar.YEAR);
		//System.out.println(cal);
		//System.out.println(cal.getTime());
		
		return cal.getTime();

	}
}
