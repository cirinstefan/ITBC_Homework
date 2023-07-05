package homework1;

import java.util.Scanner;

public class II {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Unesite temperaturu u stepenima celzijus: ");
        int celzijus = a.nextInt();

        double faranhajt = celzijus * 1.8000 + 32.00;

        System.out.printf(celzijus + "C = " + String.format("%.1f", faranhajt) + "F");

        a.close();


    }
}
