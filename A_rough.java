import java.util.Scanner;

public class A_rough {
    public static void main(String[] args) {
        int[] nums={9,8,7,6,5,4,3,2,1};
        
        int target=8;
        int answer=binarySearch(nums,target);
        System.out.println(answer);

    }
    public static int binarySearch(int[] nums,int target){
      
        int left=0;
        int right=nums.length-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(target==nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                left = mid + 1;
            }
            else if(target > nums[mid]){
                right = mid - 1;
            }
                
        }
        
        return -1;
    }
}
