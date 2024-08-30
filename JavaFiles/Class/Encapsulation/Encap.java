package JavaBeginners.JavaFiles.Class.Encapsulation;

public class Encap {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setName("Ankit");
        System.out.println(obj.getName());
    }
}
