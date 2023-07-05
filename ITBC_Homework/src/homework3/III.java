package homework3;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj veci od 0");
        int i = in.nextInt();
        int sum = 0;

        do {
            sum += i;
            System.out.println("Unesite broj veci od 0");
            i = in.nextInt();
        } while (i > 0);

        System.out.println("Zbir brojeva je " + sum);

        in.close();

    }
}
