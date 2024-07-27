package JavaBeginners.JavaFiles;

public class TypeCast {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;
        double myDoub = 12.0d;
        int myIn = (int)myDoub;

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myDoub);
        System.out.println(myIn);

        int maxScore = 500;
        int userScore = 423;

        float percentage = (float)userScore / maxScore * 100.0f;
        System.out.println("The percentage is: "+ percentage);

    }
}
