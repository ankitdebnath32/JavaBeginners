package JavaFiles.Java8Full;


@FunctionalInterface
public interface MyInterface {
    public void sayHello();

    default void sayBye(){
    };

    public static void sayOk(){
    };
}
