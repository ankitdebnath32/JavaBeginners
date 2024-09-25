package JavaPractice;

public class SmallestElem {
    public static void main(String[] args) {
        int[] ages = {40, 50, 60, 10, 20, 30, 70, 80, 90, 100};

        int lowestAge = ages[0];
        for(int age:ages){
            if(lowestAge>age){
                lowestAge = age;
            }
        }

        System.out.println(lowestAge);
    }
}
