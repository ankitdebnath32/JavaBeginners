package JavaFiles;

public class String_methods {
    public static void main(String[] args) {

        String name = "Ankit";
        System.out.println(name);
        int length = name.length();
        System.out.println(length);
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        String lowerCase =  name.toLowerCase();
        System.out.println(lowerCase);
        String nonTrimmedString = "   Ankit   ";
        String timemedString = nonTrimmedString.trim();
        System.out.println(nonTrimmedString);
        System.out.println(timemedString);
        String subString = name.substring(2);
        System.out.println(subString);
        String subStrin = name.substring(2);
        System.out.println(subStrin);
    }
}
