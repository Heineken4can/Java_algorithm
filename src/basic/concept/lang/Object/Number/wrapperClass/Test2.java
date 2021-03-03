package basic.concept.lang.Object.Number.wrapperClass;

//https://coding-factory.tistory.com/547
public class Test2 {

    public static void main(String[] args)  {
    	
        Integer numtmp1 = new Integer(17); // 박싱 : 기본 타입 --> 래퍼 클래스
        int n = numtmp1.intValue(); //언박싱
        System.out.println("1 : "+numtmp1);
        System.out.println("1 : "+n);
        System.out.println();
        
        Integer numtmp2 = 17; // 자동 박싱, 자동으로 힙영역에 Integer객체 생성됨.
        int n2 = numtmp2; //자동 언박싱
        System.out.println("2 : "+numtmp2);
        System.out.println("2 : "+n2);
        System.out.println();
        
        
        //문자열을 기본 타입 값으로 변환
        String str = "10";
        String str2 = "10.5";
        String str3 = "true";
        
        byte b = Byte.parseByte(str);
        int i = Integer.parseInt(str);
        String strTmp = Integer.toString(i);
        short s = Short.parseShort(str);
        long l = Long.parseLong(str);
        float f = Float.parseFloat(str2);
        double d = Double.parseDouble(str2);
        boolean bool = Boolean.parseBoolean(str3);
		
        System.out.println("문자열 byte값 변환 : "+b);
        System.out.println("문자열 int값 변환 : "+i);
        System.out.println("문자열 <-- int값 변환 : "+strTmp);
        System.out.println("문자열 short값 변환 : "+s);
        System.out.println("문자열 long값 변환 : "+l);
        System.out.println("문자열 float값 변환 : "+f);
        System.out.println("문자열 double값 변환 : "+d);
        System.out.println("문자열 boolean값 변환 : "+bool);
        System.out.println();
        
        
        Integer num = new Integer(10); //래퍼 클래스1
        Integer num2 = new Integer(10); //래퍼 클래스2
        int i2 = 10; //기본타입
		 
        //래퍼클래스와 기본타입을 비교할 때에는('=='나 'euqals()' 둘다) 값(value)을 비교해 주는군
        System.out.println("래퍼클래스 == 기본타입 : "+(num == i2)); //true
        System.out.println("래퍼클래스.equals(기본타입) : "+num.equals(i2)); //true
        
        //래퍼클래스끼리 비교할 때는 정확히 파악해야 함. == 비교는 num변수의 주소값 비교하는 것.
        System.out.println("래퍼클래스 == 래퍼클래스 : "+(num == num2)); //false
        System.out.println("래퍼클래스.equals(래퍼클래스) : "+num.equals(num2)); //true
    
        
        
        
    }
}
