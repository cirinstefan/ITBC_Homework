package homework6;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] niz = new int[5];
        System.out.println("Ukucajte 5 brojeva za niz");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = in.nextInt();
        }
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {22, 2, 13, 17, 5};
        int[] niz3 = {10, 221, 37, 748, 547};
        highToArray(niz);
        highToArray(niz1);
        highToArray(niz2);
        highToArray(niz3);

        in.close();

    }

    public static void highToArray(int[] array) {
        int high = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > high) {
                high = array[i];
            }
        }
        System.out.println("Brojevi niza su");
        for (int i = 0; i < array.length; i++) {
            array[i] = high;
            System.out.println(array[i]);
        }
    }
}
