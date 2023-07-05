package homework8;

import java.util.Arrays;
import java.util.Scanner;

public class IX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj ljudi: ");
        int n = sc.nextInt();
        double[] visine = new double[n];

        for (int i = 0; i < visine.length; i++) {
            System.out.println("Unesite visinu za " + (i + 1) + ". osobu:");
            visine[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < visine.length; i++) {
            sum += visine[i];
        }
        double prosecnaVisina = sum / n;
        Arrays.sort(visine);

        System.out.println("Prosecna visina je: " + String.format("%.2f", prosecnaVisina) + "m" + ", a najvisa osoba je visoka: " + visine[n - 1] + "m");

        sc.close();
    }
}
