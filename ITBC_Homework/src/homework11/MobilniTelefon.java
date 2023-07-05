package homework11;

public class MobilniTelefon extends Racunar{

    private int jacinaKamere;
    private Mreza mreza;
    public MobilniTelefon(){

    }

    public MobilniTelefon(int jacinaKamere, Mreza mreza) {
        this.jacinaKamere = jacinaKamere;
        this.mreza = mreza;
    }

    public MobilniTelefon(int brProcesora, int ramMemorija, int memorija, int jacinaKamere, Mreza mreza) {
        super(brProcesora, ramMemorija, memorija);
        this.jacinaKamere = jacinaKamere;
        this.mreza = mreza;
    }

    public int getJacinaKamere() {
        return jacinaKamere;
    }

    public void setJacinaKamere(int jacinaKamere) {
        this.jacinaKamere = jacinaKamere;
    }

    public Mreza getMreza() {
        return mreza;
    }

    public void setMreza(Mreza mreza) {
        this.mreza = mreza;
    }

    @Override
    public String toString() {
        return super.toString() + ", kamera: " + jacinaKamere + ", mreza: " + mreza;
    }
}
