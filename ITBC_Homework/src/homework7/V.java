package homework7;

public class V {
    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {1, 2, 3, 4, 5};

        jednakiNizovi(niz1, niz2);

    }

    public static void jednakiNizovi(int[] niz1, int[] niz2) {
        if (niz1.length == niz2.length) {
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] == niz2[i]) {
                    if (i == niz1.length - 1 && (niz1[niz1.length - 1] == niz2[niz2.length - 1])) {
                        System.out.println("Nizovi su isti");
                    }
                } else {
                    System.out.println("Nizovi nisu isti");
                    break;
                }
            }

        } else {
            System.out.println("Nizovi nisu isti.");
        }
    }
}
