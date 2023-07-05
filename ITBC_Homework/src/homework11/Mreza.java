package homework11;

public enum Mreza {

    _3G("3G"),_4G("4G"),_5G("5G");
    private final String vrsta;
    Mreza(String vrsta){
        this.vrsta = vrsta;
    }
    public String getVrsta(){
        return vrsta;
    }
}
