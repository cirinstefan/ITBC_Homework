package homework8;

import java.util.Scanner;

public class XVIII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite duzine stranica: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 5;
        int b = 8;
        int a1 = -2;
        int b1 = 0;


        if (x > 0 && y > 0) {
            System.out.println(povrsinaPravougaonika(x, y));
        } else {
            System.out.println("Greska. Stranica moraju biti vece od 0.");
        }

        if (a > 0 && b > 0) {
            System.out.println(povrsinaPravougaonika(a, b));
        } else {
            System.out.println("Greska. Stranica moraju biti vece od 0.");
        }

        if (a1 > 0 && b1 > 0) {
            System.out.println(povrsinaPravougaonika(a1, b1));
        } else {
            System.out.println("Greska. Stranica moraju biti vece od 0.");
        }

        sc.close();

    }

    public static double povrsinaPravougaonika(double a, double b) {
        return a * b;
    }

}
