import java.util.Scanner;

public class SecMaximum {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int secMax(int[] arr){
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secmax=findMax(arr);
        return secmax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n + " Elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Max value is: "+secMax(arr));
    }
}
