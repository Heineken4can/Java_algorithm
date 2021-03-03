package basic.concept.util.Collection.opentutorial;
//https://opentutorials.org/course/1223/6446
//배열과 ArrayList의 차이점.


import java.util.ArrayList;

public class ArrayListDemo {
 
    public static void main(String[] args) {
    	
    	// 1] 배열 
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다.
        System.out.println("1] =====>");
        System.out.println("1 : "+ arrayObj.toString());//1 : [Ljava.lang.String;@2401f4c3
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }
         
        // 2] ArrayList - 제네릭 없이 - 옛날 방식
        ArrayList al = new ArrayList();
        al.add("one");
        al.add("two");
        al.add("three");
        System.out.println("2] =====>");
        System.out.println("1 : "+ al);//1 : [one, two, three]
        System.out.println("2 : "+ al.toString());//2 : [one, two, three]
        for(int i=0; i<al.size(); i++){
        	//방법1
            System.out.println("21 : "+al.get(i));
            
            //방법2
            //String val = al.get(i); //컴파일 오류 발생.
            //이유:ArrayList의 add메소드는 인자가 object이기 때문에. 
            String val = (String)al.get(i);//형변환 해줘야 함. 
            System.out.println("22 : "+val);
        }
        
        // 3] ArrayList - 제네릭 있음.
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("one");
        al2.add("two");
        al2.add("three");
        System.out.println("3] =====>");
        for(int i=0; i<al2.size(); i++){
            System.out.println("31 : "+al2.get(i));
            
            String val = al2.get(i);
            System.out.println("32 : "+val);
        }
        
        
        
        
        
        
        
        
        
    }//main
 
}