package homework10;

public class II {
    public static void main(String[] args) {

        Konverter konverter1 = new Konverter(45552, Valuta.EUR);
        Konverter konverter2 = new Konverter(50000, Valuta.USD);
        Konverter konverter3 = new Konverter(50000, Valuta.AUD);
        Konverter konverter4 = new Konverter(50000, Valuta.CAD);
        Konverter konverter5 = new Konverter(50000, Valuta.RUB);
        Konverter konverter6 = new Konverter(50000, Valuta.GBP);

        konverter1.setValuta(Valuta.USD);
        konverter1.konvertovanjeValuta();
        konverter1.setValuta(Valuta.AUD);
        konverter1.konvertovanjeValuta();
        konverter1.setValuta(Valuta.CAD);
        konverter1.konvertovanjeValuta();
        konverter1.setValuta(Valuta.RUB);
        konverter1.konvertovanjeValuta();
        konverter1.setValuta(Valuta.GBP);
        konverter1.konvertovanjeValuta();
    }
}
