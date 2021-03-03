package basic.concept.lang.Object.Number.wrapperClass;

//http://theeye.pe.kr/archives/457
public class Test3 {

    public static void main(String[] args)  {
    	
    	System.out.println("Start =====>");
    	
    	
    	// 1) int to String
    	int i = 10;
    	String str = Integer.toString(i);
    	String str2 = "" + i;
    	System.out.println("1 : " + i);
    	System.out.println("1 : " + str);
    	System.out.println("1 : " + str2);
    	System.out.println();
    	
    	// 2) String to int
    	String str3 = "13";
    	int i2 = Integer.parseInt(str3);
    	int i3 = Integer.valueOf(str3).intValue();
    	System.out.println("2 : " + str3);
    	System.out.println("2 : " + i2);
    	System.out.println("2 : " + i3);
    	System.out.println("22 : " + Integer.valueOf(str3));
    	System.out.println("22 : " + Integer.valueOf(str3).intValue());
    	System.out.println();
    	
    	
    	//double to String
    	double d = 3.4;
    	String str4 = Double.toString(d);
    	System.out.println("3 : " + d);
    	System.out.println("3 : " + str4);
    	System.out.println();
    	
    	//long to String
    	long l = 333;
    	String str5 = Long.toString(l);
    	System.out.println("4 : " + l);
    	System.out.println("4 : " + str5);
    	System.out.println();
    	
    	//float to String
    	float f = -1;
    	String str6 = Float.toString(f);
    	System.out.println("5 : " + f);
    	System.out.println("5 : " + str6);
    	System.out.println();
    	
    	
    	
    	String str7 = "67";
    	//String to double
    	double d2 = Double.valueOf(str7).doubleValue();
    	System.out.println("6 : " + d2);
    	System.out.println();
    	
    	//String to long
    	long l2 = Long.valueOf(str7).longValue();
    	long l3 = Long.parseLong(str7);
    	System.out.println("6 : " + l2);
    	System.out.println("6 : " + l3);
    	System.out.println();
    	
    	//String to float
    	float f2 = Float.valueOf(str7).floatValue();
    	System.out.println("6 : " + f2);
    	System.out.println();
    	
    	
    }
}
