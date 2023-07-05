package homework5;

public class I {
    public static void main(String[] args) {

        System.out.println(aBoolean(13, 12));
        System.out.println(aBoolean(11, 12));
        System.out.println(aBoolean(25, 26));
        System.out.println(aBoolean(28, 32));
        System.out.println(aBoolean(10, -2));

    }

    public static boolean aBoolean(int a, int b) {
        if (a + 1 == b) {
            return true;
        } else {
            return false;
        }
    }
}
