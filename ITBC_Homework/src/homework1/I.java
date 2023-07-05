package homework1;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);


        System.out.println("Unesite svoje ime:");
        String ime = a.nextLine();

        System.out.println("Unesite svoje prezime:");
        String prezime = a.nextLine();

        System.out.println("Unesite godinu rodjenja:");
        int godinaRodjenja = a.nextInt();

        System.out.println("Vase ime je: " + ime + " " + prezime + " i rodjeni ste " + godinaRodjenja + " godine.");

        a.close();
    }
}
