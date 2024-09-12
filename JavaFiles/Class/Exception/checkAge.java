package JavaBeginners.JavaFiles.Class.Exception;

public class checkAge {
    static void ageCheck(int age){
        if(age<18){
            throw new ArithmeticException("Access denied-You must me atleast 18 years old");
        }else{
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        ageCheck(20);
    }
}
