package JavaFiles.Collections;

import java.util.HashMap;

public class Has_hMap {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Ankit", 27);
        people.put("Sunam", 28);
        people.put("Gondu", 27);
        System.out.println(people);

        for(String i:people.keySet()){
            System.out.println("Key: "+ i + " Value: " + people.get(i));
        }
    }
}
