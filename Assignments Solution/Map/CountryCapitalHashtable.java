package Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class CountryCapitalHashtable {
    // Using Hashtable instead of HashMap
    private Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }
    
    // ... all other methods are the same as in CountryCapitalHashMap ...
    // ... so you can copy them here directly ...

    public static void main(String[] args) {
        CountryCapitalHashtable mapManager = new CountryCapitalHashtable();
        mapManager.saveCountryCapital("India", "Delhi");
        mapManager.saveCountryCapital("Japan", "Tokyo");
        mapManager.saveCountryCapital("France", "Paris");

        System.out.println("Original Map (M1 - Hashtable): " + mapManager.M1);
        System.out.println("Capital of Japan: " + mapManager.getCapital("Japan"));
    }
}
