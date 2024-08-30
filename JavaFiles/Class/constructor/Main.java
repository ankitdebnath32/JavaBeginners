package JavaBeginners.JavaFiles.Class.constructor;

public class Main {
    int x;

    public Main(int y, int year, String name) {
//        x = 5;
        x = y;
        int modelYear = year;
        String modelName = name;
    }

    public static void main(String[] args) {
        Main myObjt = new Main(5, 2024, "Ankit");
        System.out.println(myObjt.x);
    }
}
