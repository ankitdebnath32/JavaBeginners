package JavaPractice;

import java.util.Arrays;

public class AyyarSorting {
    public static void main(String[] args) {
        String[] cars = {"Toyota", "Honda", "BMW", "Mercedes", "Ford", "Audi", "Tesla"};
        Arrays.sort(cars);
        for(String i: cars){
            System.out.println(i);
        }
    }
}
