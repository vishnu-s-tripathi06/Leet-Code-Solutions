public class Problem_42 {
        public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        int answer=waterProduct(nums);
        System.out.println(answer);
    }
      public static int waterProduct(int[] height) {
        int water=0;
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        while(left < right){
            if(height[left]<height[right]){ 
                if(height[left]>=leftMax) leftMax=height[left];
                else water += leftMax - height[left];

                left++;
            }
           
            else{
                if(height[right]>=rightMax) rightMax=height[right];
                else water+=rightMax-height[right];
                 right--;
            }
           
        }
        
        return water;
      }
}
           


