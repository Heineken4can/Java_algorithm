import java.util.*;

public class Solution {
    public boolean func_a(ArrayList<String> list, String s) {
		for (int i = 0; i < list.size(); i++)
			if (s.equals(list.get(i)))
				return true;
		return false;
	}

    public boolean func_b(String s) {
		int length = s.length();
		for (int i = 0; i < length / 2; i++)
			if (s.charAt(i) != s.charAt(length - i - 1))
				return false;
		return true;
	}
    
    public String func_c(ArrayList<String> palindromes, int k) {
        Collections.sort(palindromes);
        if (palindromes.size() < k)
        	return "NULL";
        else
        	return palindromes.get(k-1);
    }

    public String solution(String s, int k) {
        ArrayList<String> palindromes = new ArrayList<String>();
        int length = s.length();
        for (int start_idx = 0; start_idx < length; start_idx++) {
            for (int cnt = 1; cnt < length - start_idx + 1; cnt++) {
                String sub_s = s.substring(start_idx, start_idx + cnt);
                if (func_b(sub_s)) {
                	if (func_a(palindromes, sub_s) == false)
                		palindromes.add(sub_s);
                }
            }
        }

        String answer = func_c(palindromes, k);
        return answer;
    }
}