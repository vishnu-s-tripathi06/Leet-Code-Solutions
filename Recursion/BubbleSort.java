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
    //call it as sort2(arr,arr.length-1,0);
    public static void sort2(int[] arr,int row,int col){
        //entire array is sorted 
        if(row == 0) return;
        //we're inside the current pass
        if(col < row){
             if (arr[col] > arr[col + 1]) {
            int temp = arr[col];
            arr[col] = arr[col + 1];
            arr[col + 1] = temp;
        }
        sort2(arr, row, col+1);
        }
        else{
            //one pass is complete 
            //start next pass
            sort2(arr, row-1, col);
        }
        
    }
}