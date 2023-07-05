package homework12;

public class Rekreativac extends Clan{
    private int maxPonavljanjaVezbi;
    private double maxOpterecenje;
    public Rekreativac(){

    }

    public Rekreativac(int maxPonavljanjaVezbi, double maxOpterecenje) {
        setMaxPonavljanjaVezbi(maxPonavljanjaVezbi);
        setMaxOpterecenje(maxOpterecenje);
    }

    public Rekreativac(String identifikacioniKod, String ime, String prezime, double visina, double tezina, int maxPonavljanjaVezbi, double maxOpterecenje) {
        super(identifikacioniKod, ime, prezime, visina, tezina);
        setMaxPonavljanjaVezbi(maxPonavljanjaVezbi);
        setMaxOpterecenje(maxOpterecenje);
    }

    public int getMaxPonavljanjaVezbi() {
        return maxPonavljanjaVezbi;
    }

    public void setMaxPonavljanjaVezbi(int maxPonavljanjaVezbi) {
        if (maxPonavljanjaVezbi > 0) {
            this.maxPonavljanjaVezbi = maxPonavljanjaVezbi;
        } else {
            System.out.println("Maksimalno ponavljanje vezbi ne moze biti negativno.");
        }
    }

    public double getMaxOpterecenje() {
        return maxOpterecenje;
    }

    public void setMaxOpterecenje(double maxOpterecenje) {
        if (maxOpterecenje > 0) {
            this.maxOpterecenje = maxOpterecenje;
        } else {
            System.out.println("Opterecenje ne moze biti negativno.");
        }
    }

    @Override
    public void prikaziProfil() {

    }

    @Override
    public boolean postignutCilj(Sprava sprava) {
        if (maxOpterecenje >= sprava.getTezinaRadaNaSpravi() && maxPonavljanjaVezbi > 3 ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Rekreativac: " + identifikacioniKod + " " + ime + " " + prezime + "\n" +
                "Maksimalno opterecenje: " + maxOpterecenje +
                super.toString();
    }
}
