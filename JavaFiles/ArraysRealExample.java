package JavaBeginners.JavaFiles;

public class ArraysRealExample {
    public static void main(String[] args) {
        int ages[] = {20,22,26,65,54,61, 41,};
        float avg, sum=0;
        int length = ages.length;
        int lowestAge = ages[0];

        for (int age:ages){
            if(lowestAge>age){
                lowestAge = age;
            }
        }
        System.out.println("The lowest age is: "+ lowestAge);
    }
}
