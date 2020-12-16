package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static final int GROUP_LENGTH = 20;

    public static void main(String[] args) {
        try {
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");

            Random random = new Random();
            PrintWriter printWriter = new PrintWriter(file1);

            for (int i = 0; i < 1000; i++) {
                printWriter.print(random.nextInt(101) + " ");
            }
            printWriter.close();

            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            scanner.close();

            printWriter = new PrintWriter(file2);

            for (int i = 0; i < numbersString.length - GROUP_LENGTH + 1; i += GROUP_LENGTH) {
                double sum = 0;
                double avg = 0;
                for (int j = i; j < i + GROUP_LENGTH; j++) {
                    sum += Double.parseDouble(numbersString[j]);
                    avg = sum / GROUP_LENGTH;
                }
                printWriter.print(avg + " ");
            }

            printWriter.close();
            printResult(file2);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            scanner.close();

            double sum = 0;
            for (String number : numbersString) {
                sum += Double.parseDouble(number);
            }
            System.out.println((int) sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

