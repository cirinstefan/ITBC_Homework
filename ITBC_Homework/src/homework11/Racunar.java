package homework11;

public class Racunar {

    private int brProcesora;
    private int ramMemorija;
    private int memorija;

    public Racunar(){

    }
    public Racunar(int brProcesora, int ramMemorija, int memorija) {
        this.brProcesora = brProcesora;
        this.ramMemorija = ramMemorija;
        this.memorija = memorija;
    }

    public int getBrProcesora() {
        return brProcesora;
    }

    public void setBrProcesora(int brProcesora) {
        this.brProcesora = brProcesora;
    }

    public int getRamMemorija() {
        return ramMemorija;
    }

    public void setRamMemorija(int ramMemorija) {
        this.ramMemorija = ramMemorija;
    }

    public int getMemorija() {
        return memorija;
    }

    public void setMemorija(int memorija) {
        this.memorija = memorija;
    }

    @Override
    public String toString() {
        return "Racunar:" +
                "Broj procesora= " + brProcesora +
                ", ram memorija= " + ramMemorija +
                "GB, memorija=" + memorija +
                "GB";
    }
}
