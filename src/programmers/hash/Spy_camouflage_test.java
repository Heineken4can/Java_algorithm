package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Spy_camouflage_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution1(clothes));
	}
	
	public static int solution1(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> clothesMap = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		for (int val : clothesMap.values()) {
			answer *= (val + 1);
		}
		return answer-1;
			
	}

}
