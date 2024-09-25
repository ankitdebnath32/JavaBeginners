package JavaPractice.ArraySum;

public class SumArray {
    public static void main(String[] args) {
        int[] array = {1, 6, 5, 8, 20};
        int sum =0;

        for(int i = 0; i < array.length; i++){
            sum+=array[i];
        }

        System.out.println(sum);
    }
}
