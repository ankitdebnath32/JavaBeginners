package JavaFiles.Class.constructor;

import java.util.ArrayList;
import java.util.Iterator;

public class Itera_tor {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("volvo");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Mazada");
        cars.add("Suzuki");

        Iterator<String> it = cars.iterator();
        System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
