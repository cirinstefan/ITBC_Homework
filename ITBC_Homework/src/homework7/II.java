package homework7;

import java.util.Scanner;

public class II {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneste zeljenu operaciju (+, -, *, /): ");
        String operacija = sc.nextLine();
        System.out.println("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b = sc.nextInt();

        switch (operacija) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Greska. Morate uneti neku od (+, -, *, /) operacija");
        }
    }
}
