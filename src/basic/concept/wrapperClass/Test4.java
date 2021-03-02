package basic.concept.wrapperClass;

public class Test4 {
	   public static void main(String[] args)  {
	    	
	    	System.out.println("Start =====>");
	    	
	    	
	    	// 1) int to String 으로 바꾸는 3가지 방법 
	    	int i = 13;
	    	String str = Integer.toString(i);
	    	String str2 = "" + i;
	    	String str22 = String.valueOf(i);
	    	System.out.println("1 : " + i);
	    	System.out.println("1 : " + str);
	    	System.out.println("1 : " + str2);
	    	System.out.println("1 : " + str22);
	    	System.out.println();
	    	
	    	// 2) String to int 으로 바꾸기 
	    	String str3 = "13";
	    	int i2 = Integer.parseInt(str3);
	    	int i3 = Integer.valueOf(str3).intValue();
	    	System.out.println("2 : " + str3);
	    	System.out.println("2 : " + i2);
	    	System.out.println("2 : " + i3);
	    	System.out.println("22 : " + Integer.valueOf(str3));
	    	System.out.println("22 : " + Integer.valueOf(str3).intValue());
	    	System.out.println();
	    	
	    	
	    	// 3) String--> int, 
	    	//    String --> Integer --> int, 
	    	//    String --> Integer, 
	    	int i4 = Integer.parseInt("145");
	    	int i5 = Integer.valueOf("145");
	    	Integer i6 = Integer.valueOf("145");
	    	System.out.println("3 : " + i4);
	    	System.out.println("3 : " + i5);
	    	System.out.println("3 : " + i6);
	    	System.out.println();
	    	
	    	
	    	
	    	// 4) Integer --> String
	    	Integer integerTmp = new Integer(67);
	    	String str4 = Integer.toString(integerTmp);
	    	int intTmp2 = integerTmp;
	    	
	    	System.out.println("4 : " + integerTmp);
	    	System.out.println("4 : " + str4);
	    	System.out.println("4 : " + (integerTmp == intTmp2));
	    	System.out.println();
	    	
	   }
}
