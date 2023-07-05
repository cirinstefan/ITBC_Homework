package homework2;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Unesite dan kad ste rodjeni: ");
        int dan = a.nextInt();

        System.out.println("Unesite u kom ste mesecu rodjeni:");
        int mesec = a.nextInt();


        switch (mesec) {
            case 1:
                if (dan < 21 && dan > 0) {
                    System.out.println("Jarac");
                } else if (dan < 32 && dan > 20) {
                    System.out.println("Vodolija");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 2:
                if (dan < 19 && dan > 0) {
                    System.out.println("Vodolija");
                } else if (dan < 29 && dan > 18) {
                    System.out.println("Riba");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 3:
                if (dan < 20 && dan > 0) {
                    System.out.println("Riba");
                } else if (dan < 32 && dan > 19) {
                    System.out.println("Ovan");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 4:
                if (dan < 21 && dan > 0) {
                    System.out.println("Ovan");
                } else if (dan < 31 && dan > 20) {
                    System.out.println("Bik");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 5:
                if (dan < 22 && dan > 0) {
                    System.out.println("Bik");
                } else if (dan < 32 && dan > 21) {
                    System.out.println("Blizanac");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 6:
                if (dan < 21 && dan > 0) {
                    System.out.println("Blizanac");
                } else if (dan < 31 && dan > 20) {
                    System.out.println("Rak");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 7:
                if (dan < 23 && dan > 0) {
                    System.out.println("Rak");
                } else if (dan < 32 && dan > 22) {
                    System.out.println("Lav");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 8:
                if (dan < 23 && dan > 0) {
                    System.out.println("Lav");
                } else if (dan < 32 && dan > 22) {
                    System.out.println("Devica");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 9:
                if (dan < 23 && dan > 0) {
                    System.out.println("Devica");
                } else if (dan < 31 && dan > 22) {
                    System.out.println("Vaga");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 10:
                if (dan < 24 && dan > 0) {
                    System.out.println("Vaga");
                } else if (dan < 32 && dan > 23) {
                    System.out.println("Skorpija");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 11:
                if (dan < 23 && dan > 0) {
                    System.out.println("Skorpija");
                } else if (dan < 31 && dan > 22) {
                    System.out.println("Strelac");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            case 12:
                if (dan < 22 && dan > 0) {
                    System.out.println("Strelac");
                } else if (dan < 32 && dan > 21) {
                    System.out.println("Jarac");
                } else {
                    System.out.println("Ne postoji taj dan u zadatom mesecu.");
                }
                break;
            default:
                System.out.println("Greska.");

        }

        a.close();
    }
}
