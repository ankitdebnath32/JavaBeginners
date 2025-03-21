package JavaFiles.Java8Full;

interface C{
    static void sayHello(){
        System.out.println("Hello");
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        StaticMethods sm = new StaticMethods();
//    sm.sayHello();
        C.sayHello();
    }
}
