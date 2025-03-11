package ru.sshibko;

public class MatrixDiagonalSum_1 {
    public int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[n - i - 1][i];
        }
        if (n % 2 == 1) {
            sum += matrix[n / 2][n / 2]; // for odd matrix size
        }

        return sum;
    }

/**    Дана квадратная матрица. Найти сумму элементов на ее диагонали.

    Пример:

    Input:
    matrix =
            [[1,2,3],
            [4,5,6],
            [7,8,9]]

    Output: 15
    Input:
    matrix =
            [[1,1,1,1],
            [1,1,1,1],
            [1,1,1,1],
            [1,1,1,1]]
    Output: 4
 */
}
