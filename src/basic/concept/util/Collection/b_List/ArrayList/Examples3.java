package basic.concept.util.Collection.b_List.ArrayList;
//https://junjangsee.github.io/2019/07/25/java/arraylist-Method/

//1. ArrayList 생성
//2. add(E e)
//3. add(int index, E element)
//4. addAll(Collection<? extends E> c)
//5. addAll(int index, Collection<? extends E> c)
//6. clear()
//7. clone()
//8. contains(Object o)
//9. forEach(Consumer<? super E> action)
//10. get(int index)
//11. indexOf(Object o)
//12. isEmpty()
//13. iterator()
//14. lastIndexOf(Object o)
//15. listIterator()
//16. listIterator(int index)
//17. remove(int index)
//18. remove(Object o)
//19. removeAll(Collection<?> c)
//21. removeIf(Predicate<? super E> filter)
//22. replaceAll(UnaryOperator operator)
//23. set(int index, E element
//24. size()
//25. sort(Comparator<? super E> c)
//26. subList(int fromIndex, int toIndex)
//27. toArray()
//28. asList()

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Examples3 {
	public static void main(String[] args) {

		System.out.println("\n1. ArrayList 생성  ===============>  ");
		ArrayList<Integer> numbers = new ArrayList<>();


		System.out.println("\n2. add(E e)  ===============>  ");
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		System.out.println(numbers); 

		
		
		System.out.println("\n3. add(int index, E element) ===============>  ");
		numbers.add(1, 15);
		System.out.println(numbers); 


		
		System.out.println("\n4. addAll(Collection<? extends E> c) ===============>  ");
		ArrayList<Integer> newNumbers4 = new ArrayList<>();
		ArrayList<Integer> numbers4 = new ArrayList<>();
	    newNumbers4.add(60);
	    newNumbers4.add(70);
	    newNumbers4.add(80);
	    newNumbers4.add(90);
	    newNumbers4.add(100);
	    
	    numbers4.addAll(newNumbers4);
	    System.out.println(newNumbers4); 
	    System.out.println(numbers4);
	    
	    
		System.out.println("\n5. addAll(int index, Collection<? extends E> c) ===============>  ");
		ArrayList<Integer> newNumbers5 = new ArrayList<>();
		//ArrayList<Integer> numbers5 = new ArrayList<>();
	    newNumbers5.add(60);
	    newNumbers5.add(70);
	    newNumbers5.add(80);
	    newNumbers5.add(90);
	    newNumbers5.add(100);

	    System.out.println(numbers4);
	    System.out.println(newNumbers5);
	    numbers4.addAll(2 , newNumbers5);
	    System.out.println(numbers4);
	    numbers4.addAll(newNumbers5);
	    System.out.println(numbers4); 

	    
	    
		System.out.println("\n6. clear() ===============>  ");
		ArrayList<Integer> numbers6 = new ArrayList<>();
        numbers6.add(10);
        numbers6.add(20);
        numbers6.add(30);
        numbers6.add(40);
        numbers6.add(50);
        System.out.println(numbers6); 
        numbers6.clear();
        System.out.println(numbers6); 
        
        
		System.out.println("\n7. clone()  ===============>  ");
		ArrayList<Integer> numbers7 = new ArrayList<>();
        numbers7.add(10);
        numbers7.add(20);
        numbers7.add(30);
        numbers7.add(40);
        numbers7.add(50);
        System.out.println(numbers7); 
        numbers7.add(1, 15);
        System.out.println(numbers7); 
        ArrayList<Integer> newnumbers7 = (ArrayList<Integer>) numbers7.clone();//깊은 복사
        System.out.println(newnumbers7); 
        

		System.out.println("\n8. contains(Object o)  ===============>  ");
		ArrayList<Integer> newNumbers8 = new ArrayList<>();
		ArrayList<Integer> numbers8 = new ArrayList<>();
	    newNumbers8.add(60);
	    newNumbers8.add(70);
	    newNumbers8.add(80);
	    newNumbers8.add(90);
	    newNumbers8.add(100);
	    numbers8.addAll(newNumbers8);
	    if (numbers8.contains(100)) {
	        System.out.println("100을 가지고 있습니다.");
	    } else {
	        System.out.println("100을 가지고있지 않습니다.");
	    }

	    
	    
		System.out.println("\n9. forEach(Consumer<? super E> action)  ===============>  ");
		numbers8.forEach(number -> System.out.print(number + " "));
		System.out.println();
		
		

		System.out.println("\n10. get(int index)  ===============>  ");
		if (!numbers8.isEmpty()) {
		    System.out.println("첫 번째 엘리먼트 값 : " + numbers8.get(0));
		}
		
		

		System.out.println("\n11. indexOf(Object o)  ===============>  ");
		ArrayList<Integer> numbers11 = new ArrayList<>();
	    numbers11.add(10);
	    numbers11.add(20);
	    numbers11.add(30);
	    numbers11.add(40);
	    numbers11.add(50);
	    numbers11.add(1, 15);
	    System.out.println(numbers11);
	    
	    
	    ArrayList<Integer> newNumbers11 = new ArrayList<>();
	    newNumbers11.add(60);
	    newNumbers11.add(70);
	    newNumbers11.add(80);
	    newNumbers11.add(90);
	    newNumbers11.add(100);
	    numbers11.addAll(newNumbers11);
	    
	    System.out.println(numbers11);
	    System.out.println(newNumbers11);
	    System.out.println(numbers11.indexOf(30));
	    
	    

		System.out.println("\n12. isEmpty() ===============>  ");
		ArrayList<Integer> numbers12 = new ArrayList<>();
	    numbers12.add(10);
	    numbers12.add(20);
	    numbers12.add(30);
	    numbers12.add(40);
	    numbers12.add(50);
	    numbers12.add(1, 15);
	    System.out.println(numbers12);
	    
	    ArrayList<Integer> newNumbers12 = new ArrayList<>();
	    newNumbers12.add(60);
	    newNumbers12.add(70);
	    newNumbers12.add(80);
	    newNumbers12.add(90);
	    newNumbers12.add(100);
	    numbers12.addAll(newNumbers12);
	    System.out.println(numbers12);
	    System.out.println(numbers12.isEmpty());
	    
	    

		System.out.println("\n13. iterator()  ===============>  ");
		Iterator<Integer> iterator13 = numbers12.iterator();
	    while (iterator13.hasNext()) {
	        Integer next = iterator13.next();
	        System.out.print(next + " ");

	        if (numbers12.contains(10)) {
	            iterator13.remove();
	        }
	    }

	    System.out.println("");
	    iterator13 = numbers.iterator();
	    while (iterator13.hasNext()) {
	        Integer next = iterator13.next();
	        System.out.print(next + " ");
	    }

	    
	    
		System.out.println("\n\n14. lastIndexOf(Object o)  ===============>  ");
		ArrayList<Integer> numbers14 = new ArrayList<>();
	    numbers14.add(10);
	    numbers14.add(20);
	    numbers14.add(30);
	    numbers14.add(40);
	    numbers14.add(50);
	    numbers14.add(1, 15);
	    System.out.println(numbers14);
	    
	    ArrayList<Integer> newNumbers14 = new ArrayList<>();
	    newNumbers14.add(80);
	    newNumbers14.add(70);
	    newNumbers14.add(80);
	    newNumbers14.add(90);
	    newNumbers14.add(100);
	    numbers14.addAll(newNumbers14);
	    System.out.println(numbers14);
	    
	    System.out.println(numbers14.lastIndexOf(80));
	    System.out.println(numbers14.lastIndexOf(50000));
	    
	    

		System.out.println("\n15. listIterator()  ===============>  ");
		System.out.println(numbers14);
		
		ListIterator<Integer> listIterator15 = numbers14.listIterator();
	    while (listIterator15.hasNext()) {
	        System.out.print(listIterator15.next() + " ");
	    }
	    System.out.println();
	    
	    while (listIterator15.hasPrevious()) {
	        System.out.print(listIterator15.previous() + " ");
	    }

	    
	    
		System.out.println("\n\n16. listIterator(int index) ===============>  ");
		ListIterator<Integer> listIterator16 = numbers14.listIterator(5);
		System.out.println(numbers14);
		
	    while (listIterator16.hasNext()) {
	        System.out.print(listIterator16.next() + " ");
	    }
	    System.out.println();
	    
	    while (listIterator16.hasPrevious()) {//이건 개수가 전체가 나오지? index 5이후부터만 저장된게 아닌가?
	        System.out.print(listIterator16.previous() + " ");
	    }
	    
	    

		System.out.println("\n\n17. remove(int index) ===============>  ");
		ArrayList<Integer> numbers17 = new ArrayList<>();
	    numbers17.add(10);
	    numbers17.add(20);
	    numbers17.add(30);
	    numbers17.add(40);
	    numbers17.add(50);
	    numbers17.add(1, 15);
	    System.out.println(numbers17);
	    
	    ArrayList<Integer> newNumbers17 = new ArrayList<>();
	    newNumbers17.add(60);
	    newNumbers17.add(70);
	    newNumbers17.add(80);
	    newNumbers17.add(90);
	    newNumbers17.add(100);
	    System.out.println(newNumbers17);
	    
	    numbers17.addAll(newNumbers17);
	    System.out.println(numbers17);
	    
	    numbers17.remove(0);//이건 index에 해당하는 값을 제거한 것.
	    System.out.println(numbers17);

	    
	    
		System.out.println("\n18. remove(Object o) ===============>  ");
		System.out.println(100);
		System.out.println(Integer.valueOf(100));
		numbers17.remove(Integer.valueOf(100));//이건 특정 값을 제거한 것.
		System.out.println(numbers17);
		
		

		System.out.println("\n19. removeAll(Collection<?> c)  ===============>  ");
		ArrayList<Integer> numbers19 = new ArrayList<>();
	    numbers19.add(10);
	    numbers19.add(20);
	    numbers19.add(30);
	    numbers19.add(40);
	    numbers19.add(50);
	    System.out.println(numbers19);
	    
	    ArrayList<Integer> newNumbers19 = new ArrayList<>();
	    newNumbers19.add(30);
	    newNumbers19.add(40);
	    System.out.println(newNumbers19);
	    
	    numbers19.removeAll(newNumbers19);
	    System.out.println(numbers19);

	    
	    
		System.out.println("\n21. removeIf(Predicate<? super E> filter) ===============>  ");
		ArrayList<Integer> numbers21 = new ArrayList<>();
	    numbers21.add(10);
	    numbers21.add(20);
	    numbers21.add(30);
	    numbers21.add(40);
	    numbers21.add(50);
	    System.out.println(numbers21);
	    
	    if (numbers21.removeIf(n -> n % 3 == 0)) {//알아서 반복문을 돌아서 제거해주나 보네
	        System.out.println(numbers21);
	    }

	    
	    
		System.out.println("\n22. replaceAll(UnaryOperator operator)  ===============>  ");
		ArrayList<Integer> numbers22 = new ArrayList<>();
	    numbers22.add(10);
	    numbers22.add(20);
	    numbers22.add(30);
	    numbers22.add(40);
	    numbers22.add(50);
	    System.out.println(numbers22);

	    ArrayList<Integer> newNumbers22 = new ArrayList<>();
	    newNumbers22.add(10);
	    newNumbers22.add(20);
	    newNumbers22.add(3);
	    newNumbers22.add(4);
	    newNumbers22.add(5);
	    System.out.println(newNumbers22);
	    
	    numbers22.retainAll(newNumbers22);//교집합을 남기라는 것
	    System.out.println(numbers22);

	    
	    
		System.out.println("\n23. set(int index, E element  ===============>  ");
		ArrayList<Integer> numbers23 = new ArrayList<>();
	    numbers23.add(10);
	    numbers23.add(20);
	    numbers23.add(30);
	    numbers23.add(40);
	    numbers23.add(50);
	    System.out.println(numbers23);
	    
	    numbers23.set(0, 100);
	    System.out.println(numbers23);

	    
	    
		System.out.println("\n24. size()  ===============>  ");
		ArrayList<Integer> numbers24 = new ArrayList<>();
	    numbers24.add(10);
	    numbers24.add(20);
	    numbers24.add(30);
	    numbers24.add(40);
	    numbers24.add(50);
	    for (int i = 0; i < numbers24.size(); i++) {
	        System.out.print(numbers24.get(i) + " ");
	    }
	    
	    

		System.out.println("\n\n25. sort(Comparator<? super E> c)  ===============>  ");
		ArrayList<Integer> numbers25 = new ArrayList<>();
	    numbers25.add(10);
	    numbers25.add(30);
	    numbers25.add(20);
	    numbers25.add(50);
	    numbers25.add(40);
	    System.out.println(numbers25);
	    
	    Collections.sort(numbers25);
	    System.out.println(numbers25);
	    
	    

		System.out.println("\n26. subList(int fromIndex, int toIndex)  ===============>  ");
		ArrayList<Integer> numbers26 = new ArrayList<>();
	    numbers26.add(10);
	    numbers26.add(20);
	    numbers26.add(30);
	    numbers26.add(40);
	    numbers26.add(50);
	    System.out.println(numbers26);

	    List<Integer> newNumbers26 = numbers26.subList(1,3);
	    System.out.println(newNumbers26);
	    
	    

		System.out.println("\n27. toArray()  ===============>  ");
		ArrayList<Integer> numbers27 = new ArrayList<>();
	    numbers27.add(10);
	    numbers27.add(20);
	    numbers27.add(30);
	    numbers27.add(40);
	    numbers27.add(50);

	    Integer[] array27 = numbers27.toArray(new Integer[numbers27.size()]);
	    for (int i = 0; i < array27.length; i++) {
	        System.out.print(array27[i] + " ");
	    }
	    
	    

		System.out.println("\n\n28. asList() ===============>  ");
		String[] array28 = new String[3];
	    array28[0] = "오늘은";
	    array28[1] = "즐거운";
	    array28[2] = "금요일";
	    ArrayList<String> friday = new ArrayList<>(Arrays.asList(array28));
	    friday.forEach(f -> System.out.print(f));
	    
	    
	    
	}//main

}








