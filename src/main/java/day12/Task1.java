package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carsList = new ArrayList<>();
        carsList.add("Honda");
        carsList.add("Audi");
        carsList.add("BMW");
        carsList.add("Mazda");
        carsList.add("Ford");
        System.out.println(carsList);

        carsList.add(carsList.size() / 2, "Tesla");
        carsList.remove(0);
        System.out.println(carsList);
    }
}
