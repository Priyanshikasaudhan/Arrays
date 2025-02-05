public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] transpose = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] transposedArr = transpose(arr);
        for (int i = 0; i < transposedArr.length; i++) {
            for (int j = 0; j < transposedArr[0].length; j++) {
                System.out.print(transposedArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}