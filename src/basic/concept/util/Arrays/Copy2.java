package basic.concept.util.Arrays;
//https://coding-factory.tistory.com/548

import java.util.Arrays;

public class Copy2 {
	public static void main(String[] args) {

		System.out.println("\n\n1] ======================>");
		System.out.println("\n\n1 =========>");
		//얕은 복사
		int[] a11 = { 1, 2, 3, 4 };
		int[] b11 = a11;
		System.out.println(Arrays.toString(a11));
		System.out.println(Arrays.toString(b11));
		
		
		
		System.out.println("\n\n2 =========>");
		//깊은 복사
        int[] a = { 1, 2, 3, 4 };
        int[] b = new int[a.length]; 
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
				
		System.out.println("\n\n2] =======================>");
		//2] 배열을 복사하는 여러가지 메서드
		
		
		System.out.println("\n\n1 =========>");
		//(깊은 복사) 가장 보편적인 방법입니다.
		//Object.clone(),Array.clone()을 사용하면 배열을 쉽게 복사할 수 있습니다. 
        int[] a1 = { 1, 2, 3, 4 };
        int[] b1 = a1.clone();
        System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
		
		
        System.out.println("\n\n2 =========>");
        int[] a2 = { 1, 2, 3, 4 };
        int[] b2 = Arrays.copyOf(a2, a2.length);
        System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(b2));
		
		
        System.out.println("\n\n3 =========>");
        int[] a3 = { 1, 2, 3, 4 };
        int[] b3 = Arrays.copyOfRange(a3, 1, 3);
        System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(b3));
		
        
        System.out.println("\n\n4 =========>");
        //deep copy네 : arraycopy
        int[] a4 = { 1, 2, 3, 4 };
        int[] b4 = new int[a4.length];
        System.arraycopy(a4, 0, b4, 0, a4.length);
        System.out.println(Arrays.toString(a4));
		System.out.println(Arrays.toString(b4));
		
        
        System.out.println("\n\n5 =========>");
        //2차원 배열의 깊은 복사 - 이중 for문 활용
        int a5[][] = {{1,2,3},{4,5,6,},{7,8,9}};
        int[][] b5 = new int[a5.length][a5[0].length];
        for(int i=0; i<a5.length; i++) {
            for(int j=0; j<a5[i].length; j++) {
                b5[i][j] = a5[i][j];  
            }
        }
        System.out.println(Arrays.toString(a5));
		System.out.println(Arrays.toString(b5));
		
        
        System.out.println("\n\n6 =========>");
        //2차원 배열의 깊은 복사 - System.arraycopy 활용
        int a6[][] = {{1,2,3},{4,5,6,},{7,8,9}};
        int b6[][] = new int[a6.length][a6[0].length];
        for(int i=0; i<b6.length; i++){
            System.arraycopy(a6[i], 0, b6[i], 0, a6[0].length);
        }
        System.out.println(Arrays.toString(a6));
		System.out.println(Arrays.toString(b6));
		
	}//main
}

