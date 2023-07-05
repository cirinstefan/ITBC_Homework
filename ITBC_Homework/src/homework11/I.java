package homework11;

import java.util.ArrayList;

public class I {
    public static void main(String[] args) {

        Pas pas1 = new Pas("Mile", "Mile", true);
        Pas pas2 = new Pas("Kornjaca", "Kuce", false);
        Pas pas3 = new Pas("Cupko", "Cupi", true);


        Macka macka1 = new Macka("Bogdan", "Marko", 8);
        Macka macka2 = new Macka("Cufta", "Cufi", 2.57);
        Macka macka3 = new Macka("Vucic", "Vucko", 3.42);

        ArrayList<Zivotinja> zivotinje = new ArrayList<>();
        zivotinje.add(pas1);
        zivotinje.add(pas3);
        zivotinje.add(pas2);
        zivotinje.add(macka1);
        zivotinje.add(macka2);
        zivotinje.add(macka3);

        for (Zivotinja element : zivotinje) {
            if (element instanceof Pas) {
                System.out.println("dog: " + element);
                System.out.println("********** " + element.nickname + ": " + element.sound() + ", " + element.sound() + ", " + ((Pas) element).goodBoyTest() + " **********");
                System.out.println(" ");
            } else if (element instanceof Macka) {
                System.out.println("cat: " + element);
                System.out.println("********** " + element.nickname + ": " + element.sound() + ", " + element.sound() + ", " + ((Macka) element).chonkTest() + " **********");
                System.out.println(" ");
            } else {
                System.out.println("Ne znam koja je ovo zivotinja.");
            }
        }

    }
}
