public class Problem_35 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) { //744
        int left = 0;
        int right = nums.length-1;
        int answer=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid] >= target){
                answer=mid;
                right=mid-1;
            }
            else left=mid+1;
        }


        return answer;



    }
}
