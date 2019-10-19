package fundamentals;

import java.util.Random;

public class OptionalTask2 { //выполнены пункты 2 и 4
    public static void main(String[] args) {
        int dimension = Integer.parseInt(args[0]);
        int[][] matrix = new int[dimension][dimension];
        Random random = new Random();
        for (int i = 0; i < dimension; i++) { //Заполнение матрицы
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = random.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The largest amount of increasing numbers = " + findLongestLengthOfIncreasingSequence(matrix));
        System.out.println("\nMatrix without row and column with max value:");
        deleteRowAndCol(matrix);
    }

    private static int findLongestLengthOfIncreasingSequence(int[][] matrix) {
        int longestLengthOfIncreasingSequence = 1;
        int currentLengthOfIncreasingSequence = 1;
        int previousElem = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 0 && j == 0) continue;
                if (matrix[i][j] > previousElem && i != matrix.length-1 && j != matrix.length-1) {
                    currentLengthOfIncreasingSequence++;
                }
                else {
                    longestLengthOfIncreasingSequence = Math.max(longestLengthOfIncreasingSequence, currentLengthOfIncreasingSequence);
                    currentLengthOfIncreasingSequence = 1;
                }
                previousElem = matrix[i][j];
            }
        }
        return longestLengthOfIncreasingSequence;
    }

    private static void deleteRowAndCol(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length-1][matrix.length-1];
        int maxNum = Integer.MIN_VALUE;
        int iMaxNum = 0, jMaxNum = 0;
        for (int i = 0; i < matrix.length; i++) { //Поиск наибольшего значения матрицы
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maxNum) {
                    maxNum = matrix[i][j];
                    iMaxNum = i;
                    jMaxNum = j;
                }
            }
        }
        System.out.println("(max value = " + maxNum + ")");
        //Заполнение новой матрицы, удаление строки и столбца, содержащие максимальное значение (со сдвигом)
        int iNewMatrix = 0; //счётчик i для новой матрицы
        for (int i = 0; i < matrix.length; i++) {
            int jNewMatrix = 0;
            if (i == iMaxNum) continue; //если строка содержит максимальное значение, то мы её пропускаем
            for (int j = 0; j < matrix.length; j++) {
                if (j == jMaxNum) continue; //если столбец содержит максимальное значение, то мы его пропускаем
                newMatrix[iNewMatrix][jNewMatrix] = matrix[i][j];
                System.out.print(newMatrix[iNewMatrix][jNewMatrix] + " ");
                jNewMatrix++;
            }
            iNewMatrix++;
            System.out.println();
        }
    }
}
