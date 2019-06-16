import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        ArrayList<Double> numbers = methods.list();
        ArrayList rewersNumbers = methods.rewers(numbers);
        double sum = methods.sum(numbers);
        double max = methods.max(numbers);
        double min = methods.min(numbers);

        System.out.println("Liczby: " + numbers + rewersNumbers);
        methods.display(numbers, sum);
        System.out.println("Największa liczba: " + max);
        System.out.println("najmniejsza liczba: " + min);
    }


}
