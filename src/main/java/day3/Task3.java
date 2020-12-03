package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dividend, divisor;

        for (int counter = 0; counter < 5; counter++) {
            dividend = scanner.nextDouble();
            divisor = scanner.nextDouble();
            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend / divisor);
        }
        scanner.close();
    }
}
