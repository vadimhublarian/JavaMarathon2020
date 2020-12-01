package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = scanner.nextInt();

        if (numberOfFloors > 0) {
            if (numberOfFloors <= 4) {
                System.out.println("Малоэтажный дом");
            } else {
                if (numberOfFloors <= 8) {
                    System.out.println("Среднеэтажный дом");
                } else {
                    System.out.println("Многоэтажный дом");
                }
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
