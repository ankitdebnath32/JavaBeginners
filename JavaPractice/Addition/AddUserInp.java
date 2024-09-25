package JavaPractice.Addition;

import java.util.Scanner;

public class AddUserInp {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        x=sc.nextInt();

        System.out.println("type a number");
        y= sc.nextInt();

        sum = x+y;
        System.out.println("The sum is: " + sum);
    }
}
