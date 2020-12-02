package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = scanner.nextInt();

        if (numberOfFloors >= 1 && numberOfFloors <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (numberOfFloors >= 5 && numberOfFloors <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (numberOfFloors >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
