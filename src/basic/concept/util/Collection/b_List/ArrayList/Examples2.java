package basic.concept.util.Collection.b_List.ArrayList;
//https://psychoria.tistory.com/765

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Examples2 {

	public static void main(String[] args) {

		System.out.println("\n1. ===============>");
		//1. ArrayList 생성
		ArrayList<Integer> integers1 = new ArrayList<Integer>(); // 타입 지정
		ArrayList<Integer> integers2 = new ArrayList<>(); // 타입 생략 가능
		ArrayList<Integer> integers3 = new ArrayList<>(10); // 초기 용량(Capacity) 설정
		ArrayList<Integer> integers4 = new ArrayList<>(integers1); // 다른 Collection값으로 초기화
		ArrayList<Integer> integers5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList()
		
		
		
		System.out.println("\n2. ===============>");
		//2. ArrayList 엘레멘트 추가/변경	
        // add() method
		ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add(0, "Green");
        colors.add("Red");
        System.out.println(colors);
        
        // set() method
        colors.set(0, "Blue");
        System.out.println(colors);
		
		
        
        System.out.println("\n3. ===============>");
		//3. ArrayList 엘레멘트 삭제
        ArrayList<String> colors3 = 
        		new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        String removedColor = colors3.remove(0);
        System.out.println("Removed color is " + removedColor);

        colors3.remove("White");
        System.out.println(colors3);

        colors3.clear();
        System.out.println(colors3);
        
        
        

        System.out.println("\n4. ===============>");
        //4. ArrayList 전체 값 확인
        ArrayList<String> colors4 = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        // for-each loop
        for (String color : colors4) {
            System.out.print(color + "  ");
        }
        System.out.println();

        // for loop
        for (int i = 0; i < colors4.size(); ++i) {
            System.out.print(colors4.get(i) + "  ");
        }
        System.out.println();

        // using iterator
        Iterator<String> iterator = colors4.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();

        // using listIterator, 역방향으로 출력- 이거 어떻게 하는거지??
        ListIterator<String> listIterator = colors4.listIterator(colors4.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.hasPrevious());
            System.out.println(listIterator.previous() + "  ");
            System.out.println(listIterator.toString());
        }
        System.out.println();
        
        

        System.out.println("\n5. ===============>");
        //5. 값 존재 유무 확인
        ArrayList<String> colors5 = new ArrayList<>(Arrays.asList("Black", "White", "Green", "Red"));
        boolean contains = colors5.contains("Black");
        System.out.println(contains);

        int index = colors5.indexOf("Blue");
        System.out.println(index);

        index = colors5.indexOf("Red");
        System.out.println(index);
		
	}
}
