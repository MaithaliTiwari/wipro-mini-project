package FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class GeneratePrimeNumbers {

    // Helper method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Supplier that generates and returns an ArrayList of the first 10 prime numbers
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;
            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }
            return primes;
        };

        // Get the list of primes from the supplier
        ArrayList<Integer> firstTenPrimes = primeSupplier.get();
        System.out.println("The first 10 prime numbers are: " + firstTenPrimes);
    }
}
