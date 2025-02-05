public class Sum2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int[][] sum = new int[2][3];
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // sum[i][j] = arr[i][j] + arr2[i][j];
                sum+=arr[i][j];
            }
        }
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         // System.out.print(sum[i][j] + " ");
        //         System.out.print(sum + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println();
        System.out.println(sum);
    }
}
