package JavaFiles.Java8Full.lambda;

public class Main {
    public static void main(String[] args) {
        Employee employee = () -> "Software engineer from lambda";
        System.out.println(employee.getName());

        Employee editor = () -> "Editor";
        System.out.println(editor.getName());
    }
}
