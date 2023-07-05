package homework6;

public class II {
    public static void main(String[] args) {

        System.out.println(String.format("%.2f", menjacnica(500, "usd")) + " USD");
        System.out.println(String.format("%.2f", menjacnica(5000, "EUR")) + " EUR");
        System.out.println(String.format("%.2f", menjacnica(22225, "GbP")) + " GBP");

    }

    public static double menjacnica(double dinari, String valuta) {
        String valutaToUpperCase = valuta.toUpperCase();
        double dinarToValuta = 0;
        switch (valutaToUpperCase) {
            case "EUR":
                return dinarToValuta = dinari / 117.29;
            case "USD":
                return dinarToValuta = dinari / 106.47;
            case "GBP":
                return dinarToValuta = dinari / 134.45;
            default:
                System.out.println("Valuta koju ste uneli nije prihvatljiva, molimo vas izaberite EUR, USD ili GBP.");
        }
        return dinarToValuta;
    }
}
