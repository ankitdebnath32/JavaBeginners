package JavaFiles.Java8Full.lambda.Runnable;

public class MyClass implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i<=10; i++){
            System.out.println("Hello " + i);
        }
    }
}
