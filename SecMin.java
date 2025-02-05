import java.util.Scanner;

public class SecMin {
    static int findMin(int[] arr){
        int min= Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
    static int findSecMin(int[] arr){

        int min = findMin(arr);
        for (int i=0; i<arr.length; i++){
            if (arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int sec = findMin(arr);
        return sec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum Value : "+findSecMin(arr));
    }
}
