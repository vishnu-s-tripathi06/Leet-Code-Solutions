public class Problem_704 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
       System.out.println(binarySearch(arr, 10));
    }
    static int binarySearch(int[] arr, int target){
      int n=arr.length-1;
      return helper(arr, target, 0, n);
    }
    static int helper(int[] arr,int target, int low,int high){
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==target) return mid;

        else if(arr[mid]>target) return helper(arr, target, low, mid-1);

        else return helper(arr,target,mid+1,high);
    }
}

