package exercise.d_testForRamda256.c_productPlaceStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// https://github.com/ndb796/python-for-coding-test/blob/master/16/4.java


public class B2_soldierDeploy3 {
		
	    static int n;
	    static ArrayList<Integer> v = new ArrayList<Integer>();
	    static int[] dp = new int[2000];

	    public static void main(String[] args) {
System.out.println("111");
	    	Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            v.add(sc.nextInt());
	        }

	        Arrays.fill(dp, 1);
			/*
			 * for (int i = 0; i < n; i++) { dp[i] = 1; }
			 */
	        
	        for (int i = 0; i < n; i++) {
	        	for (int j = 0; j < i; j++) {
	        		if (v.get(j) > v.get(i)) {
	        			dp[i] = Math.max(dp[i], dp[j] + 1);
	        		}
	        	}
	        }
	        
	        
	       int maxValue = 0;
	       for (int i = 0; i < n; i++) {
	    	   maxValue = Math.max(maxValue, dp[i]);
	       }
	       System.out.println(n - maxValue);
	        
	        
	    }
	}
