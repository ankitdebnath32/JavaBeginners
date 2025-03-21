package JavaFiles.Java8Full.lambda.Comparator;

import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(2, "Ankit");
        map.put(1, "Sima");
        map.put(4, "Golu");
        map.put(3, "Karan");

        System.out.println("Before manual sorting " + map);

        Map<Integer, String> m = new TreeMap<>((a,b) -> b-a);

        m.put(2, "Ankit");
        m.put(1, "Sima");
        m.put(4, "Golu");
        m.put(3, "Karan");
        System.out.println(m);
    }
}
