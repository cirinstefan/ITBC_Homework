package homework10;

import java.util.ArrayList;

public class I {

    public static void main(String[] args) {

        ArrayList<Integer> listaBrojeva = new ArrayList<>();
        listaBrojeva.add(55);
        listaBrojeva.add(1);
        listaBrojeva.add(2);
        listaBrojeva.add(3);
        listaBrojeva.add(10);
        listaBrojeva.add(125);
        listaBrojeva.add(2);
        listaBrojeva.add(-2);
        listaBrojeva.add(91);
        listaBrojeva.add(13);
        listaBrojeva.add(55);
        System.out.println(listaBrojeva);

        System.out.println("Najmanji borj je: " + min(listaBrojeva));
        System.out.println("Najveci borj je: " + max(listaBrojeva));
        System.out.println("Suma je: " + sum(listaBrojeva));
        System.out.println("Prosek je: " + avg(listaBrojeva));
        System.out.println("Destinct lista je: " + destinct(listaBrojeva));
    }

    public static int min(ArrayList<Integer> listaBrojeva) {
        int min = 0;
        for (int element : listaBrojeva) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> listaBrojeva) {
        int max = 0;
        for (int element : listaBrojeva) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static int sum(ArrayList<Integer> listaBrojeva) {
        int sum = 0;
        for (int element : listaBrojeva) {
            sum += element;
        }
        return sum;
    }

    public static double avg(ArrayList<Integer> listaBrojeva) {
        double sum = 0;
        for (int element : listaBrojeva) {
            sum += element;
        }
        return sum / listaBrojeva.size();

    }

    public static ArrayList destinct(ArrayList<Integer> listaBrojeva) {
        ArrayList<Integer> novaListaBrojeva = new ArrayList<>();
        for (int element : listaBrojeva) {
            if (!novaListaBrojeva.contains(element)) {
                novaListaBrojeva.add(element);
            }
        }
        return novaListaBrojeva;
    }
}

