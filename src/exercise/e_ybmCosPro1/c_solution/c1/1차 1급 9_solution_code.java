class Solution {
    public String func_a(String str, int len){
        String padZero = "";
        int padSize = len - str.length();
        for(int i = 0; i < padSize; ++i)
            padZero += "0";
        return padZero + str;
    }
    
    public int solution(String binaryA, String binaryB) {
        int max_length = Math.max(binaryA.length(), binaryB.length());
        if(max_length > binaryA.length())
            binaryA = func_a(binaryA, max_length);
        if(max_length > binaryB.length())
            binaryB = func_a(binaryB, max_length);
        
        int hamming_distance = 0;
        for(int i = 0; i < max_length; ++i)
            if(binaryA.charAt(i) != binaryB.charAt(i))
                hamming_distance += 1;
        return hamming_distance;
    }
}