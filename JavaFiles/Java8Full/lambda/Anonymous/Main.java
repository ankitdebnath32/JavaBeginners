package JavaFiles.Java8Full.lambda.Anonymous;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee() {
            @Override
            public String getSalary() {
                return "100000";
            }

            @Override
            public String getDesignation() {
                return "Software Engineer";
            }
        };
        System.out.println(emp.getSalary());
        System.out.println(emp.getDesignation());
    }
}
