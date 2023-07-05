package homework11;


import java.util.ArrayList;

public class II {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop(5, 5, 5, 25, Tastatura.US);
        Laptop laptop2 = new Laptop(3, 3, 3, 23, Tastatura.US);
        Laptop laptop3 = new Laptop(4, 4, 4, 24, Tastatura.INTERNACIONALNA);

        MobilniTelefon mobilniTelefon1 = new MobilniTelefon(5, 5, 5, 15, Mreza._5G);
        MobilniTelefon mobilniTelefon2 = new MobilniTelefon(4, 4, 4, 14, Mreza._4G);
        MobilniTelefon mobilniTelefon3 = new MobilniTelefon(3, 3, 3, 13, Mreza._3G);

        ArrayList<Racunar> uredjaji = new ArrayList<>();
        uredjaji.add(laptop1);
        uredjaji.add(laptop2);
        uredjaji.add(laptop3);
        uredjaji.add(mobilniTelefon1);
        uredjaji.add(mobilniTelefon2);
        uredjaji.add(mobilniTelefon3);

        for (Racunar element : uredjaji) {
            if (element instanceof Laptop) {
                System.out.println("Ovaj uredja je laptop " + element);
            } else if (element instanceof MobilniTelefon) {
                System.out.println("Ovaj uredja je mobilni telefon " + element);
            } else {
                System.out.println("Greska");
            }
        }
    }
}
