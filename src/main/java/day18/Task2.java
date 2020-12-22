package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237)); // 5
    }

    public static int count7(int n) {
        if (n < 10)
            if (n == 7) return 1;
            else return 0;

        int count = count7(n / 10) + count7(n % 10);
        return count;
    }
}
