public class CheckSorted {
    public static void main(String[] args) {
        int[] arr={3,4,5,61,2,9};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {
        if(arr.length==0 || arr.length==1) return true;
        int idx=0;
        return helper(arr,idx);
    }
    static boolean helper(int[] arr,int idx){
        if(idx==arr.length-2) return true;
        if(arr[idx]>arr[idx+1]) return false;
        return helper(arr, idx+1);
    }
        
}

