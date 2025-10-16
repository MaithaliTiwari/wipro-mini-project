package Set;

import java.util.TreeSet;
import java.util.Iterator;

public class CountryTreeSet {
    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String CountryName) {
        T1.add(CountryName);
        return T1;
    }

    public String getCountry(String CountryName) {
        if (T1.contains(CountryName)) {
            return CountryName;
        }
        return null;
    }

    public static void main(String[] args) {
        CountryTreeSet countries = new CountryTreeSet();
        countries.saveCountryNames("India");
        countries.saveCountryNames("USA");
        countries.saveCountryNames("Canada");
        countries.saveCountryNames("Australia");

        System.out.println("Current countries in TreeSet: " + countries.T1);
        System.out.println("Finding 'India': " + countries.getCountry("India"));
        System.out.println("Finding 'Japan': " + countries.getCountry("Japan"));
    }
}
