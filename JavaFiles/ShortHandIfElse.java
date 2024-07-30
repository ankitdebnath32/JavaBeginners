package JavaBeginners.JavaFiles;

public class ShortHandIfElse {
    public static void main(String[] args) {
        int time = 20;
        String result = (time<18) ? "Good day" : "Good Evening";
        System.out.println(result);

        int doorCode = 1234;
        if(doorCode == 1234){
        	
            System.out.println("Correct code! Door is open now.");
        }
        else{
            System.out.println("Wrong code! please try again.");
        }

        int myNum = 10;
        if(myNum > 0){
            System.out.println("the value is positive");
        } else if (myNum<0) {
            System.out.println("the value is negative");
        }else{
            System.out.println("the value is 0");
        }

        int num = 5;

        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

}
