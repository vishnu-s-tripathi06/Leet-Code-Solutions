public class Problem_1 {
    public static void main(String[] args) {
        int[] array={2,3,4,5,6,7,8,9};
        int target=9;
        int[] answer=twoSum(array, target);
        for(int i: answer){
            System.out.println(i);
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                    return answer;
                }
            }
        }




        return answer;
    }
}
