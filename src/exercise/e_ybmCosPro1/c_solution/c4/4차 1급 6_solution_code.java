class Solution {
    public int power(int base, int exponent) {
		int val = 1;
		for (int i = 0; i < exponent; i++) 
			val *= base;
		return val;
	}
	public int[] solution(int k) {
		int range = power(10, k);
		int[] answer = new int[range];
		int count = 0;
		for (int i = range / 10; i < range; i++) {
			int current = i;
			int calculated = 0;
			while (current != 0) {
				calculated += power(current % 10, k);
				current = current / 10;
			}
			if (i == calculated) {
				answer[count] = i;
				count++;
			}
		}
		int[] ret = new int[count];
		for (int i = 0; i < count; i++) {
			ret[i] = answer[i];
		}
		return ret;
	}
}