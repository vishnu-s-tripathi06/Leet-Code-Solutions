public class Problem_2529 {
    public static void main(String[] args) {
        int[] nums={-2,-1,-1,1,2,3};
        int answer=maximumCount(nums);
        System.out.println(answer);

    }

    public static int maximumCount(int[] nums) {
        int max=0;
        int pos=nums.length;
        int neg=0;  
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(nums[mid]>=1){
                pos=mid;
                right=mid-1;
            }
            else if(nums[mid]<1){
                left = mid+1;
            }
        }
        left=0;
        right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(nums[mid]<=-1){
                neg=mid+1;
                left=mid+1;
       
            }
            else if(nums[mid]>-1){
                right = mid-1;
            }
        }
        pos=nums.length-pos;
       
        if(pos>neg){
            max=pos;
        }
        else if(pos==neg){
            max=pos;
        }
        else{
            max=neg;
        }
        
           
                
        

        return max;
        
    }

   
}
