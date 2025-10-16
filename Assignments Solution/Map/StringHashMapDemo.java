package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringHashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // a) Check if a particular key exists
        System.out.println("Does map contain key 'key2'? " + map.containsKey("key2"));
        System.out.println("Does map contain key 'key4'? " + map.containsKey("key4"));

        // b) Check if a particular value exists
        System.out.println("\nDoes map contain value 'value3'? " + map.containsValue("value3"));
        System.out.println("Does map contain value 'value5'? " + map.containsValue("value5"));

        // c) Use Iterator to loop through the map
        System.out.println("\nIterating through the map:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
