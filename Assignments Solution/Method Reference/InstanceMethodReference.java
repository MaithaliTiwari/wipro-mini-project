package MethodReference;

// Functional Interface
@FunctionalInterface
interface FactorialInterface {
    int calculate(int n);
}

class FactorialCalculator {
    // Instance method to calculate factorial
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class InstanceMethodReference {
    public static void main(String[] args) {
        // Create an instance of the class
        FactorialCalculator calculator = new FactorialCalculator();

        // Create a reference to the instance method 'factorial'
        FactorialInterface factorialRef = calculator::factorial;

        // Invoke the method through the reference
        int number = 5;
        int result = factorialRef.calculate(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
