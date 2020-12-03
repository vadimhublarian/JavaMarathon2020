package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8;
        int[][] arrayOfRandomInts = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrayOfRandomInts[i][j] = (int) (Math.random() * 51);
            }
        }

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arrayOfRandomInts[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println();

        int max = -1, index = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + arrayOfRandomInts[i][j];
                if (sum > max) {
                    max = sum;
                    index = i;
                }
            }
        }
        System.out.println(index);
    }
}
