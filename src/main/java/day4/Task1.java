package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] arrayOfRandomInts = random.ints(n, 0, 11).toArray();

        System.out.println(Arrays.toString(arrayOfRandomInts));
        System.out.println("Длина массива: " + arrayOfRandomInts.length);

        int counter8 = 0;
        int counter1 = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sum = 0;
        for (int i = 0; i < arrayOfRandomInts.length; i++) {
            if (arrayOfRandomInts[i] > 8) {
                counter8++;
            }

            if (arrayOfRandomInts[i] == 1) {
                counter1++;
            }

            if (arrayOfRandomInts[i] % 2 == 0) {
                counterEven++;
            }

            if (arrayOfRandomInts[i] % 2 != 0) {
                counterOdd++;
            }

            sum += arrayOfRandomInts[i];
        }
        System.out.println("Количество чисел больше 8: " + counter8);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Количество четных чисел: " + counterEven);
        System.out.println("Количество нечетных чисел: " + counterOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
        // Другой вариант с использованием методов из класса Arrays
        //System.out.println("Сумма всех элементов массива: " + Arrays.stream(arrayOfRandomInts).sum());

        scanner.close();
    }
}
