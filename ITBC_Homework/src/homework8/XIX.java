package homework8;

import java.util.Scanner;

public class XIX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva broja: ");
        int c = minDvaBroja(sc.nextInt(), sc.nextInt());
        System.out.println(c);

        sc.close();
    }

    public static int minDvaBroja(int a, int b) {
        int min;
        if (a >= b) {
            min = b;
        } else {
            min = a;
        }
        return min;
    }
}
