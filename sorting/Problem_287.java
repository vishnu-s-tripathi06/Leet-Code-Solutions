package sorting;

import java.util.ArrayList;
import java.util.List;

public class Problem_287 {
    public static void main(String[] args) {
        int[] nums={};
        int answer=findDuplicate(nums);
        IO.println(answer);
    }

    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length){
            if(nums[i]!=i+1){
                int correct=nums[i]-1;
                if(nums[i] != nums[correct])  swap(nums,i,correct); 
                   

                else return nums[i];

             }
             else i++;
      
            }
            
            return -1;
        }
                 
    public static void swap(int[] nums,int i,int correct){
           int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
    
        }
    }

               
               
              
       
       

