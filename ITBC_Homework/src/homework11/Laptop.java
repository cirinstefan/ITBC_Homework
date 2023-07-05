package homework11;

public class Laptop extends Racunar{

    private double velicinaEkrana;
    private Tastatura tastatura;
    public Laptop(){

    }

    public Laptop(double velicinaEkrana, Tastatura tastatura) {
        this.velicinaEkrana = velicinaEkrana;
        this.tastatura = tastatura;
    }

    public Laptop(int brProcesora, int ramMemorija, int memorija, double velicinaEkrana, Tastatura tastatura) {
        super(brProcesora, ramMemorija, memorija);
        this.velicinaEkrana = velicinaEkrana;
        this.tastatura = tastatura;
    }

    public double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }

    public Tastatura getTastatura() {
        return tastatura;
    }

    public void setTastatura(Tastatura tastatura) {
        this.tastatura = tastatura;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ekran: " + velicinaEkrana +
                "\", tastatura: " + tastatura;
    }
}
