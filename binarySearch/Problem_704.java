public class Problem_704{
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int target=7;
        int answer=search(arr, target);
        System.out.println(answer);

    }
    public static int search(int[] nums, int target) {
        int answer=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                answer=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
         return answer;
    }
}