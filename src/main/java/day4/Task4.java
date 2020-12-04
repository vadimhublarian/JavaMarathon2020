package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOfRandomInts = random.ints(100_000, 0, 10001).toArray();
//        System.out.println(Arrays.toString(arrayOfRandomInts));

        int max = 0, index = 0;
        for (int i = 0; i < arrayOfRandomInts.length - 49; i++) {
            int sum = 0;
            for (int j = i; j < i + 50; j++) {
                sum += arrayOfRandomInts[j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
