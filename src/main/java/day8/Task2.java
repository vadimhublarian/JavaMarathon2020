package day8;

public class Task2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("Время выполнения: " + timeConsumedMillis + "ms");

        start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i <= 20000; i++) {
            str += i + " ";
        }
        System.out.println(str);
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("Время выполнения: " + timeConsumedMillis + "ms");
    }
}
