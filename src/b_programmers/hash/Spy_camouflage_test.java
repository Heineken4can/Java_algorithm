package b_programmers.hash;

import java.util.HashMap;
import java.util.Iterator;

public class Spy_camouflage_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution1(clothes));
	}
	
	public static int solution1(String[][] clothes) {
		int answer = 1;
		
		HashMap<String, Integer> clothesMap = new HashMap<>();
		for ( int i = 0; i < clothes.length; i++) {
			String key = clothes[i][1];
			if (!clothesMap.containsKey(key)) {
				clothesMap.put(key, 1);
			} else {
				clothesMap.put(key, clothesMap.get(key) + 1);
			}
			
		}//for
		
		Iterator<Integer> it = clothesMap.values().iterator();
		while (it.hasNext()) {
			answer *= it.next().intValue() + 1;
		}
		
		return answer - 1; 
	}//solution

}
