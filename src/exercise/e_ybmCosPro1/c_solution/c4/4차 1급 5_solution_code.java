class Solution {
	public String solution(int n) {
		String answer = "";
		for(int i = 0; i < n; ++i)
		{
			answer += Integer.toString(i%9 + 1);
			answer = reverse(answer);
		}
		return answer;
	}

	public String reverse(String number) {
		String reverseNumber = "";
		for(int i = number.length()-1; i >= 0; --i) {
			reverseNumber += number.charAt(i); 
		}
		return reverseNumber;
	}

}