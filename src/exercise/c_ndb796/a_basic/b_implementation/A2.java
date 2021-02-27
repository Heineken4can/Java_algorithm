package exercise.c_ndb796.a_basic.b_implementation;

import java.util.Scanner;

public class A2 {
//https://github.com/ndb796/python-for-coding-test/blob/master/4/1.java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");//R R R U D D
        int x = 1;
        int y = 1;
        
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        
        for (int i = 0; i < plans.length; i++ ) {
        	char plan = plans[i].charAt(0);
        	int nx = -1, ny = -1;
        	for (int j = 0; j < 4; j++) {
        		if(plan == moveTypes[j]) {
        			nx = x + dx[j];
        			ny = y + dy[j];
        		}
        	}
        	
        	if (nx < 1 || ny < 1 || nx > n || ny >n) continue;
        	
        	x = nx;
        	y = ny;
        }
        
        
        
        
        
        System.out.println(x + " " + y);
	}

}
