package homework8;

import java.util.Scanner;

public class XV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] niz = new int[10];

        System.out.println("Unesite 10 brojeva:");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        for (int i = 0; i < niz.length; i++) {
            if (i % 2 != 0) {
                System.out.println(niz[i]);
            }
        }

        sc.close();
    }
}
