package homework7;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesite drugi broj:");
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("Manji broj je " + a + ".");
        } else if (b < a) {
            System.out.println("Manji broj je " + b + ".");
        } else {
            System.out.println("Brojevi su jednaki.");
        }
    }
}
