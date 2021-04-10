// <undefined>
// import <undefined>

class Solution {
    public long solution(long num) {
        num++;
        long digit = 1;
        while (num / digit % 10 == 0) {
            num += digit;
            digit *= 10;
        }
        return num;
    }
}
