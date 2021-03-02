package basic.concept.jvm;

import java.util.ArrayList;
import java.util.List;
//https://yaboong.github.io/java/2018/05/26/java-memory-management/
public class Stack2_List {
    public static void main(String[] args) {
        List<String> listArgument = new ArrayList<>();
        listArgument.add("yaboong");
        listArgument.add("github");
        System.out.println("main 1: " +listArgument);
        print(listArgument);
        System.out.println("main 2: " +listArgument);
    }

    private static void print(List<String> listParam) {
        String value = listParam.get(0);
        listParam.add("io");//3번째 값을 추가함.
        System.out.println("print 1: " +value);
        System.out.println("print 2: " +listParam);
    }
}
