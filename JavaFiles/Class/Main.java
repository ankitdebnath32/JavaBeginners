package JavaBeginners.JavaFiles.Class;

public class Main {
    int x = 5;
    int y = 10;
    /*when you dont want to override a value of a field, just declare it as final as
    shown below*/
    final double PI =3.14159;

    //multiple attributes
    String fname = "Ankit";
    String lname = "Debnath";
    int age = 26;

    static void myMethod(){
        System.out.println("Hello Ankit! How are you");
    }

    /*Static vs. Public
        You will often see Java programs that have either static or public
        attributes and methods.

        In the example above, we created a static method, which means that it can be accessed
        without creating an object of the class, unlike public, which can only be accessed by
        objects:
     */

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);

        //multiple objects
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        //set value of y to 40
        Main myObjct = new Main();
        myObjct.y=40;
        System.out.println(myObjct.y);

        System.out.println("Name: " + myObj.fname+" "+myObj.lname);
        System.out.println("Age: " + myObj.age);

        myMethod();

    }
}
