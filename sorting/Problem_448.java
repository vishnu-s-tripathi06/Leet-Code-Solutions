package sorting;

import java.util.ArrayList;
import java.util.List;

public class Problem_448 {
       public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> answer = findDisappearedNumbers(nums);
        System.out.println(answer);
    }
     public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
       
        List<Integer> arr = new ArrayList<>();

        while(i < nums.length){
            int correct=nums[i]-1;
            if(nums[i] <= nums.length && nums[i] != nums[correct]) swap(nums,i,correct); 
            else i++;  

             }

             for(int k=0;k < nums.length;k++){
                if(nums[k]!=k+1){
                    arr.add(k+1);
                }
            }
               
                 return arr;
              
    }
             
    public static void swap(int[] nums,int i,int correct){
       int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;

    }
}
