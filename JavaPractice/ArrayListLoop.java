package JavaPractice;

import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("Lamborghini");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Toyota");

        for (String i : cars){
            System.out.println(i);
        }
    }
}
