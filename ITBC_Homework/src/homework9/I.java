package homework9;

public class I {
    public static void main(String[] args) {

        Radnik radnik1 = new Radnik("Marko", "Markovic", 2000);
        Radnik radnik2 = new Radnik("Stefan", "Markovic", 2018);
        Radnik radnik3 = new Radnik("Marko", "Stefanovic", 2005);

        if (duzeOd10(radnik1.godinaZaposlenja) == true) {
            System.out.println("Radnik " + radnik1.ime + " je duze od 10 godina u firmi.");
        } else {
            System.out.println("Radnik " + radnik1.ime + " nije duze od 10 godina u firmi.");
        }

        if (duzeOd10(radnik2.godinaZaposlenja) == true) {
            System.out.println("Radnik " + radnik2.ime + " je duze od 10 godina u firmi.");
        } else {
            System.out.println("Radnik " + radnik2.ime + " nije duze od 10 godina u firmi.");
        }

        if (duzeOd10(radnik3.godinaZaposlenja) == true) {
            System.out.println("Radnik " + radnik3.ime + " je duze od 10 godina u firmi.");
        } else {
            System.out.println("Radnik " + radnik3.ime + " nijeje duze od 10 godina u firmi.");
        }


    }

    public static boolean duzeOd10(int godinaZaposlenja) {
        int currentYear = 2023;
        if (currentYear - godinaZaposlenja > 10) {
            return true;
        }
        return false;
    }
}
