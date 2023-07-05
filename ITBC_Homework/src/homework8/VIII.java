package homework8;

import java.util.Scanner;

public class VIII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva broja: ");
        double k = sc.nextDouble();
        double n = sc.nextDouble();

        int count = 0;
        double sum = 0;

        if (k < n) {
            for (double i = k; i <= n; i++) {
                if (i % 2 == 0) {
                    count++;
                    sum += i;
                }
            }
        } else if (n < k) {
            for (double i = n; i <= k; i++) {
                if (i % 2 == 0) {
                    count++;
                    sum += i;
                }
            }
        }
        double aritmetickaSredina = sum / count;

        System.out.println("Aritmeticka sredina je: " + aritmetickaSredina);

        sc.close();
    }
}
