package homework8;

import java.util.Scanner;
import java.util.Arrays;

public class XVII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] niz = new int[7];
        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        Arrays.sort(niz);
        System.out.println("Najveci element niza je: " + niz[niz.length - 1]);

        sc.close();
    }
}
