package basic.concept.util.Collection.a_Set.HashSet;
//https://reakwon.tistory.com/83

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetToArrayList {

	public static void main(String[] args) {

		System.out.println("\n\n1.  ============>");
		Set hashSet=new HashSet();
		hashSet.add("F");
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("A");
		hashSet.add("C");
	
		Iterator it=hashSet.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
		
		System.out.println("\n\n2.  ============>");
		/* 위와 같은 데이터들을 다시 add */
		hashSet.add("F");
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("A");
		hashSet.add("C");
		Iterator it2=hashSet.iterator();
		while(it2.hasNext()){
			System.out.print(it2.next()+" ");
		}
		
		

		System.out.println("\n\n3.  ============>");
		/* HasSet의 "C"라는 원소 삭제 */
		hashSet.remove("C");
		
		Iterator it3=hashSet.iterator();
		while(it3.hasNext()){
			System.out.print(it3.next()+" ");
		}
		
		
		
		
		System.out.println("\n\n4.  ============>");
		/* HashSet의 모든 원소를 ArrayList로 전달 */
		List arrayList=new ArrayList();
		arrayList.addAll(hashSet);
		for(int i=0;i<arrayList.size();i++){
			System.out.print(arrayList.get(i)+" ");
		}
		
	}
}
