package Set;

import java.util.TreeSet;
import java.util.Iterator;

public class StringTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");

        System.out.println("Original TreeSet (Sorted): " + treeSet);

        // a) Reverse the elements
        // The descendingSet() method returns a reverse order view of the set
        System.out.println("Reversed TreeSet: " + treeSet.descendingSet());

        // b) Iterate the elements
        System.out.println("\nIterating through the TreeSet:");
        Iterator<String> it = treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // c) Check if a particular element exists
        String elementToCheck = "Banana";
        System.out.println("\nDoes the set contain '" + elementToCheck + "'? " + treeSet.contains(elementToCheck));

        String anotherElement = "Mango";
        System.out.println("Does the set contain '" + anotherElement + "'? " + treeSet.contains(anotherElement));
    }
}
