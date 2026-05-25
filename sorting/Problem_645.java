package sorting;

import java.util.List;

public class Problem_645 {
    public static void main(String[] args) {
          int[] nums={4,3,2,7,8,2,3,1};
        int[] answer=findErrorNums(nums);
        IO.println(answer);
    
    }
    public static int[] findErrorNums(int[] nums){
        int[] answer={-1,-1};
        int i=0;
       
       
        while(i < nums.length){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]) swap(nums,i,correct); 
            else i++;  

             }

             for(int k=0;k < nums.length;k++){
                if(nums[k]!=k+1){
                    answer[0]=nums[k];
                    answer[1]=k+1;
                }
            }
               
                 return answer;
        }
                 
    public static void swap(int[] nums,int i,int correct){
           int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
    }
}
