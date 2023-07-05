package homework4;

public class III {
    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] niz2 = {2, 2, 2, 2, 2, 2};

        if (niz1.length > niz2.length) {
            System.out.println("Niz 1 je veci od niza 2.");
        } else if (niz2.length > niz1.length) {
            System.out.println("Niz 2 je veci od niza 2.");
        } else {
            System.out.println("Nizovi imaju isti broj elemenata");
        }
    }
}
