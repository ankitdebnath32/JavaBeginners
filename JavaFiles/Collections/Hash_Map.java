package JavaFiles.Collections;

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("France", "Paris");
        capitalCities.put("Italy", "Rome");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }
        for(String i : capitalCities.values()){
            System.out.println(i);
        }
        for(String i : capitalCities.keySet()){
            System.out.println("Key: " + i + " value: " + capitalCities.get(i));
        }
    }
}
