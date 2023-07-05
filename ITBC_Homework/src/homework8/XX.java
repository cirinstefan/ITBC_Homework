package homework8;

public class XX {
    public static void main(String[] args) {

        int a = 1;
        int b = 5;
        int c = proizvodBrojeva(a, b) * 2;
        System.out.println("Duplirana vrednost proizvoda je: " + c);
    }

    public static int proizvodBrojeva(int a, int b) {
        return a * b;
    }
}
