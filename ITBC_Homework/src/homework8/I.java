package homework8;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj od kojeg zelite apsolutnu vrednost: ");
        int i = sc.nextInt();
        System.out.println("Apsolutna vrednost zeljenjog broja je: " + apsolutnaVrednost(i));

        sc.close();
    }

    public static int apsolutnaVrednost(int i) {
        if (i >= 0) {
            return i;
        }
        return -i;
    }
}
