package JavaPractice.Reverse;

public class Reverse {
    public static void main(String[] args) {
        String name = "Ankit";
        String rev = "";
        System.out.println("original string: " + name);

        for(int i = 0; i<name.length();i++){
            rev = name.charAt(i) + rev;
        }
        System.out.println("reversed string " + rev);
    }
}
