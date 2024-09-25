package JavaFiles.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arra_y {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("volvo");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Mazada");
        cars.add("Suzuki");

        cars.add(2,"Honda");
        cars.set(0, "Tata");
        cars.remove(1);

        Collections.sort(cars);
//        System.out.println(cars);
//        System.out.println(cars.get(0));
//        System.out.println(cars.size());

//        for(int i=0; i<= cars.size();i++){
//            System.out.println(cars.get(i));
//        }

        for(String i : cars){
            System.out.println(i);
        }
    }
}
