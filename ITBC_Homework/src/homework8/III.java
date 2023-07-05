package homework8;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ocenu koju ste dobili: ");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlodobar");
                break;
            case 5:
                System.out.println("Odlican");
                break;
            default:
                System.out.println("Greska. Morate uneti ocenu od 1 do 5.");
        }
        sc.close();
    }
}
