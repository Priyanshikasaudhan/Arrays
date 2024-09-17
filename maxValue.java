public class maxValue {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = {1,5,3};
        for(int i=0;i<arr.length;i++){
            // if (max<arr[i]) {
            //      max= arr[i];
            // }
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println();
        // System.out.println("Max = "+ max);
        System.out.println("Min = "+ min);
    }
}
