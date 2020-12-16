package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            double avg = (double) sum / numbersString.length;
            System.out.print(String.format(Locale.ENGLISH, "%.15f --> ", avg));
            System.out.print(String.format(Locale.forLanguageTag("RU"), "%.3f", avg));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

