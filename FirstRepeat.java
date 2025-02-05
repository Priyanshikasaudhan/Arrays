import java.util.ArrayList;
import java.util.Scanner;

public class FirstRepeat {
//    static int findIRepeat(int[] arr){
//
//        for (int i = 0; i < arr.length; i++)
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    return arr[i];
//
//                }
//            }
//        return -1;
//    }
    static int lastRepeat(int[] arr){
//        ArrayList<Integer> list = new ArrayList<Integer>();
        int ans = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    ans = arr[i];
                }
            }
        }
        return ans;
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
        System.out.println("First repeat value: "+ lastRepeat(arr));
    }
}
