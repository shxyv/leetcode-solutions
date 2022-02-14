package Submissions;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    result += mat[i][j];
                }
                if ((i + j) == (mat.length - 1) && i != j) {
                    result += mat[i][j];
                }
            }
        }
        return result;
    }
}
