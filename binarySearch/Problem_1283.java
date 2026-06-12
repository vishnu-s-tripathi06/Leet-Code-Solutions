public class Problem_1283 {
    public static void main(String[] args) {
        int[] nums={};
        int k=0;
        System.out.println(smallestDivisor(nums, k));
    }


public static int smallestDivisor(int[] nums, int k) {
            
            int left=1;
            int right=findLargest(nums);
            int answer=right;
            
            while(left<=right){
                int mid=left+(right-left)/2;
                long total=0;
                for(int num: nums){
                    total+=Math.ceilDiv(num, mid);
                }
                if(total<=k) {
                    answer=mid;
                    right=mid-1;
                }
                else left=mid+1;    


            }
            return answer;
        }
         
    


    public static int findLargest(int[] arr){
        int max = arr[0]; 
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];  // 
                }
            }
            return max;
        }
}
