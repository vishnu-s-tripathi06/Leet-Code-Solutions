package sorting;

public class Problem_268 {
    public static void main(String[] args) {
        int[] nums={};
        int answer=missingNumber(nums);
        System.out.println(answer);
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        int correct=0;
        while(i < nums.length){
            correct=nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]) swap(nums,i,correct); 
            else i++;  
             }

             for(int k=0;k < nums.length;k++){
                if(nums[k]!=k) return k;
               
                }
                 return nums.length;
              
    }
             
    public static void swap(int[] nums,int i,int correct){
       int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;

    }
}
