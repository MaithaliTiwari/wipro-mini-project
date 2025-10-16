
---

### ⚙️ Code: `StringArrayListDemo.java`
```java
package com.stringlist;

import java.util.*;
import java.util.stream.Collectors;

public class StringArrayListDemo {

    private static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== String Operations Using ArrayList =====");
            System.out.println("1. Add String");
            System.out.println("2. Display All Strings");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse All Strings");
            System.out.println("6. Remove Duplicate Strings");
            System.out.println("7. Search and Remove a String");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addString(sc);
                case 2 -> displayStrings();
                case 3 -> convertToUpperCase();
                case 4 -> convertToLowerCase();
                case 5 -> reverseStrings();
                case 6 -> removeDuplicates();
                case 7 -> searchAndRemove(sc);
                case 8 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 8);

        sc.close();
    }

    private static void addString(Scanner sc) {
        System.out.print("Enter string to add: ");
        String str = sc.nextLine();
        stringList.add(str);
        System.out.println("✅ String added successfully!");
    }

    private static void displayStrings() {
        if (stringList.isEmpty()) {
            System.out.println("⚠️ No strings available!");
            return;
        }
        System.out.println("\n--- Strings in List ---");
        stringList.forEach(System.out::println);
    }

    private static void convertToUpperCase() {
        if (stringList.isEmpty()) {
            System.out.println("⚠️ No strings available!");
            return;
        }
        stringList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("🔠 Converted all strings to UPPERCASE.");
    }

    private static void convertToLowerCase() {
        if (stringList.isEmpty()) {
            System.out.println("⚠️ No strings available!");
            return;
        }
        stringList = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("🔡 Converted all strings to lowercase.");
    }

    private static void reverseStrings() {
        if (stringList.isEmpty()) {
            System.out.println("⚠️ No strings available!");
            return;
        }

        List<String> reversedList = new ArrayList<>();
        for (String s : stringList) {
            reversedList.add(new StringBuilder(s).reverse().toString());
        }
        stringList = reversedList;
        System.out.println("🔁 All strings reversed successfully!");
    }

    private static void removeDuplicates() {
        if (stringList.isEmpty()) {
            System.out.println("⚠️ No strings available!");
            return;
        }
        Set<String> uniqueSet = new LinkedHashSet<>(stringList);
        stringList = new ArrayList<>(uniqueSet);
        System.out.println("♻️ Duplicates removed successfully!");
    }

    private static void searchAndRemove(Scanner sc) {
        System.out.print("Enter string to search & remove: ");
        String search = sc.nextLine();
        if (stringList.remove(search)) {
            System.out.println("🗑️ String removed successfully!");
        } else {
            System.out.println("❌ String not found!");
        }
    }
}
