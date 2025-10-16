package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountryCapitalHashMap {
    private HashMap<String, String> M1 = new HashMap<>();

    // Method 1: Save country and capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Method 2: Get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Method 3: Get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Method 4: Create a new map with capital as key and country as value
    public HashMap<String, String> createSwappedMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // Method 5: Create an ArrayList of country names
    public ArrayList<String> getCountryNames() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryCapitalHashMap mapManager = new CountryCapitalHashMap();
        mapManager.saveCountryCapital("India", "Delhi");
        mapManager.saveCountryCapital("Japan", "Tokyo");
        mapManager.saveCountryCapital("France", "Paris");

        System.out.println("Capital of India: " + mapManager.getCapital("India"));
        System.out.println("Country with capital Tokyo: " + mapManager.getCountry("Tokyo"));

        System.out.println("\nOriginal Map (M1): " + mapManager.M1);

        HashMap<String, String> swappedMap = mapManager.createSwappedMap();
        System.out.println("Swapped Map (M2): " + swappedMap);

        ArrayList<String> countries = mapManager.getCountryNames();
        System.out.println("\nArrayList of Countries: " + countries);
    }
}
