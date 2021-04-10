class Solution {
    class Pair{
        public int first_num;
        public int second_num;
    }
    
    public int func_a(int numA, int numB, char exp){
        if (exp == '+')
            return numA + numB;
        else if (exp == '-')
            return numA - numB;
        else
            return numA * numB;
    }
    
    public int func_b(String exp){
        for(int i = 0; i < exp.length(); ++i){
            char e = exp.charAt(i);
            if(e == '+' || e == '-' || e == '*')
                return i;
        }
        return -1;
    }
    public Pair func_c(String exp, int idx){
        Pair ret = new Pair();
        ret.first_num = Integer.parseInt(exp.substring(0, idx));
        ret.second_num = Integer.parseInt(exp.substring(idx + 1));
        return ret;
    }
    
    public int solution(String expression) {
        int exp_index = func_b(expression);
        Pair numbers = func_c(expression, exp_index);
        int result = func_a(numbers.first_num, numbers.second_num, expression.charAt(exp_index));
        return result;
    }
}