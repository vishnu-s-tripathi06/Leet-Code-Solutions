public class FloorInASortedArray {
    public static void main(String[] args) {
         int[] arr = {1, 2, 8, 10, 10, 12, 19};
         int x=5;
         int answer=findFloor(arr,x);
         System.out.println(answer);
    }
      public static int findFloor(int[] arr, int x) {
        // code here
        int answer=-1;
        int left=0;
        int right=arr.length-1;
        
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(arr[mid]<=x){
                answer=mid;
                left=mid+1;
            }
            else if(x < arr[mid]){
                right = mid - 1;
            }
          
        }
        return answer;
        
    }

}
