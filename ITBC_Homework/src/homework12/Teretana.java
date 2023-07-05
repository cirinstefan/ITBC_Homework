package homework12;

import java.util.ArrayList;

public class Teretana {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Clan> clanovi;

    public Teretana() {

    }

    public Teretana(String naziv, int godinaOsnivanja, ArrayList<Clan> clanovi) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanovi = clanovi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Clan> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Clan> clanovi) {
        this.clanovi = clanovi;
    }

    public int brojClanovaKojiMoguDaRadeVezbu(Sprava sprava, ArrayList<Clan> clanovi) {
        int count = 0;
        for (Clan element : clanovi) {
            if (element.postignutCilj(sprava) == true) {
                count++;
            }
        }
        return count;
    }
}
