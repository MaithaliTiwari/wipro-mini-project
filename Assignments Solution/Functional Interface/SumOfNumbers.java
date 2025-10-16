package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SumOfNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // A Function that takes a List of Integers and returns their sum
        Function<List<Integer>, Integer> calculateSum = list -> list.stream().mapToInt(Integer::intValue).sum();
        
        int totalSum = calculateSum.apply(numbers);

        System.out.println("The list of numbers is: " + numbers);
        System.out.println("The sum of all elements is: " + totalSum);
    }
}
