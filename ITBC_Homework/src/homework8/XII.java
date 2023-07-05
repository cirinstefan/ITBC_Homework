package homework8;

import java.util.Scanner;

public class XII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj = 0;
        while (broj != 25){
            System.out.println("Unesite neki broj: ");
            broj = sc.nextInt();
            if (broj % 2 == 0 && broj >= 1 && broj <= 25){
                System.out.println(broj);
            }
        }
        sc.close();
    }
}
