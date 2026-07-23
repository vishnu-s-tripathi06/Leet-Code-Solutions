import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
         int[] arr={5, 1, 4 ,2, 8};
         sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int start=1;
        helper(arr,start,start);
    }
    private static void helper(int[] arr,int row,int col){
        if(row==arr.length) return;
        
        if(col > 0 && arr[col] < arr[col - 1]){
            swap(arr, col, col - 1);

            helper(arr, row, col-1);;
        }
        else{
            helper(arr, row+1, row+1);
        }
        }
    static void swap(int[] arr,int A, int B){
         int temp = arr[A];
            arr[A] = arr[B];
            arr[B] = temp;
    }
}
