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

        int counter = 0;
        for(int i = 0; i < arrayOfRandomInts.length; i++) {
            if(arrayOfRandomInts[i] > 8) {
                counter++;
            }
        }
        System.out.println("Количество чисел больше 8: " + counter);

        counter = 0;
        for(int i = 0; i < arrayOfRandomInts.length; i++) {
            if(arrayOfRandomInts[i] == 1) {
                counter++;
            }
        }
        System.out.println("Количество чисел равных 1: " + counter);

        counter = 0;
        for(int i = 0; i < arrayOfRandomInts.length; i++) {
            if(arrayOfRandomInts[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Количество четных чисел: " + counter);

        counter = 0;
        for(int i = 0; i < arrayOfRandomInts.length; i++) {
            if(arrayOfRandomInts[i] % 2 != 0) {
                counter++;
            }
        }
        System.out.println("Количество нечетных чисел: " + counter);

        int sum = 0;
        for(int i = 0; i < arrayOfRandomInts.length; i++) {
            sum+=arrayOfRandomInts[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
        // Другой вариант с использованием методов из класса Arrays
        //System.out.println("Сумма всех элементов массива: " + Arrays.stream(arrayOfRandomInts).sum());

        scanner.close();
    }
}
