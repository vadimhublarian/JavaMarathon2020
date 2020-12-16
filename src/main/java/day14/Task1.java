package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            if (numbersString.length != 10) throw new InvalidPropertiesFormatException("Некорректный входной файл");

            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (InvalidPropertiesFormatException e) {
            System.out.println(e.getMessage());
        }
    }

}
