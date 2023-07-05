package homework5;

public class II {
    public static void main(String[] args) {

        imeIPrezime("Stefan", "CIRIN");
        imeIPrezime("pera", "peric");
        imeIPrezime("zdravko", "FilIPovIC");

    }

    public static void imeIPrezime(String ime, String prezime) {
        String imeUpperCase = ime.toUpperCase();
        String prezimeLowerCase = prezime.toLowerCase();
        System.out.println("Ime: " + imeUpperCase + " Prezime: " + prezimeLowerCase);

    }
}
