package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/main/resources/shoes.csv");
            Scanner scanner = new Scanner(inputFile);
            File outputFile = new File("src/main/resources/missing_shoes.txt");
            PrintWriter printWriter = new PrintWriter(outputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoe = line.split(";");

                if (Integer.parseInt(shoe[2]) == 0) {
                    printWriter.println(Arrays.toString(shoe));
                }
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
