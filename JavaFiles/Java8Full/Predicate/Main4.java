package JavaFiles.Java8Full.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main4 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 ==0;
        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';
//        Predicate<String> and = startsWithLetterV.and(endsWithLetterL);
//        System.out.println(startsWithLetterV.negate().test("Vipil"));


    }

    private static class Student{}
}
