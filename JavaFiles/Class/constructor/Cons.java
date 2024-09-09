package JavaBeginners.JavaFiles.Class.constructor;

public class Cons {

    Cons(){
        super();
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        Cons cons = new Cons();
        System.out.println("Cons");
    }
}
