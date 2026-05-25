public class Problem_81 {
    public static void main(String[] args) {
        int[] nums={};
        int target=9;
        if(search(nums, target)) IO.println("Found.");
        else IO.println("Not Found.");
    }
    public static boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
    
     while(left<=right){
        int mid=left+(right-left)/2;

        if(target==nums[mid]) return true;
        else if(nums[left]==nums[mid] && nums[mid]==nums[right]){
            left++;
            right--;
        }
        else if(nums[left]<=nums[mid]){
            if(target<nums[mid] && target>=nums[left]) right=mid-1;  
            else left=mid+1;
        }
        else{

            if(target>nums[mid] && target<=nums[right])left=mid+1;
            else right=mid-1;
            
        }
      
    }
      return false;
    }
}

