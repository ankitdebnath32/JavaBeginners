package JavaPractice;

public class StrToArr {
    public static void main(String[] args) {
        String myStr = "Ankit";

        char[] myArray = myStr.toCharArray();

//        System.out.println(myArray);
        for(char i : myArray){
            System.out.println(i);
        }
    }
}
