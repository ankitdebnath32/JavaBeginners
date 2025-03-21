package JavaFiles.Java8Full;

@FunctionalInterface
public interface Child extends Parent{
    public void sayHello(); // same method as parent can be called
//    public void sayBye();  will throw error since it creates a new abstract method.

    default void sayOk(){
    };
}
