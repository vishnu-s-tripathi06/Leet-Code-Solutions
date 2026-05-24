public class Problem_1539 {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int k=5;
        int answer=findKthPositive(arr, k);
        System.out.println("missing number is: "+answer);
    }
     public static int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;   
        
        while(start<=end){
            int mid=start+(end-start)/2;
            int correct=mid+1;
            int missing = arr[mid]-correct;
            if(missing >= k) end=mid-1;
            else if(missing < k) start=mid+1;
       
        }
        return end+1+k;
    }
}
