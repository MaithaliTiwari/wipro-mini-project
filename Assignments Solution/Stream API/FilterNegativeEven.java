package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterNegativeEven {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, -5, -8, 20, -12, 15, -2, 7));

        System.out.println("Original List: " + numbers);

        // 1. Filter the negative even numbers
        // 2. Store them into a new ArrayList
        ArrayList<Integer> negativeEvenNumbers = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        // 3. Print the ArrayList elements
        System.out.println("Filtered List (Negative Even Numbers): " + negativeEvenNumbers);
    }
}
