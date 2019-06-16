import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {


    ArrayList<Double> rewers(ArrayList<Double> list) {
        ArrayList<Double> rewersList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            rewersList.add(list.get(list.size() - i - 1));
        }
        return rewersList;
    }

    double sum(ArrayList<Double> list) {
        double x = 0;
        for (int i = 0; i < list.size(); i++) {
            x += list.get(i);
        }
        return x;
    }

    double max(ArrayList<Double> list) {
        double x = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                x = list.get(i + 1);
            }
        }
        return x;
    }

    double min(ArrayList<Double> list) {
        double x = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                x = list.get(i + 1);
            }
        }
        return x;
    }

    void display(ArrayList<Double> list, double x) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i) + "=" + x);
            } else {
                System.out.print(list.get(i) + "+");
            }
        }
    }
Scanner scanner = new Scanner(System.in);
    ArrayList<Double> list() {
        ArrayList<Double> numbers = new ArrayList<>();
        Double x;
        do {
            System.out.println("Podaj liczbę");
            x = scanner.nextDouble();
            if (x < 0) {
                break;
            }
            numbers.add(x);
        }
        while (x > 0);
        return numbers;

    }


}
