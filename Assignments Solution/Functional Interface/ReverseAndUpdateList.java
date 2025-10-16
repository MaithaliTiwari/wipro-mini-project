package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ReverseAndUpdateList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "hello", "world", "java", "functional", "interface", 
                "consumer", "stream", "lambda", "predicate", "supplier"));

        System.out.println("Original List: " + words);

        // This is a way to use a Consumer-like action to modify the list in place.
        // We iterate through indices and then use list.set() to update the element.
        for (int i = 0; i < words.size(); i++) {
            // Effectively using a consumer action for each element
            int index = i; // final or effectively final variable for lambda
            String word = words.get(index);
            String reversedWord = new StringBuilder(word).reverse().toString();
            words.set(index, reversedWord);
        }

        System.out.println("Updated List with Reversed Words: " + words);
    }
}
