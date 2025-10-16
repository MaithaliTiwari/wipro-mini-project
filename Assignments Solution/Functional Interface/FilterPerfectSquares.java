package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterPerfectSquares {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 9, 10, 16, 20, 25, 30, 36, 49, 50));

        // Predicate to check if a number is a perfect square
        Predicate<Integer> isPerfectSquare = n -> {
            if (n < 0) return false;
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        List<Integer> perfectSquares = numbers.stream()
                                            .filter(isPerfectSquare)
                                            .collect(Collectors.toList());

        System.out.println("Original numbers: " + numbers);
        System.out.println("Perfect square numbers: " + perfectSquares);
    }
}
