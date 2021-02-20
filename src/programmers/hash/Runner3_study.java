package programmers.hash;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Runner3_study {
	
//	static String[] participant = { "leo", "kiki", "eden" };
//	static String[] completion = { "eden", "kiki" };
//	
	static String[] participant = {"mislav", "stanko", "mislav", "ana"};	        
	static String[] completion = {"stanko", "ana", "mislav"};	 
	public static void main(String[] args) throws IOException {
		System.out.println("test 111");
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		bw.write(solution(participant, completion));
//		bw.flush();
//		bw.close();
		
		System.out.println("test 222");
		HashMap<String, Integer> hm = new HashMap<>(); 
		String[] arr1 = {"aaa", "bbb", "ccc", "aaa", "aaa", "ccc"};
		for (String aa : arr1) {
			//System.out.println("aa:"+aa);
		//	hm.put(a, )
			
		}
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		
		
		System.out.println(hm.get("a"));
		System.out.println(hm.getOrDefault("a", 7));
	}

	static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		//작성 시작
		
		
		
		
		//작성 끝
		
		return answer;
	}

}
