package homework8;

import java.util.Scanner;

public class II {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Prvi broj je veci od drugog.");
        } else if (a == b) {
            System.out.println("Brojevi su jednaki.");
        } else {
            System.out.println("Drugi broj je veci od prvog.");
        }

        sc.close();
    }
}
