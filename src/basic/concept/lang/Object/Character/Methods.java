package basic.concept.lang.Object.Character;
//https://www.tutorialspoint.com/java/lang/java_lang_character.htm

//https://www.tutorialspoint.com/java/lang/character_isletter.htm

public class Methods {

	public static void main(String[] args) {

		// create 2 char primitives ch1, ch2
		char ch1, ch2, ch3, ch4;

		// assign values to ch1, ch2
		ch1 = 'A';
		ch2 = '9';
		System.out.println("1 =========>");
		System.out.println(ch1);
		System.out.println(ch2);

		// create 2 boolean primitives b1, b2
		boolean b1, b2, b3;

		// check if ch1, ch2 are letter or not and assign results to b1, b2
		b1 = Character.isLetter(ch1);
		b2 = Character.isLetter(ch2);
		System.out.println("\n2 =========>");
		System.out.println(b1);
		System.out.println(b2);

		ch1 = 'A';
		ch2 = 'a';
		b1 = Character.isLowerCase(ch1);
		b2 = Character.isLowerCase(ch2);
		System.out.println("\n3 =========>");
		System.out.println(b1);
		System.out.println(b2);

		ch1 = 'K';
		ch2 = '\u0e16'; // represents THAI CHARACTER THO THUNG
		ch3 = 'k';
		b1 = Character.isUpperCase(ch1);
		b2 = Character.isUpperCase(ch2);
		b3 = Character.isUpperCase(ch3);
		System.out.println("\n4 =========>");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		ch1 = 'P';
		ch2 = 'S';
		ch3 = Character.toLowerCase(ch1);
		ch4 = Character.toLowerCase(ch2);
		System.out.println("\n5 =========>");
		System.out.println(ch3);
		System.out.println(ch4);

		ch1 = 's';
		ch2 = 'p';
		ch3 = Character.toUpperCase(ch1);
		ch4 = Character.toUpperCase(ch2);
		System.out.println("\n6 =========>");
		System.out.println(ch3);
		System.out.println(ch4);

		
		
		// initialize 3 boolean primitive
		char firstValue = 'c';
		char secondValue = 'c';
		char thirdValue = 'e';
		//Character.compare는 두 매개변수의 값을 빼줌. 0이 나오면 같다는 것!! 
		int compareOneTwo = Character.compare(firstValue, secondValue);

		// compare the first char to the third
		int compareOneThree = Character.compare(firstValue, thirdValue);
		System.out.println("\n7 =========>");
		System.out.println(compareOneTwo);
		System.out.println(compareOneThree);
		
		
		
		char ctmp = 'a';
		String strtmp = Character.toString(ctmp);
		System.out.println("\n8 =========>");
		System.out.println(ctmp);
		System.out.println(strtmp);
	
	
	}

}
