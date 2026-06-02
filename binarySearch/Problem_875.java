public class Problem_875 {
    public static void main(String[] args) {
        int[] piles={};
        int h=0;
        System.out.println(minEatingSpeed(piles, h));
    }
     public static int minEatingSpeed(int[] piles, int h) {
        int answer=0;
        int left=1;
        int right=findLargest(piles);
        while(left<=right){
            int mid=left+(right-left)/2;
            long hoursNeeded=0;
            for(int banana: piles){
                hoursNeeded+= Math.ceilDiv(banana,mid);
            }
            if(hoursNeeded<=h) {
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
