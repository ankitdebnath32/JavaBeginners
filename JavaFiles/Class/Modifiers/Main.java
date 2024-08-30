package JavaBeginners.JavaFiles.Class.Modifiers;

public class Main {
    final int x = 10;
    final double PI = 3.14;

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        Main myObj = new Main(); // Create an object of Main
        //myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        // myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error
        myObj.myPublicMethod(); // Call the public method


    }

}
