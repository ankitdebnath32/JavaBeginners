package JavaBeginners.JavaFiles.Class;

public class Main2 {
    static void myStaticMethod(){
        System.out.println("This is a Static method");
    }
    public static void myPublicMethod(){
        System.out.println("This is a public method");
    }

    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        Main2 myObj = new Main2(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }
}
