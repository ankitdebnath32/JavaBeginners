package JavaPractice;

public class ArrayAvg {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        float avg, sum = 0;

        int length = numbers.length;

        float sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        float avg = sum / length;
        System.out.println(avg);
    }
}
