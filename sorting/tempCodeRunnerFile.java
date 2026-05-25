package sorting;

public class Problem_41 {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        int answer=firstMissingPositive(nums);
        System.out.println(answer);
    }
    public static int firstMissingPositive(int[] nums) {
    
        int i=0;
        int smallestPositive=nums[0];
       
        while(i < nums.length){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]) swap(nums,i,correct); 
            else i++;  

             }

             for(int k=0;k < nums.length;k++){
               
                if(nums[k]<smallestPositive && nums[k]>0){
                   smallestPositive=nums[k];
                }
            }
               
                 return smallestPositive;
        }
                 
    public static void swap(int[] nums,int i,int correct){
           int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
    }
}

