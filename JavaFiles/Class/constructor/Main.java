package JavaBeginners.JavaFiles.Class.constructor;

public class Main {
    int x;
    int modelYear;
    String modelName;

    public Main(int abc, int year, String name) {
        x = 5;
        x = abc;
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Main myObjt = new Main(5, 2024, "Ankit");
        System.out.println(myObjt.x);
    }
}
