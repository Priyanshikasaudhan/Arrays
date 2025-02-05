public class RowWiseAndColWise {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

        // Print the array row-wise
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Print the array column-wise
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Transpose using another array
        int[][] transpose = new int[3][2]; // Transpose should be 3x2

        for (int i = 0; i < 3; i++) { // Loop over columns of original
            for (int j = 0; j < 2; j++) { // Loop over rows of original
                transpose[i][j] = arr[j][i]; // Swap row and column
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}