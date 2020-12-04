package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOfRandomInts = random.ints(100, 0, 10000).toArray();
        System.out.println(Arrays.toString(arrayOfRandomInts));

        int max = 0;
        int min = arrayOfRandomInts[0];
        int counter0 = 0;
        int sum = 0;
        for (int value : arrayOfRandomInts) {
            if (value > max) max = value;
            if (value < min) min = value;
            if (value % 10 == 0) {
                counter0++;
                sum += value;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counter0);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
