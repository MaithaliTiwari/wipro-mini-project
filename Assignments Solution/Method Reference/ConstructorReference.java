package MethodReference;

// Functional Interface
@FunctionalInterface
interface PrimeCheckerInterface {
    // The method signature matches the constructor we want to refer to
    PrimeChecker check(int n);
}

class PrimeChecker {
    // Helper method to check for prime
    private boolean isPrime(int number) {
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

    // Parameterized constructor
    public PrimeChecker(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        // Create a reference to the PrimeChecker constructor
        PrimeCheckerInterface primeCheckRef = PrimeChecker::new;

        // Invoke the constructor by calling the interface's method
        // This creates a new PrimeChecker object and runs the constructor logic
        System.out.println("Checking for number 17:");
        primeCheckRef.check(17);

        System.out.println("\nChecking for number 20:");
        primeCheckRef.check(20);
    }
}
