package Map;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;

public class CountryCapitalTreeMap {
    // Using TreeMap instead of HashMap
    private TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }
    
    // ... all other methods are the same as in CountryCapitalHashMap ...
    // ... so you can copy them here directly ...

    public static void main(String[] args) {
        CountryCapitalTreeMap mapManager = new CountryCapitalTreeMap();
        mapManager.saveCountryCapital("India", "Delhi");
        mapManager.saveCountryCapital("Japan", "Tokyo");
        mapManager.saveCountryCapital("France", "Paris");
        mapManager.saveCountryCapital("Australia", "Canberra");

        // The output will be sorted alphabetically by key (country name)
        System.out.println("Original Map (M1 - Sorted): " + mapManager.M1);
    }
}
