package programmers.hash;

import java.util.Arrays;

public class PhoneList_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = { "119", "97674223", "1195524421" };

		System.out.println(solution1(phone_book));
	}

	public static Boolean solution1(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);
		
		for(int i = 0; i < phone_book.length - 1; i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer = false;
				break;
			}
			
		}
		return answer;
	}
}
