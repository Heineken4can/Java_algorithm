package basic.concept.jvm;

public class Stack3_test {
    public static void main(String[] args) {
        Integer a = 10;
        System.out.println("Before: " + a);
        changeInteger(a);
        System.out.println("After: " + a);
    }

    public static void changeInteger(Integer param) {
        param += 10;
        System.out.println("param : " + param);
    }
}
