package LambdaExpressions;

import java.util.ArrayList;

public class OddLengthStrings {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Banana");
        al.add("Cat");
        al.add("Dog");
        al.add("Elephant");
        al.add("Fox");
        al.add("Giraffe");
        al.add("Horse");
        al.add("Iguana");
        al.add("Jaguar");

        System.out.println("Original List: " + al);
        System.out.println("\nStrings with odd length:");

        // Use stream().filter() with a lambda to find odd length strings
        al.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(System.out::println);
    }
}
