package basic.concept.util.Arrays;
//출처: https://codeman77.tistory.com/64 [☆]
	
import java.util.Arrays;

public class Examples {

	public static void main(String[] args) {
				
		System.out.println("\n1. ====================>");
        // 배열 선언
        int[] array = { 1, 0, 4, 5, 7, 2, 8, 6, 9, 3 };
         
        // 배열을 출력할때 for문을 이용하지만
        // Arrays.toString()을 이용하면 간단하게 출력이 가능하다.
        System.out.println("\n2. -----Arrays.toString()-----");
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
         
        
        
        // Arrays.sort()를 이용하면 오름차순 정렬이 되고 기존의 값을 변경 시킨다.
        System.out.println("\n3. -----Arrays.sort()-----");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
         
        
        
        // Arrays.binarySearch()를 이용하면 해당 특정값을 찾아준다.
        // 검색 결과가 없거나 오류시 음수값을 반환한다.
        // 검색하기 전에는 오름차순으로 정렬되어있어야한다. -> 안그럼 음수값을 반환
        System.out.println("\n4.-----Arrays.binarySearch()-----");
        System.out.println(Arrays.binarySearch(array, 6));
        System.out.println(Arrays.binarySearch(array, 10));
        System.out.println(Arrays.binarySearch(array, 11));
        System.out.println(Arrays.binarySearch(array, 0));
        System.out.println(Arrays.binarySearch(array, -9));
        System.out.println();
         
        
        
        // Arrays.equals()를 이용하면 두 배열을 비교할 수 있다. 같으면 true, 틀리면 false
        int[] a1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] a2 = { 0, 1, 1, 1, 1, 1 };
        System.out.println("\n5.-----Arrays.equals()-----");
        System.out.println(Arrays.equals(array, a1));
        System.out.println(Arrays.equals(array, a2));
        System.out.println();
         
        
        
        // Arrays.fill()를 이용하면 배열을 초기화할 수 있다.
        System.out.println("\n6.-----Arrays.fill()-----");
        Arrays.fill(array, 0);
        System.out.println(Arrays.toString(array));
        Arrays.fill(array, 1);
        System.out.println(Arrays.toString(array));


	}
}
