package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayOfRandomInts = random.ints(100, 0, 10001).toArray();
//        System.out.println(Arrays.toString(arrayOfRandomInts));

        int sum = 0, max = -1, index = 0;
        for (int i = 0; i < arrayOfRandomInts.length - 2; i++) {
            sum = arrayOfRandomInts[i] + arrayOfRandomInts[i + 1] + arrayOfRandomInts[i + 2];
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(sum);
        System.out.println(index);
    }
}
