package homework8;

import java.util.Scanner;

public class XVI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] niz = new int[5];

        System.out.println("Unesite 5 brojeva: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        for (int i = niz.length - 1; i >= 0; i--) {
            System.out.println(niz[i]);
        }

        sc.close();
    }
}
