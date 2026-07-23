public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7,5,3};
    }
    public static void sort(int[] arr){
        int n=arr.length-1;
        int idx=0;
        helper(arr,idx,n);
    }
    public static void helper(int[] arr, int idx,int n){
        if(idx==n) return;
        helper2(arr, n-idx-2, 0);
        helper(arr, idx+1, n);
    }
    public static void helper2(int[] arr,int k,int i){
        if(i>=k) return;
         if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        helper2(arr, k, i+1);
    }





}