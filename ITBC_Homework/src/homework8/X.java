package homework8;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vase ime: ");
        String ime = sc.nextLine();
        String imeToUpperCase = ime.toUpperCase();

        System.out.println(imeToUpperCase + " " + imeToUpperCase + " " + imeToUpperCase);
        System.out.println(imeToUpperCase + " " + imeToUpperCase + " " + imeToUpperCase);
        System.out.println(imeToUpperCase + " " + imeToUpperCase + " " + imeToUpperCase);

        sc.close();
    }
}
