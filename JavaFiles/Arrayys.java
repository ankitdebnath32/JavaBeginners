package JavaBeginners.JavaFiles;

import java.util.Arrays;

public class Arrayys {
    public static void main(String[] args) {
        String[] cars = {"Volvo","Audi","BMW","Lambo","Mercedes"};
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[1]);
        cars[0] = "Ferrari";
        System.out.println(Arrays.toString(cars));
        System.out.println(cars.length);
//        for (int i = 0; i< cars.length;i++){
//            System.out.println(cars[i]);
//        }

        for(String i : cars){
            System.out.println(i);
        }
    }
}
