package JavaBeginners.JavaFiles.Class.constructor;


public class Parameterized {
    public static void main(String[] args) {
        Par par = new Par(2,"Ankit");
        System.out.println("Name: " + par.name + '\n' + "Id: " + par.id);
    };
    }

class Par{
    int id;
    String name;

    Par(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
}
