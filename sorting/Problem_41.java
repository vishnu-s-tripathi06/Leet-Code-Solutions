package sorting;

public class Problem_41 {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        int answer=firstMissingPositive(nums)   
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i < nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length  && nums[i] != nums[correct]) swap(nums,i,correct); 
            else i++;  

             }

             for(int k=0;k < nums.length;k++){
                 if(nums[k]!=k+1){
                    return k+1;
                 }
             }
               
               
                 return nums.length+1;
        }
    
                 
    public static void swap(int[] nums,int i,int correct){
           int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
    }
}
       
       

