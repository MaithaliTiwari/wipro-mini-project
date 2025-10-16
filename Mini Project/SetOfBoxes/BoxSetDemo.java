package com.boxes;

import java.util.*;

public class BoxSetDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Box> boxSet = new HashSet<>();

        System.out.print("Enter number of boxes: ");
        int n = sc.nextInt();

        System.out.println("Enter dimensions (length width height):");
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
            int width = sc.nextInt();
            int height = sc.nextInt();
            Box box = new Box(length, width, height);
            boxSet.add(box);
        }

        System.out.println("\n===== Unique Boxes =====");
        for (Box b : boxSet) {
            System.out.println(b);
        }

        System.out.println("\nTotal Unique Boxes: " + boxSet.size());

        sc.close();
    }
}
