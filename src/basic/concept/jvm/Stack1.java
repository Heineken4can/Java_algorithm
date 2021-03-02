package basic.concept.jvm;
//https://yaboong.github.io/java/2018/05/26/java-memory-management/
public class Stack1 {
	
	    public static void main(String[] args) {
	        int argument = 4;//1.JVM의 stack 영역
	        System.out.println("main 1: " + argument);
	        argument = someOperation(argument);//2.
	        System.out.println("main 2: " + argument);
	    }

	    private static int someOperation(int param){
	        int tmp = param * 3;
	        int result = tmp / 2;
	        System.out.println("someOper : " + param);
	        System.out.println("someOper : " + tmp);
	        System.out.println("someOper : " + result);
	        return result;
	    }
	
}
