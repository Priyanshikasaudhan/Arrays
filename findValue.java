public class findValue {
    public static int findVal(int arr[],int x)
    {
        // int arr[] = {1,2,3,10,4,5,11,14};
        // int x= 11;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
             
        }
        return -1;
    }   
     public static void main(String[] args) {
        int arr[] = {1,2,3,4,11,5,6,7,8,11,10,11};
         int a = findVal(arr,11);
         System.out.println();
         System.out.println("Find Value : " + a);
    }
}
