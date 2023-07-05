package homework12;

public class Trener extends Clan{
    private int godineIskustva;
    public Trener(){

    }

    public Trener(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public Trener(String identifikacioniKod, String ime, String prezime, double visina, double tezina, int godineIskustva) {
        super(identifikacioniKod, ime, prezime, visina, tezina);
        this.godineIskustva = godineIskustva;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    @Override
    public void prikaziProfil() {

    }

    @Override
    public boolean postignutCilj(Sprava sprava) {
        return true;
    }

    @Override
    public String toString() {
        return "Instruktor: " +identifikacioniKod + " " + ime + " " + prezime  + "\n" +
                "Godine iskustva: " + godineIskustva + super.toString();



    }
}
