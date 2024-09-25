package JavaFiles.Collections;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Mazda");
        cars.add("Suzuki");

        cars.remove("Volvo");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));
        System.out.println(cars.size());

        for(String i : cars){
            System.out.println(i);
        }
    }
}
