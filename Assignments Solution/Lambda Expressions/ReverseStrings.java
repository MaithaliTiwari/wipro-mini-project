package LambdaExpressions;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ReverseStrings {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
        al.add("Six");
        al.add("Seven");
        al.add("Eight");
        al.add("Nine");
        al.add("Ten");

        System.out.println("Original List: " + al);
        System.out.println("\nList printed in reverse order:");

        // Use an IntStream to create indices from last to first
        IntStream.range(0, al.size())
                 .map(i -> al.size() - 1 - i)
                 .mapToObj(al::get)
                 .forEach(System.out::println);
    }
}
