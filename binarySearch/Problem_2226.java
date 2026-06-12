public class Problem_2226 {
    public static void main(String[] args) {
        int[] candies={};
        long k=0;
    }
      public static int maximumCandies(int[] candies, long k) {
            int answer=0;
            int left=1;
            int right=findLargest(candies);
            if(Sum(candies)<k) return 0;
    
            while(left<=right){
                int mid=left+(right-left)/2;
                long childrenServed=0;
                for(int candy: candies){
                
                    childrenServed+=Math.floorDiv(candy,mid);
                }
            
                
                if(childrenServed >= k) {

                    answer=mid;
                    left=mid+1;

                }
            
                else if(childrenServed < k)         right=mid-1;


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
    public static long Sum(int[] arr){
        long sum=0;
        for(long i: arr){
                sum+=i;
                }
        return sum;

    }
}