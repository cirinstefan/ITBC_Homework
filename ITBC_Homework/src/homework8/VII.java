package homework8;

import java.util.Scanner;

public class VII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int proizvod = 1;
        int count = 0;
        System.out.println("Unesite dva prirodna broja: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {
                    proizvod *= i;
                    count++;
                }
            }
            System.out.println("Brojeva deljivih sa 5 ima: " + count + " a njihov proizvod je: " + proizvod + ".");
        } else {
            System.out.println("Brojevi moraju biti veci od 0.");
        }

        sc.close();
    }
}
