package JavaBeginners.JavaFiles.Class.Inheritence;

public class Vehicle {
    protected String brand = "Lamborghini";

    public void honk(){
        System.out.println("Pooo, Pooo!");
    }
}

class Car extends Vehicle{
    private String modelName = "Aventador";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
