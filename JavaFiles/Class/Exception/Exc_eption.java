package JavaBeginners.JavaFiles.Class.Exception;

public class Exc_eption {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3};
//        System.out.println(numbers[10]);
//        C:\Users\2215276\Softwares\jdk-17_windows-x64_bin\jdk-17.0.11\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.2\lib\idea_rt.jar=54630:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\2215276\AnkitFiles\Java\out\production\AnkitFiles JavaBeginners.JavaFiles.Class.Exception.Exc_eption
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
//	at JavaBeginners.JavaFiles.Class.Exception.Exc_eption.main(Exc_eption.java:6)

        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[10]);
        } catch(Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("The try catch is finished");
        }
    }
}
