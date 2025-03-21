package JavaFiles.Java8Full.lambda.Runnable;

public class Main {
    public static void main(String[] args) {
//        MyClass mc = new MyClass();

        Runnable runnable = () -> {
            for(int i = 1; i<=10; i++){
                System.out.println("Hello " + i);
            }
        };
        Thread childThread = new Thread(runnable);
        childThread.run();
        for(int i = 1; i<=10; i++){
            System.out.println("Bye " + i);
        }
    }
}
