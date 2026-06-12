public class PrintArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,5,4,3,2,5,65,76,432};
        printArr(arr);
    }

    public static void printArr(int[] arr){
        int i=0;
        helperArr(arr,i);
    }
    static void helperArr(int[] arr, int i){
        if(i==arr.length) return;
      
        helperArr(arr, i+1);
        System.out.print(arr[i]+" ");
    }


}
