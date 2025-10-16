package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactListHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> contactList = new HashMap<>();
        contactList.put("Amit", 987654321);
        contactList.put("Sunita", 987123456);
        contactList.put("Rahul", 998877665);

        // a) Check if a particular key exists
        System.out.println("Does the contact list have 'Rahul'? " + contactList.containsKey("Rahul"));
        System.out.println("Does the contact list have 'Priya'? " + contactList.containsKey("Priya"));

        // b) Check if a particular value exists
        System.out.println("\nDoes any contact have the number 987654321? " + contactList.containsValue(987654321));
        System.out.println("Does any contact have the number 112233445? " + contactList.containsValue(112233445));
        
        // c) Use Iterator to loop through the map
        System.out.println("\n--- Contact List ---");
        Iterator<Map.Entry<String, Integer>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
