package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                numbersList.add(i);
            }
        }

        for (int i = 300; i < 350; i++) {
            if (i % 2 == 0) {
                numbersList.add(i);
            }
        }

        System.out.println(numbersList);
    }
}
