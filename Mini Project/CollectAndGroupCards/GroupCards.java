
---

### ⚙️ Code: `GroupCards.java`
```java
package com.cards;

import java.util.*;

public class GroupCards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, List<Integer>> cardMap = new HashMap<>();

        System.out.print("Enter number of cards: ");
        int n = sc.nextInt();

        System.out.println("Enter card details (Symbol Value):");
        for (int i = 0; i < n; i++) {
            char symbol = sc.next().charAt(0);
            int value = sc.nextInt();

            // Add the value to the correct symbol list
            cardMap.computeIfAbsent(symbol, k -> new ArrayList<>()).add(value);
        }

        System.out.println("\n===== Grouped Cards =====");
        for (Map.Entry<Character, List<Integer>> entry : cardMap.entrySet()) {
            System.out.println("Symbol: " + entry.getKey() + " → Values: " + entry.getValue());
        }

        sc.close();
    }
}
