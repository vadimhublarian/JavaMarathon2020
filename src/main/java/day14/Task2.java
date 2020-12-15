package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> peopleList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                peopleList.add(scanner.nextLine());
            }

            /* Поиск символа "-" в списке это конечно небольшая хитрость,
            но для данного ТЗ она работает и работает быстрее, чем вычитывание файла построчно,
            запихивания вычитанного в массив; перевода элемента массива в String;
            затем проверки age[1] > 0 и уже затем формирование списка! */
            if (peopleList.toString().contains("-")) {
                throw new IllegalArgumentException();
            }
            /* String line = scanner.nextLine();
            String[] peopleAges = line.split(" ");
            if (Integer.parseInt(peopleAges[1]) < 0) throw new IllegalArgumentException(); */

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            peopleList = null;
        }

        return peopleList;
    }
}
