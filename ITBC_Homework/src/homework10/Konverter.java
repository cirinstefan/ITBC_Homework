package homework10;

public class Konverter {

    private int rsd;
    private Valuta valuta;

    public Konverter() {

    }

    public Konverter(int rsd, Valuta valuta) {
        if (rsd > 0) {
            this.rsd = rsd;
        } else {
            System.out.println("Unesite pozitivan iznos.");
        }
        this.valuta = valuta;
    }

    public void setRsd(int rsd) {
        if (rsd > 0) {
            this.rsd = rsd;
        } else {
            System.out.println("Unesite pozitivan iznos.");
        }
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public void konvertovanjeValuta() {
        switch (valuta) {
            case EUR:
                System.out.println("To je " + (0.0085 * rsd) + " u EUR");
                break;
            case USD:
                System.out.println("To je " + (0.0092 * rsd) + " u USD");
                break;
            case AUD:
                System.out.println("To je " + (0.014 * rsd) + " u AUD");
                break;
            case CAD:
                System.out.println("To je " + (0.012 * rsd) + " u CAD");
                break;
            case RUB:
                System.out.println("To je " + (0.72 * rsd) + " u RUB");
                break;
            case GBP:
                System.out.println("To je " + (0.0074 * rsd) + " u GBP");
                break;
            default:
                System.out.println("Greska");
                break;

        }
    }

    @Override
    public String toString() {
        return "Konverter{" +
                "rsd=" + rsd +
                ", valuta=" + valuta +
                '}';
    }
}

