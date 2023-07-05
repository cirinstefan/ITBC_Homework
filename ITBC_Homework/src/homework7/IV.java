package homework7;

public class IV {
    public static void main(String[] args) {

        samoglasnik('g');

    }

    public static void samoglasnik(char ch) {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U') {
            System.out.println("Slovo je samoglasnik.");
        } else {
            System.out.println("Slovo nije samoglasnik.");
        }
    }
}
