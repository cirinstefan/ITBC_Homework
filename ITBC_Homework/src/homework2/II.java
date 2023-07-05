package homework2;

import java.util.Scanner;

public class II {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        String username = "Stefan";
        String password = "Stefan123";

        System.out.println("Unesite username:");
        String unetUser = a.nextLine();
        System.out.println("Unesite password:");
        String unetPass = a.nextLine();

        if (unetUser.equalsIgnoreCase(username) && unetPass.equals(password)) {
            System.out.println("Uspenso ste se ulogovali.");
        } else {
            System.out.println("Pogresan username ili password.");
        }
        a.close();
    }
}
