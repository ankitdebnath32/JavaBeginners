package JavaFiles.Java8Full;

interface A{

    public void sayTata();

    default void sayHello(){
        System.out.println("Hello");
    }
}

class B implements A{
    public void sayTata(){
        System.out.println("Tata");
    }

    @Override
    public void sayHello(){
        System.out.println("Child says hello");
    }

}

public class MyClass {
    public static void main(String[] args) {
        A b = new B();
        b.sayHello();
        b.sayTata();
    }
}
