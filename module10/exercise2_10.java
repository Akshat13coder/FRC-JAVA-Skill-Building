package module10;

import java.util.Scanner;

public class exercise2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        for (int step = 1; step <= 10; step++) {
            System.out.println(n + " x " + step + " = " + (n * step));
        }
        sc.close();
    }
}
