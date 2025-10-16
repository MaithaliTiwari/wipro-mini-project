package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterPalindromes {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "madam", "level", "hello", "racecar", "world", "noon", "java", "rotator"));

        // Predicate to check if a word is a palindrome
        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };

        List<String> palindromes = words.stream()
                                        .filter(isPalindrome)
                                        .collect(Collectors.toList());
        
        System.out.println("Original words: " + words);
        System.out.println("Palindrome words: " + palindromes);
    }
}
