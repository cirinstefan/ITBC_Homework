package homework12;

public class Sprava {
    private String naziv;
    private String opis;
    private int tezinaRadaNaSpravi;
    public Sprava(){
    }

    public Sprava(String naziv, String opis, int tezinaRadaNaSpravi) {
        this.naziv = naziv;
        this.opis = opis;
        setTezinaRadaNaSpravi(tezinaRadaNaSpravi);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getTezinaRadaNaSpravi() {
        return tezinaRadaNaSpravi;
    }

    public void setTezinaRadaNaSpravi(int tezinaRadaNaSpravi) {
        if (tezinaRadaNaSpravi >= 25 && tezinaRadaNaSpravi <= 100) {
            this.tezinaRadaNaSpravi = tezinaRadaNaSpravi;
        } else {
            System.out.println("Tezina rada na spravi mora biti od 25 do 100.");
        }
    }
}
