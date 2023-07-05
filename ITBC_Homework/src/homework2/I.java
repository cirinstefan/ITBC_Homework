package homework2;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Unesite neku godinu: ");
        int godina = a.nextInt();

        if (godina % 4 == 0) {
            if (godina % 100 == 0) {
                if (godina % 400 == 0) {
                    System.out.println("Godina koju ste uneli je prestupna.");
                } else {
                    System.out.println("Godina koju ste uneli nije prestupna.");
                }
            } else {
                System.out.println("Godina koju ste uneli je prestupna.");
            }

        } else {
            System.out.println("Godina koju ste uneli nije prestupna.");
        }

        a.close();
    }
}
