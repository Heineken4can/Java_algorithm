package basic.concept.lang.Object.String;
//http://theeye.pe.kr/archives/457

public class StringToInt {

	public static void main(String[] args) {


		
		System.out.println("\n1. int to String ============>");
		int i1 = 43;
		String str1 = Integer.toString(i1); // 방법 1
		String str11 = "" + i1;             // 방법 2
		String str111 = String.valueOf(i1); // 방법 3
		System.out.println(i1);
		System.out.println(str1);
		System.out.println(str11);
		System.out.println(str111);
		

		System.out.println("\n2. String to int ============>");
		int i2 = Integer.valueOf(str1).intValue();
		System.out.println(i2);
		System.out.println(str1);
		
		
		
		System.out.println("\n3. double to String ============>");
		double d = 1.1;
		String str3 = Double.toString(d);
		System.out.println(d);
		System.out.println(str3);
		
		
		System.out.println("\n4. long to String ============>");
		long l = 1;
		String str4 = Long.toString(l);
		System.out.println(l);
		System.out.println(str4);
		
		
		System.out.println("\n5. float to String ============>");
		float f = 4;
		String str5 = Float.toString(f);
		System.out.println(f);
		System.out.println(str5);
		
		
		System.out.println("\n6. String to double ============>");
		String str6 = "35";
		double d6 = Double.valueOf(str6).doubleValue();
		System.out.println(d6);
		System.out.println(str6);
		
		
		System.out.println("\n7. String to long ============>");
		String str7 = "7";
		long l7 = Long.valueOf(str7).longValue();
		long l77 = Long.parseLong(str7);
		System.out.println(l7);
		System.out.println(l77);
		System.out.println(str7);
		
		
		System.out.println("\n8. String to float ============>");
		String str8 = "8";
		float f8 = Float.valueOf(str8).floatValue();
		System.out.println(f8);
		System.out.println(str8);
		
		
		System.out.println("\n9. decimal to binary ============>");	
		int i9 = 9;
		String binstr = Integer.toBinaryString(i9);
		System.out.println(i9);
		System.out.println(binstr);
		
		
		System.out.println("\n10. decimal to hexadecimal ============>");
		int i10 = 10;
		String hexstr1 = Integer.toString(i10, 16);
		String hexstr2 = Integer.toHexString(i10);
		Integer.toHexString( 0x10000 | i10).substring(1).toUpperCase();
		System.out.println(hexstr1);
		System.out.println(hexstr2);
		System.out.println(i10);
		
		
		System.out.println("\n11. hexadecimal(String) to int ============>");		
		int i11 = Integer.valueOf("B8DA3", 16).intValue();
		int i111 = Integer.parseInt("B8DA3", 16);
		System.out.println(i11);
		System.out.println(i111);
		
		
		System.out.println("\n12. ASCII Code to String ============>");
		//String char12 = new Character((char12)).toString();
		
		
		System.out.println("\n13. Integer to ASCII Code ============>");
		//int i = (int) c;
		
		
		System.out.println("\n14. Integer to boolean ============>");
		int i14 = 14;
		boolean b14 = (i14 != 0);
		System.out.println(i14);
		System.out.println(b14);
		
		
		System.out.println("\n15. boolean to Integer ============>");
		boolean b15 = true;
		int i15 = (b15)? 1 : 0;
		System.out.println(i15);
		System.out.println(b15);
		
		
		
		
	}
}
