import java.util.Scanner;
public class Max2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] > max) {
                    max = arr1[j];
                }
            }
        }

        System.out.println("Max: " + max);
    }
}
