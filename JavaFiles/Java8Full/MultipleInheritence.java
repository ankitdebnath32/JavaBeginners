package JavaFiles.Java8Full;

interface X{
    default void sayHello(){
        System.out.println("A says Hello");
    }
}

interface Y{
    default void sayHello(){
        System.out.println("B says Hello");
    }
}

public class MultipleInheritence implements X, Y{
    public static void main(String[] args) {
        MultipleInheritence mi = new MultipleInheritence();
        mi.sayHello();
    }
    @Override
    public void sayHello(){
        X.super.sayHello();
        System.out.println("My own impl");
    }
}
