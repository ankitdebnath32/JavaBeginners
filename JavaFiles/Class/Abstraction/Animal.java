package JavaBeginners.JavaFiles.Class.Abstraction;

abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says; wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The Dog says: bow bow");
    }
}

class Main{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        Dog myDog = new Dog();
        myPig.animalSound();
        myDog.sleep();
    }
}
