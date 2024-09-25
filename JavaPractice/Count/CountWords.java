package JavaPractice.Count;

public class CountWords {
    public static void main(String[] args) {
        String words = "One Two three Four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
