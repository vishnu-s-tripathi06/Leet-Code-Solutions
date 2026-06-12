public class Problem_11 {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};

    }
    public static int maxArea(int[] height){
        int maxArea=0;
        int left=0 , right=height.length-1;
       
        while(left < right){
            int currentArea=0;
            int width=right-left;
       
            if(height[left] < height[right]){
                currentArea=height[left] * width;
                if(currentArea > maxArea) maxArea=currentArea;  
                left++;
            }
            else{
                currentArea=height[right] * width;
                if(currentArea > maxArea) maxArea=currentArea;
                right--;

            }
        }
        return maxArea;

    }
}

                
              
                    
                
          






