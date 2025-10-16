package Set;

import java.util.HashSet;
import java.util.Iterator;

public class CountryHashSet {
    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            String country = it.next();
            if (country.equals(CountryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CountryHashSet countries = new CountryHashSet();
        countries.saveCountryNames("India");
        countries.saveCountryNames("USA");
        countries.saveCountryNames("Canada");
        countries.saveCountryNames("Australia");

        System.out.println("Finding 'India': " + countries.getCountry("India"));
        System.out.println("Finding 'Japan': " + countries.getCountry("Japan"));
    }
}
