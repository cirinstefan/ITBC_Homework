package homework8;

import java.util.Scanner;

public class XIII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj do kog zelite kvadrate brojeva: ");
        int n = sc.nextInt();
        int broj = 1;
        int kvadrat = 1;


        if (n > 0) {
            while (broj <= n) {
                kvadrat *= kvadrat;
                System.out.println(kvadrat);
                broj++;
                kvadrat = broj;
            }
        } else {
            System.out.println("Greska. Morate da uneste broj veci od 0.");
        }

        sc.close();
    }
}
