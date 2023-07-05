package homework7;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo Vas unesite trajanje u sekundama: ");
        int uneteSekunde = sc.nextInt();

        int sati = uneteSekunde / 3600;
        int minuti = (uneteSekunde % 3600) / 60;
        int sekunde = uneteSekunde % 60;

        System.out.println("Trajanje (sati:minuti:sekunde):  " + sati + ":" + minuti + ":" + sekunde);

    }
}
