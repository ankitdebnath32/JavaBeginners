package JavaBeginners.JavaFiles.Class.Modifiers;

abstract class Main2 {
    public String fname = "Ankit";
    public int age = 26;

    public abstract void study();
}

    // Subclass (inherit from Main)
    class Student extends Main2 {
        public int graduationYear = 2018;
        public void study() { // the body of the abstract method is provided here
            System.out.println("Studying all day long");
        }
    }

    class Second2 {
        public static void main(String[] args) {
            // create an object of the Student class (which inherits attributes and methods from Main)
            Student myObj = new Student();

            System.out.println("Name: " + myObj.fname);
            System.out.println("Age: " + myObj.age);
            System.out.println("Graduation Year: " + myObj.graduationYear);
            myObj.study(); // call abstract method
        }
    }
