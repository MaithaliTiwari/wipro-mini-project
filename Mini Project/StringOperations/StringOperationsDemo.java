
---

### ⚙️ Code: `StringOperationsDemo.java`
```java
package com.stringops;

import java.util.*;

public class StringOperationsDemo {

    private static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== String Operations Menu =====");
            System.out.println("1. Add String");
            System.out.println("2. Display All Strings");
            System.out.println("3. Search String");
            System.out.println("4. Sort Strings Alphabetically");
            System.out.println("5. Find Longest & Shortest String");
            System.out.println("6. Remove String");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addString(sc);
                case 2 -> displayStrings();
                case 3 -> searchString(sc);
                case 4 -> sortStrings();
                case 5 -> findLongestAndShortest();
                case 6 -> removeString(sc);
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);

        sc.close();
    }

    private static void addString(Scanner sc) {
        System.out.print("Enter string to add: ");
        String input = sc.nextLine();
        stringList.add(input);
        System.out.println("✅ String added successfully!");
    }

    private static void displayStrings() {
        if (stringList.isEmpty()) {
            System.out.println("⚠️ No strings available!");
            return;
        }
        System.out.println("\n--- List of Strings ---");
        stringList.forEach(System.out::println);
    }

    private static void searchString(Scanner sc) {
        System.out.print("Enter string to search: ");
        String search = sc.nextLine();
        if (stringList.contains(search)) {
            System.out.println("🔍 Found: " + search);
        } else {
            System.out.println("❌ String not found!");
        }
    }

    private static void sortStrings() {
        if (stringList.isEmpty()) {
            System.out.println("⚠️ No strings to sort!");
            return;
        }
        Collections.sort(stringList, String.CASE_INSENSITIVE_ORDER);
        System.out.println("📊 Strings sorted alphabetically:");
        stringList.forEach(System.out::println);
    }

    private static void findLongestAndShortest() {
        if (stringList.isEmpty()) {
            System.out.println("⚠️ No strings available!");
            return;
        }

        String longest = Collections.max(stringList, Comparator.comparingInt(String::length));
        String shortest = Collections.min(stringList, Comparator.comparingInt(String::length));

        System.out.println("🔹 Longest String: " + longest);
        System.out.println("🔸 Shortest String: " + shortest);
    }

    private static void removeString(Scanner sc) {
        System.out.print("Enter string to remove: ");
        String remove = sc.nextLine();
        if (stringList.remove(remove)) {
            System.out.println("🗑️ String removed successfully!");
        } else {
            System.out.println("❌ String not found!");
        }
    }
}
