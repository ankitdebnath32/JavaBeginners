package JavaBeginners.JavaFiles.Method;

public class Overloading {
    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return  x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8,5);
        double myNum2 = plusMethod(4.8,7.86);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
