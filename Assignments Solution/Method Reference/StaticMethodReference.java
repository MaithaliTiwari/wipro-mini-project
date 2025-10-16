package MethodReference;

// Functional Interface
@FunctionalInterface
interface DigitCountInterface {
    int count(int n);
}

class DigitCounter {
    // Static method to count the number of digits
    public static int digitCount(int n) {
        // Convert to string and get length, handles 0 correctly
        return String.valueOf(Math.abs(n)).length();
    }
}

public class StaticMethodReference {
    public static void main(String[] args) {
        // Create a reference to the static method 'digitCount'
        DigitCountInterface digitCountRef = DigitCounter::digitCount;

        // Invoke the method through the reference
        int number = 12345;
        int count = digitCountRef.count(number);
        System.out.println("Number of digits in " + number + " is: " + count);

        int anotherNumber = -987;
        int anotherCount = digitCountRef.count(anotherNumber);
        System.out.println("Number of digits in " + anotherNumber + " is: " + anotherCount);
    }
}
