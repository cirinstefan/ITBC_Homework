package homework12;

import java.util.ArrayList;

public class I {
    public static void main(String[] args) {

        Sprava sprava1 = new Sprava("Busilica", "Busi", 80);

        Trener trener1 = new Trener("251252154", "Marko", "Markovic", 192, 95, 10);
        Rekreativac rekreativac1 = new Rekreativac("421489127", "Nikola", "Nikolic", 165, 80, 5, 50);
        Rekreativac rekreativac2 = new Rekreativac("5021857", "Pera", "Djura", 165, 80, 5, 50);
        Rekreativac rekreativac3 = new Rekreativac("52151", "Rekreativan", "3", 140, 32, 1, 20);
        Rekreativac rekreativac4 = new Rekreativac("42424112", "Milojko", "Petrovic", 210, 120, 50, 100);

        ArrayList<Clan> clanovi = new ArrayList<>();
        clanovi.add(trener1);
        clanovi.add(rekreativac1);
        clanovi.add(rekreativac2);
        clanovi.add(rekreativac3);
        clanovi.add(rekreativac4);


        Teretana teretana1 = new Teretana("Stefanov gym", 2023, clanovi);

        System.out.println(teretana1.brojClanovaKojiMoguDaRadeVezbu(sprava1, clanovi));
    }
}
}
