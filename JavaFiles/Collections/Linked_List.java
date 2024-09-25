package JavaFiles.Collections;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("volvo");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Mazda");
        cars.add("Suzuki");

        cars.addFirst("Aston Martin");
        cars.addLast("Maserati");
        cars.removeFirst();
        cars.removeLast();
        cars.getFirst();
        cars.getLast();

        Collections.sort(cars);
        Collections.sort(cars, Collections.reverseOrder());

        for(String i:cars){
            System.out.println(i);
        }
        System.out.println(cars);
    }
}
