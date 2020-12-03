package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOfRandomInts = random.ints(10, 0, 10001).toArray();
        System.out.println(Arrays.toString(arrayOfRandomInts));

        int max = 0;
        for (int value : arrayOfRandomInts) {
            if (value > max) max = value;
        }
        System.out.println("Наибольший элемент массива: " + max);

        int min = arrayOfRandomInts[0];
        for (int value : arrayOfRandomInts) {
            if (value < min) min = value;
        }
        System.out.println("Наименьший элемент массива: " + min);

        int counter = 0;
        for (int value : arrayOfRandomInts) {
            if (String.valueOf(value).endsWith("0"))
                counter++;
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + counter);

        int sum = 0;
        for (int value : arrayOfRandomInts) {
            if (String.valueOf(value).endsWith("0"))
                sum += value;
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
