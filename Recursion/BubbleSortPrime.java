import java.util.Arrays;

public class BubbleSortPrime {
    public static void main(String[] args) {
        int[] arr={5, 1, 4 ,2, 8};
        sort2(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
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
            sort2(arr, row-1, 0);
        }
        
    }
}
