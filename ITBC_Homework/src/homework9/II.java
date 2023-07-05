package homework9;

public class II {
    public static void main(String[] args) {

        Film film1 = new Film("Avatar", "Stefanovic", 2000);
        Film film2 = new Film("Crni Gruja", "Markovic", 1942);


        if (film1.godinaObjave > film2.godinaObjave){
            System.out.println("Noviji film je " + film1.ime);
        } else if (film2.godinaObjave > film1.godinaObjave) {
            System.out.println("Noviji film je " + film2.ime);
        } else {
            System.out.println("Filmovi su izasli iste godine");
        }
    }
}
