package homework12;

public abstract class Clan {
    protected String identifikacioniKod;
    protected String ime;
    protected String prezime;
    protected double visina;
    protected double tezina;

    public Clan() {

    }

    public Clan(String identifikacioniKod, String ime, String prezime, double visina, double tezina) {
        this.identifikacioniKod = identifikacioniKod;
        this.ime = ime;
        this.prezime = prezime;
        setVisina(visina);
        setTezina(tezina);
    }

    public String getIdentifikacioniKod() {
        return identifikacioniKod;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        if (visina > 0) {
            this.visina = visina;
        } else {
            System.out.println("Visina ne moze da bude negativna vrednost.");
        }
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        if (tezina > 0) {
            this.tezina = tezina;
        } else {
            System.out.println("Tezina ne moze da bude negativna vrednost.");
        }
    }

    public abstract void prikaziProfil();

    public abstract boolean postignutCilj(Sprava sprava);

    public double BMI() {
        return tezina / (visina / 100);

    }
}
