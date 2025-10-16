package Map;

import java.util.Properties;
import java.util.Iterator;
import java.util.Map;

public class IndianStatesProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("Maharashtra", "Mumbai");
        properties.setProperty("Karnataka", "Bengaluru");
        properties.setProperty("Tamil Nadu", "Chennai");

        System.out.println("States and their Capitals:");

        Iterator<Map.Entry<Object, Object>> it = properties.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
