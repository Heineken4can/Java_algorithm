class Solution {
    public int solution(int K, int[] numbers, String[] UpDown) {
        int left = 1;
        int right = K;
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            if(UpDown[i].equals("UP"))
                left = Math.max(left, num + 1);
            else if(UpDown[i].equals("DOWN"))
                right = Math.min(right, num - 1);
            else if(UpDown[i].equals("RIGHT"))
                return 1;
        }
        return right - left + 1;
    }
}