package b_programmers.hash;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Runner_test {
	
//	static String[] participant = { "leo", "kiki", "eden" };
//	static String[] completion = { "eden", "kiki" };
//	
	static String[] participant = {"mislav", "stanko", "mislav", "ana"};	        
	static String[] completion = {"stanko", "ana", "mislav"};	 
	public static void main(String[] args) throws IOException {
		System.out.println("test 1112");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(solution(participant, completion));
		bw.flush();
		bw.close();
	
	}

	static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		//작성 시작
		HashMap<String, Integer> hm = new HashMap<>(); 
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		for (String player2 : completion) {
			hm.put(player2, hm.get(player2) - 1);
		}
		
		
		//작성 끝
		
		return answer;
	}

}
