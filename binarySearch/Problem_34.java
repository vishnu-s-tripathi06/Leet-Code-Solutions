class problem_34{
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target=8;
        int[] answer=searchRange(nums, target);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] answer={-1,-1};
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                answer[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(answer[0]!=-1){
            start=answer[0];
        }
        else{
            answer[1]=-1;
            return answer;
        }
        end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                answer[1]=mid;
                start=mid+1;
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