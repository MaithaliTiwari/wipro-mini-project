
---

### ⚙️ Code: `UniqueCardSymbols.java`
```java
package com.cards;

import java.util.*;

public class UniqueCardSymbols {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> uniqueSymbols = new HashSet<>();

        System.out.print("Enter number of cards: ");
        int n = sc.nextInt();

        System.out.println("Enter card symbols (one character each):");
        for (int i = 0; i < n; i++) {
            char symbol = sc.next().charAt(0);
            uniqueSymbols.add(symbol);
        }

        System.out.println("\n===== Result =====");
        System.out.println("Unique Symbols: " + uniqueSymbols);
        System.out.println("Count of Unique Symbols: " + uniqueSymbols.size());

        sc.close();
    }
}
