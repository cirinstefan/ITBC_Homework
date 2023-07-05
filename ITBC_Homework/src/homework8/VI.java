package homework8;

public class VI {
    public static void main(String[] args) {


        int count = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }
        System.out.println("Brojeva deljivih sa 3 od 1 do 50 ima: " + count);
    }
}
