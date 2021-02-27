package c_ndb796.a_basic.a_greedy;

public class A2 {
    public static void main(String[] args) {
       
    	int money = 1260;
    	int cnt = 0;
    	int[] coinTypes = {500,100,50,10};
    	
    	for(int i = 0; i < 4; i++) {
    		int coin = coinTypes[i];
    		cnt += money / coin;
    		System.out.println("1111");
    		System.out.println(cnt);
    		money %= coin;
    		System.out.println(money);
    	}
    	
    	System.out.println(cnt);
    	
    }

}
