package homework3;

import java.util.Scanner;

public class II {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj");
        int i = in.nextInt();
        int sum = 0;

        while (i != 0) {
            sum += i;
            System.out.println("Unesite novi broj");
            i = in.nextInt();
        }
        System.out.println("Zbir je " + sum);

        in.close();
    }
}
