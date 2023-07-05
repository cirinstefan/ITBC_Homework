package homework8;

import java.util.Scanner;

public class XI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int x = sc.nextInt();
        int y = 1;

        for (int i = 1; i <= x; i++) {
            y = 1;
            while (y <= i) {
                System.out.print("*");
                y++;
            }
            System.out.println();
        }
        sc.close();
    }
}
