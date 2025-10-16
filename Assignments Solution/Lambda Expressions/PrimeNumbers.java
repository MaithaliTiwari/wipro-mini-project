package LambdaExpressions;

import java.util.ArrayList;
import java.util.Random;

public class PrimeNumbers {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100)); // Add random numbers between 0 and 99
        }

        System.out.println("Generated List: " + al);
        System.out.print("Prime numbers in the list are: ");

        // Using lambda expression to print prime numbers
        al.forEach(n -> {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        });
        System.out.println();
    }
}
