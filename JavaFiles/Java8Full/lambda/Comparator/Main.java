package JavaFiles.Java8Full.lambda.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(65);
        list.add(3);
        Collections.sort(list, (a,b) -> b - a);
        System.out.println(list);
    }
}
