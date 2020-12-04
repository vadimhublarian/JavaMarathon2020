package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8;
        int[][] arrayOfRandomInts = new int[m][n];

        for (int i = 0; i < arrayOfRandomInts.length; i++) {
            for (int j = 0; j < arrayOfRandomInts[i].length; j++) {
                arrayOfRandomInts[i][j] = (int) (Math.random() * 51);
                //System.out.print(arrayOfRandomInts[i][j] + "\t");
            }
            //System.out.println();
        }

        int max = -1, index = 0;
        for (int i = 0; i < arrayOfRandomInts.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrayOfRandomInts[i].length; j++) {
                sum += arrayOfRandomInts[i][j];
            }
            if (sum >= max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
