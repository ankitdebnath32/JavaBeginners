package JavaBeginners.JavaFiles;

public class StringClass {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the string is: " + txt.length());
        String txt1 = "Hello World";
        System.out.println(txt1.toLowerCase());
        System.out.println(txt1.toUpperCase());
        String txt2 = "Please locate where 'locate' occurs";
        System.out.println(txt2.indexOf("locate"));

        //concat

        String firstName = "Ankit";
        String lastName = "Debnath";

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String x = "AB";
        int y = 10;
        String z = x+y;
        System.out.println(z);

        String text = "We are so called \"Vikings\" from the north.";
        System.out.println(text);
    }
}
