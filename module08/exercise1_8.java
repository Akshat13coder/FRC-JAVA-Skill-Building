package module08;

import java.util.Scanner;

public class exercise1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a integral number : ");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }

        if (num == 0) {
            System.out.println("The number is zero.");
        } else if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        sc.close();
    }
}
