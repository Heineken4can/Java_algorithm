package basic.concept.jvm;

public class Stack4_immutableString {

	public static void main(String[] args) {
		String s = "hello";
		changeString(s);
		System.out.println(s);
	}

	public static void changeString(String param) {
		param += " world";
		System.out.println("param : " + param);
	}

}
