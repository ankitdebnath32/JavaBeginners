package JavaFiles.Java8Full.Predicate;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();

//        int sum2 = 0;
//        for(int number : numbers){
//            if(number % 2 == 0){
//                sum2 += number;
//            }
//        }
    }
}
