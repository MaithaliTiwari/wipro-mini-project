package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class PrintOddEven {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Consumer to display if a number is odd or even
        Consumer<Integer> oddEvenConsumer = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " even");
            } else {
                System.out.println(n + " odd");
            }
        };

        System.out.println("Checking numbers for odd/even:");
        numbers.forEach(oddEvenConsumer);
    }
}
