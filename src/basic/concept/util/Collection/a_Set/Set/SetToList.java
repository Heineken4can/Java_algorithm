package basic.concept.util.Collection.a_Set.Set;
//https://codechacha.com/ko/java-convert-set-to-list-and-list-to-set/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetToList {

	public static void main(String[] args) {

		/*
		 * List를 Set로 변환 Set를 생성할 때 인자로 List를 전달하면 됩니다.
		 */
		System.out.println("\n\n1.  ============>");
		List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
		Set<Integer> targetSet = new HashSet<>(sourceList);
		System.out.println(sourceList);
		System.out.println(targetSet);

				
		/*
		 * List를 Set로 변환 (Guava) Guava는 Lists, Sets라는 Util 클래스를 제공합니다. 이것을 이용하면 간단한 코드로
		 * List를 생성하고 Set로 변환할 수 있습니다.
		 */ 
		System.out.println("\n\n2.  ============>");
		//List<Integer> sourceList2 = Lists.newArrayList(0, 1, 2, 3, 4, 5); 에러나네;;
		//Set<Integer> targetSet2 = Sets.newHashSet(sourceList2);

						
		/*
		 * Set를 List로 변환 List를 생성할 때 인자로 Set를 전달하면 됩니다.
		 */ 
		System.out.println("\n\n3.  ============>");
		Set<Integer> sourceSet3 = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5));
		List<Integer> targetList3 = new ArrayList<>(sourceSet3);
		System.out.println(sourceSet3);
		System.out.println(targetList3);
		
				
		/*
		 * Set를 List로 변환 (Guava) Guava의 Lists, Sets를 이용하면 쉽게 생성 및 변환이 가능합니다.
		 */ 
		System.out.println("\n\n4.  ============>");
		//Set<Integer> sourceSet4 = Sets.newHashSet(0, 1, 2, 3, 4, 5);
		//List<Integer> targetList4 = Lists.newArrayList(sourceSet);

				
		/*
		 * Array를 Set로 변환 Stream을 이용하면 Array를 Set로 변환할 수 있습니다.
		 */ 
		System.out.println("\n\n5.  ============>");
		Integer[] array5 = { 1, 2, 3 };
		Set<Integer> set5 = Arrays.stream(array5).collect(Collectors.toSet());
		System.out.println(Arrays.toString(array5));
		System.out.println(set5);
		// Set: [1, 2, 3]

				
		/*
		 * Set를 Array로 변환 Set.toArray()를 이용하면 Set를 Array로 쉽게 변환할 수 있습니다.
		 */ 
		System.out.println("\n\n6.  ============>");
		//Set<Integer> set6 = Sets.newHashSet(1, 2, 3);
		//Integer[] array6 = new Integer[set.size()];

		//set.toArray(array);
		//System.out.println("Array: " + Arrays.toString(array));
		// Array: [1, 2, 3]

				
		/*
		 * Array를 List로 변환 Stream을 이용하면 Array를 List로 변환할 수 있습니다.
		 */ 
		System.out.println("\n\n7.  ============>");
		Integer[] array7 = { 1, 2, 3 };
		List<Integer> list7 = Arrays.stream(array7).collect(Collectors.toList());
		System.out.println(Arrays.toString(array7));
		System.out.println(list7);
		
		
		/*
		 * List를 Array로 변환 List.toArray()를 이용하면 List를 Array로 쉽게 변환할 수 있습니다.
		 */
		System.out.println("\n\n8.  ============>");
		List<Integer> list8 = Arrays.asList(1, 2, 3);
		Integer[] array8 = new Integer[list8.size()];
		System.out.println(list8);
		System.out.println(Arrays.toString(array8));
		
		list8.toArray(array8);
		System.out.println(list8);
		System.out.println(Arrays.toString(array8));
		
	}
}
